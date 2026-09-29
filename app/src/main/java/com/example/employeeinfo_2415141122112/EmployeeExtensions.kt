package com.example.employeeinfo_2415141122112

import java.text.NumberFormat
import java.util.Locale

// Extension 1: Đánh giá xếp loại dựa trên thâm niên công tác (Mục 6.5)
fun Int.toSeniorityLevel(): String = when {
    this >= 5 -> "Nhân viên Lâu năm / Chuyên gia"
    this >= 2 -> "Nhân viên Chính thức"
    else -> "Nhân viên Mới / Thử việc"
}

// Extension 2: Định dạng hiển thị lương tiền tệ chuẩn VNĐ (Mục 6.2)
fun Double.toFormattedSalary(): String {
    val formatter = NumberFormat.getCurrencyInstance(Locale("vi", "VN"))
    return formatter.format(this * 1_000_000)
}

// Extension 3: So sánh mức lương với Lương chuẩn (Ví dụ Lương chuẩn 15 triệu) (Mục 6.1)
fun Double.compareWithBaseSalary(baseSalary: Double = 15.0): String {
    return if (this >= baseSalary) {
        "Cao hơn / Đạt mức lương chuẩn (${baseSalary}M)"
    } else {
        "Thấp hơn mức lương chuẩn (${baseSalary}M)"
    }
}

// Extension 4: Định dạng tên viết hoa (Mục 6.3)
fun String.toUpperName(): String = this.uppercase()
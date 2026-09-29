package com.example.employeeinfo_2415141122112

import java.text.NumberFormat
import java.util.Locale


fun Int.toSeniorityLevel(): String = when {
    this >= 5 -> "Nhân viên Lâu năm / Chuyên gia"
    this >= 2 -> "Nhân viên Chính thức"
    else -> "Nhân viên Mới / Thử việc"
}


fun Double.toFormattedSalary(): String {
    val formatter = NumberFormat.getCurrencyInstance(Locale("vi", "VN"))
    return formatter.format(this * 1_000_000)
}


fun Double.compareWithBaseSalary(baseSalary: Double = 15.0): String {
    return if (this >= baseSalary) {
        "Cao hơn / Đạt mức lương chuẩn (${baseSalary}M)"
    } else {
        "Thấp hơn mức lương chuẩn (${baseSalary}M)"
    }
}


fun String.toUpperName(): String = this.uppercase()
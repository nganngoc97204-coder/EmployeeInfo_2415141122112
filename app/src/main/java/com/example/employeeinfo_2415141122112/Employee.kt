package com.example.employeeinfo_2415141122112

// Model lưu trữ thông tin nhân viên theo yêu cầu đề bài
data class Employee(
    val id: String,          // Mã nhân viên
    val name: String,        // Họ tên
    val department: String,  // Phòng ban
    val age: Int,            // Tuổi
    val salary: Double,      // Lương (triệu VNĐ)
    val gender: String,      // Giới tính
    val experience: Int      // Thâm niên (năm)
)
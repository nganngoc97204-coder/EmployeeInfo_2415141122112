package com.example.employeeinfo_2415141122112

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.employeeinfo_2415141122112.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val employee = Employee(
            id = "NV2415141122112",
            name = "Hoang Ngan",
            department = "Phòng Công Nghệ Thông Tin",
            age = 24,
            salary = 18.5, // 18.5 triệu
            gender = "Nữ",
            experience = 3 // 3 năm thâm niên
        )


        with(binding) {
            tvName.text = "Họ và tên: ${employee.name.toUpperName()}"
            tvEmployeeId.text = "Mã NV: ${employee.id}"
            tvDepartment.text = "Phòng ban: ${employee.department}"
            tvAgeGender.text = "Tuổi: ${employee.age} | Giới tính: ${employee.gender}"
            tvSeniority.text = "Thâm niên: ${employee.experience} năm (${employee.experience.toSeniorityLevel()})"
            tvSalary.text = "Mức lương: ${employee.salary.toFormattedSalary()}"
            tvSalaryCompare.text = "Đánh giá lương: ${employee.salary.compareWithBaseSalary(15.0)}"
        }
    }
}
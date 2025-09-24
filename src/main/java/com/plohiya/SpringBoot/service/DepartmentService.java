package com.plohiya.SpringBoot.service;

import com.plohiya.SpringBoot.entity.Department;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> getAllDepartments();

    public Department departmentById(Long departmentId);

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartmentById(Long departmentId, Department department);

    public Department getDepartmentByName(String departmentName);
}

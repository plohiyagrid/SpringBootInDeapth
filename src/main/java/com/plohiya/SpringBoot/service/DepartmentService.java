package com.plohiya.SpringBoot.service;

import com.plohiya.SpringBoot.entity.Department;
import com.plohiya.SpringBoot.error.DepeartmentNotFoundException;

import java.util.List;

public interface DepartmentService {

    public Department saveDepartment(Department department);

    public List<Department> getAllDepartments();

    public Department departmentById(Long departmentId) throws DepeartmentNotFoundException;

    public void deleteDepartmentById(Long departmentId);

    public Department updateDepartmentById(Long departmentId, Department department);

    public Department getDepartmentByName(String departmentName);
}

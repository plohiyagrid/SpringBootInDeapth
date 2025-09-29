package com.plohiya.SpringBoot.controller;

import com.plohiya.SpringBoot.entity.Department;
import com.plohiya.SpringBoot.error.DepeartmentNotFoundException;
import com.plohiya.SpringBoot.service.DepartmentService;
import com.plohiya.SpringBoot.service.DepartmentServiceImp;
import jakarta.validation.Valid;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.List;

@RestController
public class DepartmentController {

    @Autowired
    private DepartmentService departmentService;

    private static final Logger LOGGER = LoggerFactory.getLogger(DepartmentController.class);
    @PostMapping("/departments")
    public Department saveDepartment(@Valid @RequestBody Department department){
        LOGGER.info("Inside saveDepartment of DepartmentController");
        return departmentService.saveDepartment(department);
    }

    @GetMapping("/departments")
    public List<Department> fetchAllDepartments(){
        LOGGER.info("Inside getDepartment of DepartmentController");
        return departmentService.getAllDepartments();
    }

    @GetMapping("/departments/{id}")
    public Department fetchAllDepartmentById(@PathVariable("id") Long departmentId) throws DepeartmentNotFoundException {
        LOGGER.info("Inside getDepartmentById of DepartmentController");
        return departmentService.departmentById(departmentId);
    }

    @DeleteMapping("/departments/{id}")
    public String deleteDepartmentById(@PathVariable("id") Long departmentId){
        LOGGER.info("Inside deleteDepartmentById of DepartmentController");
        departmentService.deleteDepartmentById(departmentId);
        return "Department Deleted Successfully!!";

    }

    @PutMapping("/departments/{id}")
    public Department updateDepartment(@PathVariable("id") Long departmentId ,
                                       @RequestBody Department department){
        LOGGER.info("Inside updateDepartment of DepartmentController");
        return departmentService.updateDepartmentById(departmentId , department);
    }

    @GetMapping("/departments/name/{name}")
    public Department fetchDepartmentByName(@PathVariable("name") String departmentName){
        LOGGER.info("Inside getDepartmentByName of DepartmentController");
        return  departmentService.getDepartmentByName(departmentName);
    }

}

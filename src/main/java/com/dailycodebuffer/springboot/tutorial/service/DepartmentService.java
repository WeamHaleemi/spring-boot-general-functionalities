package com.dailycodebuffer.springboot.tutorial.service;

import com.dailycodebuffer.springboot.tutorial.entity.Department;

import java.util.List;

public interface DepartmentService{
   public Department saveDepartment(Department department);

   public List<Department> fetchDepartmentList();

   public Department fetchDepartmentById(long departmentId);

   public void deleteDepartmentById(long departmentId);

   public Department updateDepartment(long departmentId, Department department);

   public Department fetchDepartmentByName(String departmentName);
}

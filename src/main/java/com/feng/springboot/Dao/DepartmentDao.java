package com.feng.springboot.dao;

import com.feng.springboot.pojo.Department;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
@Mapper
public interface DepartmentDao {

    public List<Department> getDepartments();

    public Department getDepartmentById(Integer dId);
}

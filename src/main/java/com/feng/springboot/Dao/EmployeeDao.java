package com.feng.springboot.dao;

import com.feng.springboot.pojo.Employee;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
@Repository
public interface EmployeeDao {
    //查询全部员工
    public List<Employee> getEmployees();
    //添加员工
    public void add(Employee employee);
    //根据id查询员工
    public Employee getEmployeeById(Integer eid);

}

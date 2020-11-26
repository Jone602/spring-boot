package com.feng.springboot.Dao;

import com.feng.springboot.pojo.Department;
import com.feng.springboot.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.lang.annotation.ElementType;
import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

@Repository
public class EmployeeDao {
    //模拟数据
    private static Map<Integer,Employee> employees = null;
    @Autowired
    private DepartmentDao departmentDao;

    static {
        employees = new HashMap<Integer,Employee>();
        employees.put(1001,new Employee(1001,"AA","602950602@163.com",1,new Department(1001,"教学部")));
        employees.put(1002,new Employee(1002,"BB","602950602@163.com",0,new Department(1002,"市场部")));
        employees.put(1003,new Employee(1003,"CC","602950602@163.com",1,new Department(1003,"教研部")));
        employees.put(1004,new Employee(1004,"DD","602950602@163.com",0,new Department(1004,"运营部")));
        employees.put(1005,new Employee(1005,"EE","602950602@163.com",1,new Department(1005,"后勤部")));
    }
    //查询全部员工
    public Collection<Employee> getEmployees(){
        return employees.values();
    }
    private static Integer initId = 1006;
    //增加员工
    public void add(Employee employee){
        if (employee.getEId()==null){
            employee.setEId(initId++);
        }
        employee.setDepartment(departmentDao.getDepartmentById(employee.getDepartment().getDId()));
        employees.put(employee.getEId(),employee);
    }
    //根据ID查询员工
    public Employee getEmployeeById(Integer id){
        Employee employee = employees.get(id);
        return employee;
    }

}

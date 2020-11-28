package com.feng.springboot.controller;
import com.feng.springboot.dao.DepartmentDao;
import com.feng.springboot.dao.EmployeeDao;
import com.feng.springboot.pojo.Department;
import com.feng.springboot.pojo.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.List;

@Controller
public class EmployeeController {

    @Autowired
    EmployeeDao employeeDao;
    @Autowired
    DepartmentDao departmentDao;

    @RequestMapping("/emps")
    public String getEmployees(Model model){
        List<Employee> employeeList = employeeDao.getEmployees();
        for (Employee employee : employeeList) {
            System.out.println(employee);
        }
        model.addAttribute("emps",employeeList);
        return "/emp/list";
    }

    @RequestMapping("/toadd")
    public String toadd(Model model){
        List<Department> department = departmentDao.getDepartments();
        System.out.println("==============="+department);
        model.addAttribute("department",department);
        return "/emp/toadd";
    }

    @RequestMapping("/add")
    public String add(Employee employee){
        System.out.println("======================>"+employee);
        employeeDao.add(employee);
        return "redirect:/emps";
    }

    @GetMapping("/toupdate/{id}")
    public String toupdate(@PathVariable("id") Integer id, Model model){
        Employee employee = employeeDao.getEmployeeById(id);
        model.addAttribute("employee",employee);
        List<Department> department = departmentDao.getDepartments();
        model.addAttribute("department",department);
        return "/emp/toupdate";
    }
}

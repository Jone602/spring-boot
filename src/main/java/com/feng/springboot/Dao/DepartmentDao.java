package com.feng.springboot.Dao;

import com.feng.springboot.pojo.Department;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;
@Repository
public class DepartmentDao {
    //模拟数据
    private static Map<Integer,Department> departments = null;
    static {
        departments = new HashMap<Integer,Department>();
        departments.put(1001,new Department(1001,"教学部"));
        departments.put(1002,new Department(1002,"市场部"));
        departments.put(1003,new Department(1003,"教研部"));
        departments.put(1004,new Department(1004,"运营部"));
        departments.put(1005,new Department(1005,"后勤部"));
    }

    public Collection<Department> getDepartments(){
        return departments.values();
    }
    public Department getDepartmentById(Integer id){
        return departments.get(id);
    }


}

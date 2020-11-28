package com.feng.springboot.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;
@Data
@NoArgsConstructor
public class Employee {
    private Integer eId;
    private String eName;
    private String email;
    private Integer gender;
    private Date birth;
    private Integer department;
    private Department eDepartment;// 冗余设计

    public Employee(Integer eId, String eName, String email, Integer gender, Date birth,Integer department,  Department eDepartment) {
        this.eId = eId;
        this.eName = eName;
        this.email = email;
        this.gender = gender;
        this.birth = birth;
        this.department = department;
        this.eDepartment = eDepartment;
    }
}

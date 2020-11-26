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
    private Department department;
    private Date birth;

    public Employee(Integer eId, String eName, String email, Integer gender, Department department) {
        this.eId = eId;
        this.eName = eName;
        this.email = email;
        this.gender = gender;
        this.department = department;
        this.birth = new Date();
    }
}

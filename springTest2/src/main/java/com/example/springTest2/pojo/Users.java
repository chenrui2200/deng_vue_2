package com.example.springTest2.pojo;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class Users {
    @Id
    private Integer id;
    private String name;
    private Integer age;

    private String password;

    // getter和setter方法
}

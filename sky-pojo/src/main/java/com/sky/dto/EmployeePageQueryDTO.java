package com.sky.dto;

import lombok.Data;

import java.io.Serializable;
// 前端提交分页查询请求的接收对象
@Data
public class EmployeePageQueryDTO implements Serializable {

    //员工姓名
    private String name;

    //页码
    private int page;

    //每页显示记录数
    private int pageSize;

}

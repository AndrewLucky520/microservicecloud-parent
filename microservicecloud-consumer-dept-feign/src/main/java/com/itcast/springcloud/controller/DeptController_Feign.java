package com.itcast.springcloud.controller;

import com.itcast.springcloud.entity.Dept;
import com.itcast.springcloud.service.DeptClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
public class DeptController_Feign {
    @Autowired
    private DeptClientService deptClientService;

    @PostMapping("/consumer/dept/add")
    public boolean add(Dept dept){
        return deptClientService.add(dept);
    }

    @GetMapping("/consumer/dept/get/{id}")
    public Dept get(@PathVariable("id") Long id){
        return deptClientService.get(id);
    }

    @GetMapping("/consumer/dept/list")
    public List<Dept> list(){
        return deptClientService.list();
    }
}

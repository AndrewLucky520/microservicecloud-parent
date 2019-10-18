package com.itcast.springcloud.dao;

import com.itcast.springcloud.entity.Dept;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;

/**
 * @program:microservicecloud-parent
 * @Description:
 * @Author: kaiqiang_qin
 * @Date: 2019-09-29 15:10:09
 */
@Mapper
public interface DeptDao  {

    public boolean addDept(Dept dept);

    public Dept findById(Long id);

    public List<Dept> findAll();
}

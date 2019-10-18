package com.itcast.springcloud.service.impl;

import com.itcast.springcloud.dao.DeptDao;
import com.itcast.springcloud.entity.Dept;
import com.itcast.springcloud.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.List;

/**
 * @program:microservicecloud-parent
 * @Description:
 * @Author: kaiqiang_qin
 * @Date: 2019-09-29 15:26:31
 */
@Service
public class DeptServiceImpl implements DeptService {

    @Autowired
    private DeptDao deptDao;

    @Transactional
    @Override
    public boolean add(Dept dept) {
        return deptDao.addDept(dept);
    }

    @Override
    public Dept get(Long id) {
        return deptDao.findById(id);
    }

    @Override
    public List<Dept> list() {
        return deptDao.findAll();
    }
}

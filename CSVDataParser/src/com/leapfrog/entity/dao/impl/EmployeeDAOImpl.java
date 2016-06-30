/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.entity.dao.impl;

import com.leapfrog.entity.Employee;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BkoNod
 */
public class EmployeeDAOImpl implements EmployeeDAO {
List<Employee> list=new ArrayList<>();
    @Override
    public void addData(Employee e) {
      list.add(e);
    }

    @Override
    public List<Employee> getAll() {
    return list;
    }

}

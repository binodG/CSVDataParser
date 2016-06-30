/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog.entity.dao.impl;

import com.leapfrog.entity.Employee;
import java.util.List;

/**
 *
 * @author BkoNod
 */
public interface EmployeeDAO {
   void addData(Employee e);
   List<Employee>getAll();
}

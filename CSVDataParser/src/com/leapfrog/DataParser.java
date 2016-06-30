/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.leapfrog;


import Helper.FileHelper;
import com.leapfrog.entity.Employee;
import com.leapfrog.entity.dao.impl.EmployeeDAO;
import com.leapfrog.entity.dao.impl.EmployeeDAOImpl;
import com.leapfrog.validation.DataValidation;
import com.leapfrog.validation.ValidationFactory;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
/**
 *
 * @author BkoNod
 */
public class DataParser {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        BufferedReader reader=null;
        try {
            String filename="H:\\employee.csv";
            reader = new BufferedReader(new FileReader(filename));
            String line="";
            EmployeeDAO empDao=new EmployeeDAOImpl();
           
            while((line=reader.readLine())!=null)
            {
              String[] tokens=line.split(",");
              DataValidation obj=ValidationFactory.getInstance("validData");
              boolean check=obj.check(tokens);
              System.out.println(check);
                 
              if(check)
              {
                 Employee emp=null;
                 if(tokens[4].equals("1"))
                 emp=new Employee(Integer.parseInt(tokens[0]),tokens[1],tokens[2],tokens[3],true);
                 empDao.addData(emp);
                  
                  
                 
              }
              else
              {
               BufferedWriter writer=new BufferedWriter(new FileWriter("H:\\BrokenFile.csv"));
               writer.append(line);
              }
             
              
            }
            
      FileHelper.writer("H:\\ValidEmployee.csv", empDao.getAll());
      } catch (IOException ex) {
      
            System.out.println(ex.getMessage());
        } 
    }
    
}

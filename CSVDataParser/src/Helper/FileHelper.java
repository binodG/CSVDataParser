/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Helper;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import com.leapfrog.entity.Employee;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author BkoNod
 */
public class FileHelper {
    
   
    
    public static void writer(String filepath,List<Employee> data) throws IOException
    {
      try{
        BufferedWriter writer=new BufferedWriter(new FileWriter(filepath));
       for(Employee emp:data)
       {
         String line=""+emp.getId()+","+emp.getFirstName()+","+emp.getLastName()+","+emp.getEmail()+","+emp.isB();
         writer.append(line+"\r\n");
       }
       writer.close();
      }catch(IOException ex)
      {
          System.out.println(ex.getMessage());
      }
    
    
    }
    
}

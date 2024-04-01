package com.JBK.Taskmanagement;


import org.hibernate.Session;  
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class LoginC
{
	@Autowired
	SessionFactory factory;
	
	
 @RequestMapping("login")
  public String login()
  {
	  return "hello_woldss";
  }
 
 @RequestMapping("save")
 public String saveEmployee(@RequestBody Employee employee)
 {
	 Session session=factory.openSession();
	 Transaction tx= session.beginTransaction();
	 
	 session.save(employee);
	 tx.commit(); 
	 
	 return "Data Saved";
 }
 
 

 @RequestMapping("Update")
 public String UpdateEmployee(@RequestBody Employee employee)
 {
	 Session session=factory.openSession();
	
	 Transaction tx= session.beginTransaction();
	 
	 session.update(employee);
	 tx.commit(); 
	 
	 return "Data Update";
 }
 

 @RequestMapping("delete/{eid}")
 public String deleteEmployee(@PathVariable int eid)
 {
	 Session session=factory.openSession();
 
	 Employee employee=session.load(Employee.class, eid);
	 
	 Transaction tx= session.beginTransaction();
	 
	 session.delete(employee);
	 tx.commit(); 
	 
	 return "Data Delete";
 }
 
 
	
}

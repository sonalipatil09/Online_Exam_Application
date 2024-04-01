/*package com.JBK.Taskmanagement;

import java.util.List;
	import org.hibernate.Criteria;
	import org.hibernate.Session;
	import org.hibernate.SessionFactory;
	import org.hibernate.Transaction;
	import org.springframework.beans.factory.annotation.Autowired;
	import org.springframework.stereotype.Controller;
	import org.springframework.ui.Model;
	import org.springframework.web.bind.annotation.RequestMapping;
	import org.springframework.web.servlet.ModelAndView;



	@Controller
	public class TaskController {
		
		@Autowired
		SessionFactory factory;

		@RequestMapping("sample")
		public String sample()
		{
			return "sample";
		}
		
		@RequestMapping("saveToDB")
		public ModelAndView saveToDB(Tasks tasks)
		{
			System.out.println("in save to db ");
			ModelAndView modelAndView = new ModelAndView();
			
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();	
			session.save(tasks);
			tx.commit();
			
			modelAndView.addObject("message","successfully stored");
			modelAndView.setViewName("sample");
			return modelAndView;			
		}
		
		@RequestMapping("deletetask")
		public ModelAndView deletetask(int taskno)
		{
			ModelAndView modelAndView = new ModelAndView();
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
				
			Tasks tasks = session.load(Tasks.class, taskno);
			System.out.println(tasks);
			
			session.delete(tasks);
			tx.commit();
			
			
			modelAndView.addObject("message","Record Deleted ");
			modelAndView.setViewName("sample");
			
			return modelAndView;
		}
		
		@RequestMapping("updateTasks")
		public ModelAndView updateTask(Tasks tasks)
		{
			ModelAndView modelAndView = new ModelAndView();
			Session session = factory.openSession();
			Transaction tx = session.beginTransaction();
			//Tasks tasks1 = session.load(Tasks.class, tasks);
			System.out.println(tasks);
			
				session.update(tasks);
				tx.commit();
	
			modelAndView.addObject("message"," Record updated ");
			modelAndView.setViewName("sample");
			
			return modelAndView;
		}
}

*/

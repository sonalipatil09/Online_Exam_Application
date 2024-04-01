package com.JBK.Taskmanagement;

	import javax.persistence.Entity;
	import javax.persistence.Id;

	@Entity
	public class Tasks {

		@Id
		int taskno;
		String duedate;
		int priority;
		String status;
		
		
		public int getTaskno() {
			return taskno;
		}
		public void setTaskno(int taskno) {
			this.taskno = taskno;
		}
		public String getDuedate() {
			return duedate;
		}
		public void setDuedate(String duedate) {
			this.duedate = duedate;
		}
		public int getPriority() {
			return priority;
		}
		public void setPriority(int priority) {
			this.priority = priority;
		}
		public String getStatus() {
			return status;
		}
		public void setStatus(String status) {
			this.status = status;
		}
		@Override
		public String toString() {
	 return "Tasks [taskno=" + taskno + ", duedate=" + duedate + ", priority=" + priority + ", status=" + status+ "]";
		}		
	}


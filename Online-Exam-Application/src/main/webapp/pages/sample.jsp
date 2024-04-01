<html>
	<head>
	<h1> Task Management System </h1><br><br>

	<style >
	    
	       h1{
	          text-align: center;text-decoration: underline;
	       }
	       h3{
	          text-decoration: blink;
	       }
			input,select
					{
							padding:10px;
					}
					
					form{
					        text-align: center;
					        width: 400px;
						    margin: 0 auto;
						    padding: 20px;
						    border: 2px solid #ccc;
						    background-color: pink;	
					}
					.btn{
					
						background-color:  #42f5f5;
						width: 100px;
					}
					</style>
	</head>
	<body>

	<form action="">
	   <input type="number" name = "taskno" placeholder="Enter Task Nubmer"><br><br>
	   
	   <input type="text" name = "duedate" placeholder="Enter(dd-mm-yyyy)"><br><br>
	    
	   <input type="text" name = "priority" placeholder="Enter Priority"><br><br>
	     
	   <input type="text" name = "status" placeholder="Enter Status"><br><br>
	   
	   <input type="submit" value="create" formaction="saveToDB" formmethod="post" class="btn">
	   
	   <input type="submit" value="delete" formaction="deletetask" formmethod="post" class="btn">
	  
	    <input type="submit" value="update" formaction="updateTasks" formmethod="post" class="btn">
	  
	   
	  </form> 

	</body>

	<h3>   ${message} </h3>
</html>



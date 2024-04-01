<html>
<head>
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
				body{
				    background-color: pink;
					margin: 0px;
					padding: 0px;

				}
				form{			
				        text-align: center;
				        width: 400px;
					    height: 400px;
					    margin: 65px 400px 65px 400px;
					    padding: 30px;
					    border: 2px solid #ccc;
					    background-color: teal;	
				}
                    form.div{
					text-align: center;	
					height: 500px;
					width: 350px;
					padding: 10px;
				 }


				.btn{
				
					background-color: #72fffb;
					width: 100px;
				}
				</style>
	
</script>
</head>
<body>
	<span style="color:red">  ${message} </span>
</center>		
<form>

<h1 style="text-align: center;color:white;margin-bottom:100px;"> Online Exam Login </h1>
<div id="maincontent">

	<input type="text" name="username" placeholder="Enter username"> <br><br>
	
	<input type="password" name="password" placeholder="Enter password"> <br><br>
	
	
	<select name="subject"> 
			
		<option>select subject</option>
		<option>java</option>
		<option value="gk">general knowldge</option>
		
	</select>
	
	<br><br>
	
	
	<input type="submit" value='sign in' formaction="validate" formmethod="post" class="btn">
	
    <input type="submit" value='sign up' formaction="register" class="btn">
    
    
</div>		

</form>

</body>

</html>
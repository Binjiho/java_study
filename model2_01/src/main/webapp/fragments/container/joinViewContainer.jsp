<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<div class="container">
	<div class="joinView">
		<div class="joinView-con">
			<div class="join-form">
			 <form action="joinOk.do" method="post" id="joinForm">			 
			 	<div class="form-con">			 	
				 	<ul>
				 		<li>
				 			<h1>Sing Up</h1>
				 		</li>
				 		<li>
				 			<label for="email">email</label>
				 			<input type="email" name="email" id="email">
				 		</li>
				 		<li>
				 			<label for="password">password</label>
				 			<input type="password" name="password" id="password">
				 		</li>
				 		<li>
				 			<label for="name">name</label>
				 			<input type="text" name="name" id="name">
				 		</li>
				 		<li>
				 			<input type="submit" value="회원가입실행" id="joinOkBtn">
				 		</li>
				 	</ul>	
			 	</div>
			  </form>
			
			</div>
		</div>	
	</div>
</div>
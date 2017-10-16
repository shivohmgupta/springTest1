function validate(){  
var password=document.registerForm.password.value;  
var confirmpassword=document.registerForm.confirmpassword.value;  
  
if(password==confirmpassword){  
return true;  
}  
else{  
alert("password must be same!");  
return false;  
}  

}  

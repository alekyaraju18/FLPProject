<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<style>
input[type=text], select {
    width: 100%;
    padding: 12px 20px;
    margin: 8px 0;
    display: inline-block;
    border: 1px solid #ccc;
    border-radius: 4px;
    box-sizing: border-box;
}

input[type=submit] {
    width: 100%;
    background-color: #4CAF50;
    color: white;
    padding: 14px 20px;
    margin: 8px 0;
    border: none;
    border-radius: 4px;
    cursor: pointer;
}

input[type=submit]:hover {
    background-color: #45a049;
}

div {
    border-radius: 5px;
    background-color: #f2f2f2;
    padding: 20px;
}
</style>
<body>

<h3>Add Merchants</h3>

<div>
<form  action=/addmerchantsfront>

<label for="id"> Id</label>
<input type="text" id="id" name="id" placeholder="Enter merchant Id"> 

<label for="name"> Name</label>
<input type="text" id="name" name="name" placeholder="Enter merchant Name">
 
<label for="type"> Type</label>
<input type="text" id="type" name="type" placeholder="Enter merchant type">

<label for="organisaton"> Organisation</label>
<input type="text" id="organisation" name="organisation" placeholder="Enter Merchant Organisation"> 

<input type="submit" name="Submit">

</form>
</div>
</body>
</html>
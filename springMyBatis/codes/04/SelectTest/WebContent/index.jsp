<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>测试@ModelAttribute</title>
</head>
<body>
<h3>测试@ModelAttribute的不同用法</h3>
<a href=selectForm>测试select option标签使用 </a><br><br>
<a href="selectForm2">测试select标签, 使用items属性对应后台map数据源</a><br><br>
<a href="selectForm3">测试select标签，使用options标签对应后台Map数据源</a><br><br>
<a href="selectForm4">测试select标签，使用options标签的itemLabel和itemValue属性指定后台JavaBean属性数据源</a><br><br>
</body>
</html>
<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>
	
		<title><s:text name="titleShow" /></title>
		
	</head>

	<body>
		<h3>
			<s:text name="labelShow" />
		</h3>
		<s:text name="name" />:<s:property value="name" />
		<br>
		<s:text name="year" />:<s:property value="year" />
		<br>
		<s:text name="speed" />:<s:property value="speed" />
		
		<!-- 文本显示 P159， P174 ================ -->
		
	</body>
</html>

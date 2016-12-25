<%@ page language="java" import="java.util.*" pageEncoding="UTF-8"%>
<%@ taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
	<head>

		<title><s:text name="titleInput" /></title>

	</head>

	<body>
		<s:form action="Input" method="post">
			<h3>
				<s:text name="labelInput" />
			</h3>
			<s:textfield name="name" key="name" /> (isis --> *)
			<s:textfield name="year" key="year" />
			<s:textfield name="speed" key="speed" />
			<!-- 文本框 P158 =========== -->	

			<s:submit key="submit" align="center" />
		</s:form>
	</body>
</html>

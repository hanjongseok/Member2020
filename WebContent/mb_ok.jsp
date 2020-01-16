<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%
     //한글 깨짐 처리
    // request.setCharacterEncoding("utf-8");
    
    String id =request.getParameter("id");
    String pw =request.getParameter("pw");
    String name =request.getParameter("name");
    String email =request.getParameter("email");
    String phone =request.getParameter("phone");
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
가입완료
<%=id %><br>
<%=pw %><br>
<%=name %><br>
<%=email %><br>
<%=phone %><br>
</body>
</html>
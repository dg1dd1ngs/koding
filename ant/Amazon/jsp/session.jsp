<%
  String userName = request.getParameter( "username" );
  session.setAttribute( "CustomerName", userName );

%>

<html>
<body>

 
<a href="index.jsp"> Click </a>

</body>
</html>

<%@ page import="java.sql.*" %>
<%
  
  // Getting an instance of JDBC Driver in the code.
  try{

       String driver = "com.mysql.jdbc.Driver";
       Class.forName(driver).newInstance();
       out.println("JDBC Driver Found");

     }catch( Exception e ){ out.println("JDBC connector not found"); }

  // Creating objects required for looping through the database table

  Connection con = null;
  ResultSet rst = null;
  Statement stmt = null;


  try{
       String url = "jdbc:mysql://localhost:3306/Amazon?user=root"; 
       con = DriverManager.getConnection( url );
       stmt = con.createStatement();
       
       stmt.executeUpdate("insert into userInfo values( 'abcd' , 99 )");
       out.println(" Insert into database success !! ");
  }catch( Exception e ){ out.println( e.getMessage()); }

%>

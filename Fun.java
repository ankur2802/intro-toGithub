import java.sql.*;

public class Fun{
public static void main(String args[]){
try{
Class.forName("com.mysql.cj.jdbc.Driver");
String url="jdbc:mysql://localhost:3306/youtube";
String username="root";
String password="123456";
Connection con=DriverManager.getConnection(url,username,password);

String q="insert into table1(tName,tCity) values (?,?)";

PreparedStatement ptmt=con.prepareStatement(q);
ptmt.setString(1,"Ankur");
ptmt.setString(2,"Suraj");
ptmt.executeUpdate();
System.out.println("inserted....");
con.close();}
catch(Exception e){
e.printStackTrace();
}
}
}
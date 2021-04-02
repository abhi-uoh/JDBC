import java.sql.*;
import java.util.*;

public class MySqlConnection{
    public static void main(String arg[]) throws Exception
    {
        Class.forName("com.mysql.cj.jdbc.Driver");
        Connection con = DriverManager.getConnection("jdbc:mysql:///users","root","Uoh509!@");
        Statement st =con.createStatement();
        st.executeUpdate(
                "insert into employee(id,name,salary,team_name) values(10002,'rachel',45000.0,'HR')");

        ResultSet rs =st.executeQuery("select * from employee");

        while(rs.next())
        {
            System.out.println(rs.getInt(1)+" "+rs.getString(2)+ " "+rs.getDouble(3)+" "+rs.getString(4));
        }
        System.out.println("successful");

    }
}

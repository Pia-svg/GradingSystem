import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.*;

public class addUser {
    public static void main(String[] args) {
        
        
        try {
            Class.forName("com.mysql.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            System.out.println("MySQL driver not found");
        }

        Connection conn = null;
        
        
        
        try {
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/list", "root", "");
            //System.out.println("Database Established");
            Scanner s = new Scanner(System.in);
            System.out.println("Enter id:");
            //user input
            int id = Integer.parseInt(s.next());
            System.out.println("Enter firstname:");
            String fname = s.next();
            System.out.println("Enter lastname:");
            String lname = s.next();
            
            PreparedStatement pst = conn.prepareStatement("insert into user(id, lastname,firstname)"
                    + "values(?,?,?)");
            
            pst.setInt(1, id);
            pst.setString(2, lname);
            pst.setString(3, fname);
            
            int i = pst.executeUpdate();
            if(i != 0){
                System.out.println("added");
                
            }else{
                System.out.println("failed to add");
            }
        } catch (Exception e){
            System.out.println(e);
        }
    }
}

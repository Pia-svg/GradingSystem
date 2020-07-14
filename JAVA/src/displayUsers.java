
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joyce Balagat
 */
public class displayUsers {
    public static void main(String[] args) {
        try{
            Class.forName("com.mysql.jdbc.Driver");
        }catch(ClassNotFoundException e){
            System.out.println("MySQL driver not found");
        }
        Connection conn= null;
        try{
            conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/list", "root", "");
            
            String query = "SELECT id, firstname, lastname FROM user ";
            
            Statement st = conn.createStatement();
            
            ResultSet rs = st.executeQuery(query);
            
            while(rs.next()){
                int id = rs.getInt("id");
                String firstname = rs.getString("firstname");
                String lastname = rs.getString("lastname");
                
                System.out.format(" %s , %s, %s \n" , id,firstname,lastname);
            }
            
            
            
            st.close();
            
        }catch(Exception e){
            e.printStackTrace();
        }finally{
            try{
            if(conn!=null)
                conn.close();
               
        }catch(Exception e){
            e.printStackTrace();
        }
        }
    }
}

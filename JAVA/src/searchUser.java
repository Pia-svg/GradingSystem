
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Joyce Balagat
 */
public class searchUser {
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
            Scanner input = new Scanner(System.in);
            

            System.out.println("Please enter name to search: ");
            String lname = input.nextLine()+"%";
            
            String query = "SELECT id, firstname, lastname FROM user " 
                    + "where lastname like '"+lname+"'";
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery(query);
            while (rs.next()) {
                int id = rs.getInt("id");
                String firstName = rs.getString("firstname");
                String lastName = rs.getString("lastname");
                System.out.format("%s, %s, %s \n", id, firstName, lastName);
            }
            st.close();
         }catch (Exception e){
             e.printStackTrace();
         }finally{
            try {
                if (conn != null) {
                    conn.close();
                }
            }catch (SQLException e){
                 e.printStackTrace();
            }
        }
    }
}

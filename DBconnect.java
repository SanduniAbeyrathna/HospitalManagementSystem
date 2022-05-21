/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package member2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import javax.swing.table.TableModel;

/**
 *
 * @author Sanduni Nishadi
 */
public class DBconnect {
    
    public static Connection connect(){
        Connection conn = null;
        
        try{
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/mysql","root","sanduni123");
           
        
        }catch(Exception e){
            System.out.println(e);
        
        }
        
 
        return conn;
    }

    static TableModel resultSetToTableModel(ResultSet rs) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}

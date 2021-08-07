/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Yashitha Nadiranga. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *  v1.0.0
 *-------------------------------------------------------------------------------------------*/
package lk.ijse.pos.db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author <hello@yashitha.com> Yashitha Nadiranga
 */
public class DBConnection {
    private static DBConnection dBConnection;
    private Connection con;
    private DBConnection() throws ClassNotFoundException, SQLException{
        Class.forName("com.mysql.cj.jdbc.Driver");
        con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gdse", "root", "1234");
    }
    
    public static DBConnection getInstance() throws ClassNotFoundException, SQLException{
        return (dBConnection==null)?(new DBConnection()):(dBConnection);
    }
    
    public Connection getConnection(){
        return con;
    }
}

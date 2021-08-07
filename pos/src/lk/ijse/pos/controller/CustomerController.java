/*---------------------------------------------------------------------------------------------
 *  Copyright (c) Yashitha Nadiranga. All rights reserved.
 *  Licensed under the MIT License. See License.txt in the project root for license information.
 *-------------------------------------------------------------------------------------------*/
package lk.ijse.pos.controller;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import lk.ijse.pos.db.DBConnection;

/**
 *
 * @author <hello@yashitha.com> Yashitha Nadiranga
 */
public class CustomerController {
    public boolean saveCustomer(String id,String name,String address,double salary) throws ClassNotFoundException, SQLException{

            Connection con = DBConnection.getInstance().getConnection();
            PreparedStatement stm = con.prepareStatement("INSERT INTO customer VALUES(?,?,?,?)");
            stm.setObject(1, id);
            stm.setObject(2, name);
            stm.setObject(3, address);
            stm.setObject(4, salary);
            int rst = stm.executeUpdate();
            
            if(rst>0) return true;
            else return false;
    }
}

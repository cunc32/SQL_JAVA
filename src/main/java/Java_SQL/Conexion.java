/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Java_SQL;

import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author AORUS
 */
public class Conexion {

    public static Connection getConexion() {

        Connection conectar = null;
        String usuario = "sa";
        String contra = "Publicsql20";

        try {
            String cadena = "jdbc:sqlserver://olimpo.dscloud.biz:1433;databaseName=Aduanas;encrypt=false";
            conectar = DriverManager.getConnection(cadena, usuario, contra);
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Ha ocurrido algun error inesperadamente esperado\n"+e.toString(), "ERROR", JOptionPane.ERROR_MESSAGE);
        }

        return conectar;

    }

}

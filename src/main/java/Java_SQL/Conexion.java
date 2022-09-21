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
    
    public static ResultSet Consulta(String consulta) {
        Connection con = getConexion();
        Statement declara;
        try {
            declara = con.createStatement();
            ResultSet respuesta = declara.executeQuery(consulta);
            return respuesta;
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error: "+e.getMessage(), "Error de Conexion", JOptionPane.ERROR_MESSAGE);
            return null;
        }
    }
    
    public static void EliminarPaquete(int id) throws SQLException {
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call DelPaquete(?)}");
        entrada.setInt(1, id);
        entrada.execute();
    }
    
    public static void EliminarCliente(int id) throws SQLException {
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call DelCliente(?)}");
        entrada.setInt(1, id);
        entrada.execute();
    }
    
    public static void EliminarTransporte(int id) throws SQLException {
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call DelTransporte(?)}");
        entrada.setInt(1, id);
        entrada.execute();
    }
    
    public static void EliminarAlmacen(int id) throws SQLException {
        CallableStatement entrada = Conexion.getConexion().prepareCall("{call DelAlmacen(?)}");
        entrada.setInt(1, id);
        entrada.execute();
    }
    
    public static void Query(String consulta) {
        Connection con = getConexion();
        Statement declara;
        try {
            declara = con.createStatement();
            declara.executeQuery(consulta);
        } catch (SQLException e) {
        }
    }

}

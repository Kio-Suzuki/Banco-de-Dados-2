package com.mycompany.p2.db;

import com.mycompany.p2.Main;
import java.io.FileInputStream;
import java.io.IOException;
import java.sql.*;
import java.util.Properties;
import javax.swing.JOptionPane;

public class DB {

    private static Connection conn = null;

    public static Connection getConnection() throws ClassNotFoundException {

        if (conn == null) {
            try{
                
                Class.forName("org.postgresql.Driver");
                String login;
                String senha;
                    do {
                        login = JOptionPane.showInputDialog(null, "Informe o login:", "Login", JOptionPane.QUESTION_MESSAGE);
                        senha = JOptionPane.showInputDialog(null, "Informe a senha:", "Senha", JOptionPane.QUESTION_MESSAGE);
                        conn = DriverManager.getConnection("jdbc:postgresql://localhost:5432/banco", login, senha);
                    } while (conn == null);
                    Main.jLabUsuario.setText(login);
		    Main.ONoFF.setForeground(new java.awt.Color(51, 255, 51));
                    Main.ONoFF.setText("ON");

                }
            catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
        return conn;
    }

    public static void closeConnection() {
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }


    public static void closeStatement(Statement st) {
        if (st != null) {
            try {
                st.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }

    public static void closeResultSet(ResultSet rs) {
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DbException(e.getMessage());
            }
        }
    }
}
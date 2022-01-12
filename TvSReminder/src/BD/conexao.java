package BD;

import java.sql.*;
import javax.swing.*;

public class conexao{
    final private String driver = "sun.jdbc.odbc.JdbcOdbcDriver";
    final private String url = "jdbc:odbc:bd_prog";
    final private String user = "root";
    final private String pw = "admin";
    private Connection conexao;
    public Statement statement;
    public ResultSet resultset;
    
    public boolean conecta()
    {
        boolean result = true;
        try{
            Class.forName(driver);
            conexao = DriverManager.getConnection(url,user,pw);
            //JOptionPane.showMessageDialog(null, "Conectado!");
        }
        catch(ClassNotFoundException Driver) {
            JOptionPane.showMessageDialog(null, "Driver Nao Localizado: "+Driver);
            result = false;
        }
        catch(SQLException Fonte){
            JOptionPane.showMessageDialog(null, "Erro na conexao: "+Fonte);
            result = false;
        }
        return result;
    }
    
    public void desconecta ()
    {
        boolean result = true;
        try{
            conexao.close();
            JOptionPane.showMessageDialog(null, "Desligado!");
        }catch (SQLException erroSQL){
            JOptionPane.showMessageDialog(null, "Erro: " + erroSQL.getMessage());
            result = false;
        }
    }
    
    public ResultSet executeSQL(String sql)
    {
        try{
            statement = conexao.createStatement();
            resultset = statement.executeQuery(sql);
            //JOptionPane.showMessageDialog(null,"Done");
            
        }catch(SQLException sqlex){
            JOptionPane.showMessageDialog(null, sqlex.getMessage());
        }
        return resultset;
    }
}

package rmi;

import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
/**
 *
 * @author Paulo
 */
public class Servicos extends UnicastRemoteObject implements InterfaceServicos{

    private Connection con;
    
    public Servicos() throws RemoteException{
        super();
        
        try {
            // carrega o driver JDBC
            Class.forName("com.mysql.jdbc.Driver");

            getCon();
        } catch (ClassNotFoundException ex) {
            ex.getStackTrace();
        } catch (SQLException ex) {
            ex.getStackTrace();
        }
    }
    
    @Override
    public Numero soma(Numero x, Numero y) throws RemoteException {
        
        Numero z = new Numero();
        z.setNumero(x.getNumero()+y.getNumero());
        return z;
    }

    @Override
    public void salvarNumero(Numero x) throws RemoteException {
        try{
            String inserir = "INSERT INTO soma (valor) VALUES (?)";
            PreparedStatement stat = getCon().prepareStatement(inserir);
            stat.setInt(1, x.getNumero());

            stat.executeUpdate();
            System.out.println("Número salvo com sucesso!");
            stat.close();
            
        }catch(SQLException e){
            System.out.println("Erro na conexão");
        }catch (NullPointerException ex){
            System.out.println("Erro de conexão ao banco.");
        } 
    }
    
    public Connection getCon() throws SQLException{
        
        if(con == null){
            // cria a conexão
            System.out.println("Criando conexão com banco!");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306/numero", "paulo", "123456");
            System.out.println("Conexão "+con);
        }
        return con;
    }
}

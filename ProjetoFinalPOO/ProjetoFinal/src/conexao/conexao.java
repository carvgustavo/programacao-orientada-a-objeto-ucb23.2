//Classe que faz a conexão com o banco de dados mySQL

package conexao;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class conexao {

    //Definição da url, usuário e senha do banco
    private static final String url = "jdbc:mysql://localhost:3306/lojaderoupas";
    private static final String user = "root";
    private static final String password = "root";

    //Variável que armazena a conexão com o banco
    private static Connection con;

    //Método para obter a conexão com o banco
    public static Connection getConexao(){

        try {
            //Se a conexão não existir, uma nova é criada
            if(con == null){
                con = DriverManager.getConnection(url, user, password);
                return con;
            }else{
                //Se a conexão já existir, é retornada
                return con;
            }
        }catch (SQLException e) {
            //Se ocorrer um erro ao estabelecer a conexão, é impresso no terminal
            e.printStackTrace();
            return null;
        }
        
    }
}
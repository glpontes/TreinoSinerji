package module15.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class TesteConexao {
    public static void main(String[] args) throws SQLException {
        String url = "jdbc:mysql://localhost:3306";
        String usuario = "root";
        String senha = "gabriel123";

        Connection conexao = DriverManager
                .getConnection(url,usuario,senha);

        System.out.println("Conexão efetuada com sucesso!");
        conexao.close();
    }
}

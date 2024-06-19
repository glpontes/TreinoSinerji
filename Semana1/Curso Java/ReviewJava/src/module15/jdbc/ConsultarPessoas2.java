package module15.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsultarPessoas2 {
    public static void main(String[] args) throws SQLException {

        Connection conexao = FabricaConexao.getConnection();
        Scanner sc = new Scanner(System.in);
        String sql = "SELECT * FROM pessoas WHERE nome like ?";

        System.out.println("Digite o seu parâmetro de consulta:");
        String parametro = sc.nextLine();


        PreparedStatement stmt = conexao.prepareStatement(sql);
        stmt.setString(1, "%" + parametro + "%");
        ResultSet resultado = stmt.executeQuery();

        List<Pessoa> pessoas = new ArrayList<Pessoa>();

        while (resultado.next()) {
            int codigo = resultado.getInt("codigo");
            String nome = resultado.getString("nome");
            pessoas.add(new Pessoa(codigo, nome));
        }

        System.out.println("Encontrei os seguintes resultados: ");
        for(Pessoa p : pessoas){
            System.out.println(p.getCodigo() + " - " + p.getNome());
        }


        conexao.close();
        sc.close();
        stmt.close();
    }
}

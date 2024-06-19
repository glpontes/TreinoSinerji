package module15.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.Scanner;

public class NovaPessoa {
    public static void main(String[] args) {
        String insertSQL = "INSERT INTO pessoas (nome) VALUES (?)";

        try (Scanner sc = new Scanner(System.in)) {
            String nome = "";
            boolean nomeValido = false;

            // Validação da entrada para o nome
            while (!nomeValido) {
                System.out.println("Informe o nome:");
                nome = sc.nextLine();
                if (!nome.trim().isEmpty() && nome.matches("[a-zA-Z\\s]+")) {
                    nomeValido = true;
                } else {
                    System.out.println("Nome inválido. O nome deve conter apenas letras e espaços e não pode estar vazio.");
                }
            }

            try (Connection conexao = FabricaConexao.getConnection();
                 PreparedStatement stmt = conexao.prepareStatement(insertSQL)) {

                stmt.setString(1, nome);
                stmt.execute();

                System.out.println("Pessoa inserida com sucesso!");
            } catch (SQLException e) {
                System.out.println("Erro ao inserir a pessoa: " + e.getMessage());
            }
        }
    }
}

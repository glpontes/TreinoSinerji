package module15.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class AtualizarNome {
    public static void main(String[] args) {

        //Definindo as querys padrão
        String selectSQL = "SELECT codigo, nome FROM pessoas WHERE codigo = ?";
        String updateSQL = "UPDATE pessoas SET nome = ? WHERE codigo = ?";

        try (Scanner sc = new Scanner(System.in)) {
            System.out.print("Informe o código da pessoa: ");
            int codigo = 0;
            boolean entradaValida = false;

            // Validação da entrada do código
            while (!entradaValida) {
                try {
                    codigo = sc.nextInt();
                    entradaValida = true;
                } catch (InputMismatchException e) {
                    System.out.println("Código inválido. Por favor, insira um número inteiro.");
                    sc.next(); // Limpar a entrada inválida
                }
            }

            // Limpar o buffer do Scanner
            sc.nextLine();

            try (Connection conexao = FabricaConexao.getConnection();
                 PreparedStatement selectStmt = conexao.prepareStatement(selectSQL)) {

                selectStmt.setInt(1, codigo);
                try (ResultSet resultado = selectStmt.executeQuery()) {
                    if (resultado.next()) {
                        Pessoa p = new Pessoa(resultado.getInt(1), resultado.getString(2));
                        System.out.println("O nome atual é: " + p.getNome());

                        // Validação da entrada para o novo nome
                        String novoNome = "";
                        boolean nomeValido = false;
                        while (!nomeValido) {
                            System.out.print("Informe o novo nome: ");
                            novoNome = sc.nextLine();
                            if (!novoNome.trim().isEmpty() && novoNome.matches("[a-zA-Z\\s]+")) {
                                nomeValido = true;
                            } else {
                                System.out.println("Nome inválido. O nome não pode estar vazio.");
                            }
                        }

                        try (PreparedStatement updateStmt = conexao.prepareStatement(updateSQL)) {
                            updateStmt.setString(1, novoNome);
                            updateStmt.setInt(2, codigo);
                            updateStmt.execute();
                            System.out.println("Operação realizada com sucesso");
                        }
                    } else {
                        System.out.println("Pessoa não encontrada");
                    }
                }
            } catch (SQLException e) {
                System.out.println("Erro ao atualizar o nome: " + e.getMessage());
            }
        }
    }
}

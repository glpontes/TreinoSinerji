package module15.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class DeleteRegistro {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int codigo = 0;
            boolean entradaValida = false;

            // Validação de entrada
            while (!entradaValida) {
                System.out.print("Informe o código: ");
                try {
                    codigo = sc.nextInt();
                    if (codigo > 0) {
                        entradaValida = true;
                    } else {
                        System.out.println("Código deve ser um número positivo. Tente novamente.");
                    }
                } catch (InputMismatchException e) {
                    System.out.println("Entrada inválida. Por favor, insira um número.");
                    sc.next(); // Limpar a entrada inválida
                }
            }

            // Uso de try-with-resources para garantir o fechamento dos recursos
            try (Connection conexao = FabricaConexao.getConnection();
                 PreparedStatement stmt = conexao.prepareStatement("DELETE FROM pessoas WHERE codigo = ?")) {

                stmt.setInt(1, codigo);

                // Executar e contar quantas linhas foram afetadas
                int contador = stmt.executeUpdate();

                if (contador > 0) {
                    System.out.println("Registro excluído com sucesso!");
                } else {
                    System.out.println("Operação não realizada. Nenhum registro encontrado com o código fornecido.");
                }

                System.out.println("Linhas afetadas: " + contador);
            } catch (SQLException e) {
                System.out.println("Erro ao tentar excluir o registro: " + e.getMessage());
                // Idealmente, você deve registrar este erro em um log para análise posterior
            }
        }
    }
}

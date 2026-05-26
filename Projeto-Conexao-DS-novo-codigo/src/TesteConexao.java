import java.sql.Connection;

import util.Conexao;

public class TesteConexao {

    public static void main(String[] args) {
        Connection conn = null;

        try {
            conn = Conexao.conectar();
            System.out.println("Conexao realizada com sucesso!");
        } catch (Exception e) {
            throw new RuntimeException("Erro ao testar conexao: " + e.getMessage());
        } finally {
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

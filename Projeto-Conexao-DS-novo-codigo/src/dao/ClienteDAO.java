package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import model.Cliente;
import util.Conexao;

public class ClienteDAO {

    public void salvar(Cliente cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "INSERT INTO cliente (nome, nome_social, cpf, genero, afrodescendente, escolaridade_publica, data_nascimento, local_nascimento, nacionalidade, pais_origem, filiacao1, filiacao2, responsavel_legal, grau_parentesco, habilitacao, periodo, serie_modulo, rua_avenida, bairro, complemento, apto, bloco, cep, cidade, telefone, celular, email, estuda_atualmente_etec, estuda_outra_etec, ja_estudou_etec, concluiu_ensino_medio, escola_ensino_medio) VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?, ?)";

        try {
            conn = Conexao.conectar();
            stmt = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getNomeSocial());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getGenero());
            stmt.setBoolean(5, cliente.isAfrodescendente());
            stmt.setBoolean(6, cliente.isEscolaridadePublica());
            stmt.setString(7, cliente.getDataNascimento());
            stmt.setString(8, cliente.getLocalNascimento());
            stmt.setString(9, cliente.getNacionalidade());
            stmt.setString(10, cliente.getPaisOrigem());
            stmt.setString(11, cliente.getFiliacao1());
            stmt.setString(12, cliente.getFiliacao2());
            stmt.setString(13, cliente.getResponsavelLegal());
            stmt.setString(14, cliente.getGrauParentesco());
            stmt.setString(15, cliente.getHabilitacao());
            stmt.setString(16, cliente.getPeriodo());
            stmt.setString(17, cliente.getSerieModulo());
            stmt.setString(18, cliente.getRuaAvenida());
            stmt.setString(19, cliente.getBairro());
            stmt.setString(20, cliente.getComplemento());
            stmt.setString(21, cliente.getApto());
            stmt.setString(22, cliente.getBloco());
            stmt.setString(23, cliente.getCep());
            stmt.setString(24, cliente.getCidade());
            stmt.setString(25, cliente.getTelefone());
            stmt.setString(26, cliente.getCelular());
            stmt.setString(27, cliente.getEmail());
            stmt.setBoolean(28, cliente.isEstudaAtualmenteEtec());
            stmt.setBoolean(29, cliente.isEstudaOutraEtec());
            stmt.setBoolean(30, cliente.isJaEstudouEtec());
            stmt.setBoolean(31, cliente.isConcluiuEnsinoMedio());
            stmt.setString(32, cliente.getEscolaEnsinoMedio());
            stmt.executeUpdate();

            rs = stmt.getGeneratedKeys();
            if (rs.next()) {
                cliente.setId(rs.getInt(1));
            }
        } catch (Exception e) {
            throw new RuntimeException("Erro ao salvar cliente: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public List<Cliente> listar() {
        List<Cliente> lista = new ArrayList<Cliente>();

        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT id, nome, nome_social, cpf, genero, afrodescendente, escolaridade_publica, data_nascimento, local_nascimento, nacionalidade, pais_origem, filiacao1, filiacao2, responsavel_legal, grau_parentesco, habilitacao, periodo, serie_modulo, rua_avenida, bairro, complemento, apto, bloco, cep, cidade, telefone, celular, email, estuda_atualmente_etec, estuda_outra_etec, ja_estudou_etec, concluiu_ensino_medio, escola_ensino_medio FROM cliente ORDER BY id DESC";

        try {
            conn = Conexao.conectar();
            stmt = conn.prepareStatement(sql);
            rs = stmt.executeQuery();

            while (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setNomeSocial(rs.getString("nome_social"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setGenero(rs.getString("genero"));
                cliente.setAfrodescendente(rs.getBoolean("afrodescendente"));
                cliente.setEscolaridadePublica(rs.getBoolean("escolaridade_publica"));
                cliente.setDataNascimento(rs.getString("data_nascimento"));
                cliente.setLocalNascimento(rs.getString("local_nascimento"));
                cliente.setNacionalidade(rs.getString("nacionalidade"));
                cliente.setPaisOrigem(rs.getString("pais_origem"));
                cliente.setFiliacao1(rs.getString("filiacao1"));
                cliente.setFiliacao2(rs.getString("filiacao2"));
                cliente.setResponsavelLegal(rs.getString("responsavel_legal"));
                cliente.setGrauParentesco(rs.getString("grau_parentesco"));
                cliente.setHabilitacao(rs.getString("habilitacao"));
                cliente.setPeriodo(rs.getString("periodo"));
                cliente.setSerieModulo(rs.getString("serie_modulo"));
                cliente.setRuaAvenida(rs.getString("rua_avenida"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setComplemento(rs.getString("complemento"));
                cliente.setApto(rs.getString("apto"));
                cliente.setBloco(rs.getString("bloco"));
                cliente.setCep(rs.getString("cep"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setEmail(rs.getString("email"));
                cliente.setEstudaAtualmenteEtec(rs.getBoolean("estuda_atualmente_etec"));
                cliente.setEstudaOutraEtec(rs.getBoolean("estuda_outra_etec"));
                cliente.setJaEstudouEtec(rs.getBoolean("ja_estudou_etec"));
                cliente.setConcluiuEnsinoMedio(rs.getBoolean("concluiu_ensino_medio"));
                cliente.setEscolaEnsinoMedio(rs.getString("escola_ensino_medio"));
                lista.add(cliente);
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao listar clientes: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return lista;
    }

    public Cliente buscarPorId(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;
        ResultSet rs = null;

        String sql = "SELECT id, nome, nome_social, cpf, genero, afrodescendente, escolaridade_publica, data_nascimento, local_nascimento, nacionalidade, pais_origem, filiacao1, filiacao2, responsavel_legal, grau_parentesco, habilitacao, periodo, serie_modulo, rua_avenida, bairro, complemento, apto, bloco, cep, cidade, telefone, celular, email, estuda_atualmente_etec, estuda_outra_etec, ja_estudou_etec, concluiu_ensino_medio, escola_ensino_medio FROM cliente WHERE id = ?";

        try {
            conn = Conexao.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            rs = stmt.executeQuery();

            if (rs.next()) {
                Cliente cliente = new Cliente();
                cliente.setId(rs.getInt("id"));
                cliente.setNome(rs.getString("nome"));
                cliente.setNomeSocial(rs.getString("nome_social"));
                cliente.setCpf(rs.getString("cpf"));
                cliente.setGenero(rs.getString("genero"));
                cliente.setAfrodescendente(rs.getBoolean("afrodescendente"));
                cliente.setEscolaridadePublica(rs.getBoolean("escolaridade_publica"));
                cliente.setDataNascimento(rs.getString("data_nascimento"));
                cliente.setLocalNascimento(rs.getString("local_nascimento"));
                cliente.setNacionalidade(rs.getString("nacionalidade"));
                cliente.setPaisOrigem(rs.getString("pais_origem"));
                cliente.setFiliacao1(rs.getString("filiacao1"));
                cliente.setFiliacao2(rs.getString("filiacao2"));
                cliente.setResponsavelLegal(rs.getString("responsavel_legal"));
                cliente.setGrauParentesco(rs.getString("grau_parentesco"));
                cliente.setHabilitacao(rs.getString("habilitacao"));
                cliente.setPeriodo(rs.getString("periodo"));
                cliente.setSerieModulo(rs.getString("serie_modulo"));
                cliente.setRuaAvenida(rs.getString("rua_avenida"));
                cliente.setBairro(rs.getString("bairro"));
                cliente.setComplemento(rs.getString("complemento"));
                cliente.setApto(rs.getString("apto"));
                cliente.setBloco(rs.getString("bloco"));
                cliente.setCep(rs.getString("cep"));
                cliente.setCidade(rs.getString("cidade"));
                cliente.setTelefone(rs.getString("telefone"));
                cliente.setCelular(rs.getString("celular"));
                cliente.setEmail(rs.getString("email"));
                cliente.setEstudaAtualmenteEtec(rs.getBoolean("estuda_atualmente_etec"));
                cliente.setEstudaOutraEtec(rs.getBoolean("estuda_outra_etec"));
                cliente.setJaEstudouEtec(rs.getBoolean("ja_estudou_etec"));
                cliente.setConcluiuEnsinoMedio(rs.getBoolean("concluiu_ensino_medio"));
                cliente.setEscolaEnsinoMedio(rs.getString("escola_ensino_medio"));
                return cliente;
            }

        } catch (Exception e) {
            throw new RuntimeException("Erro ao buscar cliente: " + e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }

        return null;
    }

    public void atualizar(Cliente cliente) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "UPDATE cliente SET nome = ?, nome_social = ?, cpf = ?, genero = ?, afrodescendente = ?, escolaridade_publica = ?, data_nascimento = ?, local_nascimento = ?, nacionalidade = ?, pais_origem = ?, filiacao1 = ?, filiacao2 = ?, responsavel_legal = ?, grau_parentesco = ?, habilitacao = ?, periodo = ?, serie_modulo = ?, rua_avenida = ?, bairro = ?, complemento = ?, apto = ?, bloco = ?, cep = ?, cidade = ?, telefone = ?, celular = ?, email = ?, estuda_atualmente_etec = ?, estuda_outra_etec = ?, ja_estudou_etec = ?, concluiu_ensino_medio = ?, escola_ensino_medio = ? WHERE id = ?";

        try {
            conn = Conexao.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setString(1, cliente.getNome());
            stmt.setString(2, cliente.getNomeSocial());
            stmt.setString(3, cliente.getCpf());
            stmt.setString(4, cliente.getGenero());
            stmt.setBoolean(5, cliente.isAfrodescendente());
            stmt.setBoolean(6, cliente.isEscolaridadePublica());
            stmt.setString(7, cliente.getDataNascimento());
            stmt.setString(8, cliente.getLocalNascimento());
            stmt.setString(9, cliente.getNacionalidade());
            stmt.setString(10, cliente.getPaisOrigem());
            stmt.setString(11, cliente.getFiliacao1());
            stmt.setString(12, cliente.getFiliacao2());
            stmt.setString(13, cliente.getResponsavelLegal());
            stmt.setString(14, cliente.getGrauParentesco());
            stmt.setString(15, cliente.getHabilitacao());
            stmt.setString(16, cliente.getPeriodo());
            stmt.setString(17, cliente.getSerieModulo());
            stmt.setString(18, cliente.getRuaAvenida());
            stmt.setString(19, cliente.getBairro());
            stmt.setString(20, cliente.getComplemento());
            stmt.setString(21, cliente.getApto());
            stmt.setString(22, cliente.getBloco());
            stmt.setString(23, cliente.getCep());
            stmt.setString(24, cliente.getCidade());
            stmt.setString(25, cliente.getTelefone());
            stmt.setString(26, cliente.getCelular());
            stmt.setString(27, cliente.getEmail());
            stmt.setBoolean(28, cliente.isEstudaAtualmenteEtec());
            stmt.setBoolean(29, cliente.isEstudaOutraEtec());
            stmt.setBoolean(30, cliente.isJaEstudouEtec());
            stmt.setBoolean(31, cliente.isConcluiuEnsinoMedio());
            stmt.setString(32, cliente.getEscolaEnsinoMedio());
            stmt.setInt(33, cliente.getId());
            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao atualizar cliente: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }

    public void excluir(int id) {
        Connection conn = null;
        PreparedStatement stmt = null;

        String sql = "DELETE FROM cliente WHERE id = ?";

        try {
            conn = Conexao.conectar();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1, id);
            stmt.executeUpdate();
        } catch (Exception e) {
            throw new RuntimeException("Erro ao excluir cliente: " + e.getMessage());
        } finally {
            try {
                if (stmt != null) {
                    stmt.close();
                }
                if (conn != null) {
                    conn.close();
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}

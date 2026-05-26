package controller;

import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

import dao.ClienteDAO;
import model.Cliente;
import view.TelaCliente;

public class ClienteController {

    private TelaCliente tela;
    private ClienteDAO clienteDAO;

    public ClienteController(TelaCliente tela) {
        this.tela = tela;
        this.clienteDAO = new ClienteDAO();
    }

    public void salvar() {

        String nome = tela.getTxtNome().getText().trim();
        String email = tela.getTxtEmail().getText().trim();

        if (nome.isEmpty() || email.isEmpty()) {

            JOptionPane.showMessageDialog(
                tela,
                "Preencha os campos nome e email.",
                "Atenção",
                JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        try {

            String idTexto = tela.getTxtId().getText().trim();

            Cliente cliente = new Cliente();

            cliente.setNome(tela.getTxtNome().getText());
            cliente.setNomeSocial(tela.getTxtNomeSocial().getText());
            cliente.setCpf(tela.getTxtCpf().getText());
            cliente.setGenero(tela.getTxtGenero().getText());
            cliente.setAfrodescendente(tela.getChkAfrodescendente().isSelected());
            cliente.setEscolaridadePublica(tela.getChkEscolaridadePublica().isSelected());
            cliente.setDataNascimento(tela.getTxtDataNascimento().getText());
            cliente.setLocalNascimento(tela.getTxtLocalNascimento().getText());
            cliente.setNacionalidade(tela.getTxtNacionalidade().getText());
            cliente.setPaisOrigem(tela.getTxtPaisOrigem().getText());
            cliente.setFiliacao1(tela.getTxtFiliacao1().getText());
            cliente.setFiliacao2(tela.getTxtFiliacao2().getText());
            cliente.setResponsavelLegal(tela.getTxtResponsavelLegal().getText());
            cliente.setGrauParentesco(tela.getTxtGrauParentesco().getText());
            cliente.setHabilitacao(tela.getTxtHabilitacao().getText());
            cliente.setPeriodo(tela.getTxtPeriodo().getText());
            cliente.setSerieModulo(tela.getTxtSerieModulo().getText());
            cliente.setRuaAvenida(tela.getTxtRuaAvenida().getText());
            cliente.setBairro(tela.getTxtBairro().getText());
            cliente.setComplemento(tela.getTxtComplemento().getText());
            cliente.setApto(tela.getTxtApto().getText());
            cliente.setBloco(tela.getTxtBloco().getText());
            cliente.setCep(tela.getTxtCep().getText());
            cliente.setCidade(tela.getTxtCidade().getText());
            cliente.setTelefone(tela.getTxtTelefone().getText());
            cliente.setCelular(tela.getTxtCelular().getText());
            cliente.setEmail(tela.getTxtEmail().getText());
            cliente.setEstudaAtualmenteEtec(tela.getChkEstudaAtualmenteEtec().isSelected());
            cliente.setEstudaOutraEtec(tela.getChkEstudaOutraEtec().isSelected());
            cliente.setJaEstudouEtec(tela.getChkJaEstudouEtec().isSelected());
            cliente.setConcluiuEnsinoMedio(tela.getChkConcluiuEnsinoMedio().isSelected());
            cliente.setEscolaEnsinoMedio(tela.getTxtEscolaEnsinoMedio().getText());

            if (idTexto.isEmpty()) {
                clienteDAO.salvar(cliente);

                JOptionPane.showMessageDialog(
                    tela,
                    "Cliente salvo com sucesso."
                );

            } else {

                cliente.setId(Integer.parseInt(idTexto));

                clienteDAO.atualizar(cliente);

                JOptionPane.showMessageDialog(
                    tela,
                    "Cliente atualizado com sucesso."
                );
            }

            limpar();
            carregarTabela();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                tela,
                "Erro ao salvar: " + e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void excluir() {

        int linha = tela.getTabelaClientes().getSelectedRow();

        if (linha == -1) {

            JOptionPane.showMessageDialog(
                tela,
                "Selecione um cliente na tabela para excluir.",
                "Atenção",
                JOptionPane.WARNING_MESSAGE
            );

            return;
        }

        int confirmacao = JOptionPane.showConfirmDialog(
            tela,
            "Deseja realmente excluir o cliente selecionado?",
            "Confirmação",
            JOptionPane.YES_NO_OPTION
        );

        if (confirmacao != JOptionPane.YES_OPTION) {
            return;
        }

        try {

            int id = Integer.parseInt(
                tela.getTxtId().getText()
            );

            clienteDAO.excluir(id);

            JOptionPane.showMessageDialog(
                tela,
                "Cliente excluído com sucesso."
            );

            limpar();

            carregarTabela();

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                tela,
                "Erro ao excluir: " + e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void limpar() {

        tela.getTxtId().setText("");
        tela.getTxtNome().setText("");
        tela.getTxtNomeSocial().setText("");
        tela.getTxtCpf().setText("");
        tela.getTxtGenero().setText("");
        tela.getTxtDataNascimento().setText("");
        tela.getTxtLocalNascimento().setText("");
        tela.getTxtNacionalidade().setText("");
        tela.getTxtPaisOrigem().setText("");
        tela.getTxtFiliacao1().setText("");
        tela.getTxtFiliacao2().setText("");
        tela.getTxtResponsavelLegal().setText("");
        tela.getTxtGrauParentesco().setText("");
        tela.getTxtHabilitacao().setText("");
        tela.getTxtPeriodo().setText("");
        tela.getTxtSerieModulo().setText("");
        tela.getTxtRuaAvenida().setText("");
        tela.getTxtBairro().setText("");
        tela.getTxtComplemento().setText("");
        tela.getTxtApto().setText("");
        tela.getTxtBloco().setText("");
        tela.getTxtCep().setText("");
        tela.getTxtCidade().setText("");
        tela.getTxtTelefone().setText("");
        tela.getTxtCelular().setText("");
        tela.getTxtEmail().setText("");
        tela.getTxtEscolaEnsinoMedio().setText("");

        tela.getChkAfrodescendente().setSelected(false);
        tela.getChkEscolaridadePublica().setSelected(false);
        tela.getChkEstudaAtualmenteEtec().setSelected(false);
        tela.getChkEstudaOutraEtec().setSelected(false);
        tela.getChkJaEstudouEtec().setSelected(false);
        tela.getChkConcluiuEnsinoMedio().setSelected(false);

        tela.getTxtNome().requestFocus();

        tela.getTabelaClientes().clearSelection();
    }

    public void carregarTabela() {

        DefaultTableModel modelo = (DefaultTableModel) tela.getTabelaClientes().getModel();

        modelo.setRowCount(0);

        try {

            List<Cliente> clientes = clienteDAO.listar();

            int i;

            for (i = 0; i < clientes.size(); i++) {

                Cliente c = clientes.get(i);

                modelo.addRow(
                    new Object[] {
                        c.getId(),
                        c.getNome(),
                        c.getCpf(),
                        c.getEmail(),
                        c.getCelular()
                    }
                );
            }

        } catch (Exception e) {

            JOptionPane.showMessageDialog(
                tela,
                "Erro ao carregar tabela: " + e.getMessage(),
                "Erro",
                JOptionPane.ERROR_MESSAGE
            );
        }
    }

    public void preencherFormulario() {

        int linha = tela.getTabelaClientes().getSelectedRow();

        if (linha != -1) {

            tela.getTxtId().setText(tela.getTabelaClientes().getValueAt(linha, 0).toString());
            tela.getTxtNome().setText(tela.getTabelaClientes().getValueAt(linha, 1).toString());
            tela.getTxtCpf().setText(tela.getTabelaClientes().getValueAt(linha, 2).toString());
            tela.getTxtEmail().setText(tela.getTabelaClientes().getValueAt(linha, 3).toString());
            tela.getTxtCelular().setText(tela.getTabelaClientes().getValueAt(linha, 4).toString());
        }
    }
}
package view;

import javax.swing.*;
import java.awt.*;
import model.Cliente;

public class TelaCliente extends JFrame {

    private JTextField txtNome;
    private JTextField txtNomeSocial;
    private JTextField txtCpf;
    private JTextField txtGenero;
    private JTextField txtDataNascimento;
    private JTextField txtLocalNascimento;
    private JTextField txtNacionalidade;
    private JTextField txtPaisOrigem;
    private JTextField txtFiliacao1;
    private JTextField txtFiliacao2;
    private JTextField txtResponsavelLegal;
    private JTextField txtGrauParentesco;
    private JTextField txtHabilitacao;
    private JTextField txtPeriodo;
    private JTextField txtSerieModulo;
    private JTextField txtRuaAvenida;
    private JTextField txtBairro;
    private JTextField txtComplemento;
    private JTextField txtApto;
    private JTextField txtBloco;
    private JTextField txtCep;
    private JTextField txtCidade;
    private JTextField txtTelefone;
    private JTextField txtCelular;
    private JTextField txtEmail;
    private JTextField txtEscola;

    private JCheckBox chkAfrodescendente;
    private JCheckBox chkEscolaridadePublica;
    private JCheckBox chkEstudaEtec;
    private JCheckBox chkEstudaOutraEtec;
    private JCheckBox chkJaEstudouEtec;
    private JCheckBox chkConcluiuEnsinoMedio;

    private JButton btnSalvar;

    public TelaCliente() {
        setTitle("Ficha de Matrícula");
        setSize(700, 750);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);

        JPanel painel = new JPanel();
        painel.setLayout(new GridLayout(0, 2, 8, 8));

        txtNome = new JTextField();
        txtNomeSocial = new JTextField();
        txtCpf = new JTextField();
        txtGenero = new JTextField();
        txtDataNascimento = new JTextField();
        txtLocalNascimento = new JTextField();
        txtNacionalidade = new JTextField();
        txtPaisOrigem = new JTextField();
        txtFiliacao1 = new JTextField();
        txtFiliacao2 = new JTextField();
        txtResponsavelLegal = new JTextField();
        txtGrauParentesco = new JTextField();
        txtHabilitacao = new JTextField();
        txtPeriodo = new JTextField();
        txtSerieModulo = new JTextField();
        txtRuaAvenida = new JTextField();
        txtBairro = new JTextField();
        txtComplemento = new JTextField();
        txtApto = new JTextField();
        txtBloco = new JTextField();
        txtCep = new JTextField();
        txtCidade = new JTextField();
        txtTelefone = new JTextField();
        txtCelular = new JTextField();
        txtEmail = new JTextField();
        txtEscola = new JTextField();

        chkAfrodescendente = new JCheckBox("Sim");
        chkEscolaridadePublica = new JCheckBox("Sim");
        chkEstudaEtec = new JCheckBox("Sim");
        chkEstudaOutraEtec = new JCheckBox("Sim");
        chkJaEstudouEtec = new JCheckBox("Sim");
        chkConcluiuEnsinoMedio = new JCheckBox("Sim");

        adicionarCampo(painel, "Nome:", txtNome);
        adicionarCampo(painel, "Nome Social:", txtNomeSocial);
        adicionarCampo(painel, "CPF:", txtCpf);
        adicionarCampo(painel, "Gênero:", txtGenero);
        adicionarCampo(painel, "Afrodescendente:", chkAfrodescendente);
        adicionarCampo(painel, "Escolaridade pública:", chkEscolaridadePublica);
        adicionarCampo(painel, "Data de nascimento:", txtDataNascimento);
        adicionarCampo(painel, "Local de nascimento:", txtLocalNascimento);
        adicionarCampo(painel, "Nacionalidade:", txtNacionalidade);
        adicionarCampo(painel, "País de origem:", txtPaisOrigem);
        adicionarCampo(painel, "Filiação 1:", txtFiliacao1);
        adicionarCampo(painel, "Filiação 2:", txtFiliacao2);
        adicionarCampo(painel, "Responsável Legal:", txtResponsavelLegal);
        adicionarCampo(painel, "Grau de Parentesco:", txtGrauParentesco);
        adicionarCampo(painel, "Habilitação:", txtHabilitacao);
        adicionarCampo(painel, "Período:", txtPeriodo);
        adicionarCampo(painel, "Série/Módulo:", txtSerieModulo);
        adicionarCampo(painel, "Rua/Avenida:", txtRuaAvenida);
        adicionarCampo(painel, "Bairro:", txtBairro);
        adicionarCampo(painel, "Complemento:", txtComplemento);
        adicionarCampo(painel, "Apto:", txtApto);
        adicionarCampo(painel, "Bloco:", txtBloco);
        adicionarCampo(painel, "CEP:", txtCep);
        adicionarCampo(painel, "Cidade:", txtCidade);
        adicionarCampo(painel, "Telefone:", txtTelefone);
        adicionarCampo(painel, "Celular:", txtCelular);
        adicionarCampo(painel, "E-mail:", txtEmail);

        adicionarCampo(painel, "Estuda atualmente na Etec?", chkEstudaEtec);
        adicionarCampo(painel, "Estuda em outra Etec?", chkEstudaOutraEtec);
        adicionarCampo(painel, "Já estudou na Etec?", chkJaEstudouEtec);
        adicionarCampo(painel, "Já concluiu o Ensino Médio?", chkConcluiuEnsinoMedio);
        adicionarCampo(painel, "Em qual escola?", txtEscola);

        btnSalvar = new JButton("Salvar");
        painel.add(new JLabel(""));
        painel.add(btnSalvar);

        btnSalvar.addActionListener(e -> salvarCliente());

        JScrollPane scroll = new JScrollPane(painel);
        add(scroll);
    }

    private void adicionarCampo(JPanel painel, String texto, JComponent campo) {
        painel.add(new JLabel(texto));
        painel.add(campo);
    }

    private void salvarCliente() {
        Cliente cliente = new Cliente();

        cliente.setNome(txtNome.getText());
        cliente.setNomeSocial(txtNomeSocial.getText());
        cliente.setCpf(txtCpf.getText());
        cliente.setGenero(txtGenero.getText());
        cliente.setAfrodescendente(chkAfrodescendente.isSelected());
        cliente.setEscolaridadePublica(chkEscolaridadePublica.isSelected());
        cliente.setDataNascimento(txtDataNascimento.getText());
        cliente.setLocalNascimento(txtLocalNascimento.getText());
        cliente.setNacionalidade(txtNacionalidade.getText());
        cliente.setPaisOrigem(txtPaisOrigem.getText());
        cliente.setFiliacao1(txtFiliacao1.getText());
        cliente.setFiliacao2(txtFiliacao2.getText());
        cliente.setResponsavelLegal(txtResponsavelLegal.getText());
        cliente.setGrauParentesco(txtGrauParentesco.getText());
        cliente.setHabilitacao(txtHabilitacao.getText());
        cliente.setPeriodo(txtPeriodo.getText());
        cliente.setSerieModulo(txtSerieModulo.getText());
        cliente.setRuaAvenida(txtRuaAvenida.getText());
        cliente.setBairro(txtBairro.getText());
        cliente.setComplemento(txtComplemento.getText());
        cliente.setApto(txtApto.getText());
        cliente.setBloco(txtBloco.getText());
        cliente.setCep(txtCep.getText());
        cliente.setCidade(txtCidade.getText());
        cliente.setTelefone(txtTelefone.getText());
        cliente.setCelular(txtCelular.getText());
        cliente.setEmail(txtEmail.getText());

        cliente.setEstudaAtualmenteEtec(chkEstudaEtec.isSelected());
        cliente.setEstudaOutraEtec(chkEstudaOutraEtec.isSelected());
        cliente.setJaEstudouEtec(chkJaEstudouEtec.isSelected());
        cliente.setConcluiuEnsinoMedio(chkConcluiuEnsinoMedio.isSelected());
        cliente.setEscolaEnsinoMedio(txtEscola.getText());

        JOptionPane.showMessageDialog(this, "Cliente cadastrado com sucesso!");
    }

    public static void main(String[] args) {
        new TelaCliente().setVisible(true);
    }
}
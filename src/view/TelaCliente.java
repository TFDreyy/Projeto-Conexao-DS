package view;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

import controller.ClienteController;

public class TelaCliente extends JFrame {

    private static final long serialVersionUID = 1L;

    private JLabel lblId;
    private JLabel lblNome;
    private JLabel lblNomeSocial;
    private JLabel lblCpf;
    private JLabel lblGenero;
    private JLabel lblDataNascimento;
    private JLabel lblLocalNascimento;
    private JLabel lblNacionalidade;
    private JLabel lblPaisOrigem;
    private JLabel lblFiliacao1;
    private JLabel lblFiliacao2;
    private JLabel lblResponsavelLegal;
    private JLabel lblGrauParentesco;
    private JLabel lblHabilitacao;
    private JLabel lblPeriodo;
    private JLabel lblSerieModulo;
    private JLabel lblRuaAvenida;
    private JLabel lblBairro;
    private JLabel lblComplemento;
    private JLabel lblApto;
    private JLabel lblBloco;
    private JLabel lblCep;
    private JLabel lblCidade;
    private JLabel lblTelefone;
    private JLabel lblCelular;
    private JLabel lblEmail;
    private JLabel lblEscolaEnsinoMedio;

    private JTextField txtId;
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
    private JTextField txtEscolaEnsinoMedio;

    private JCheckBox chkAfrodescendente;
    private JCheckBox chkEscolaridadePublica;
    private JCheckBox chkEstudaAtualmenteEtec;
    private JCheckBox chkEstudaOutraEtec;
    private JCheckBox chkJaEstudouEtec;
    private JCheckBox chkConcluiuEnsinoMedio;

    private JButton btnNovo;
    private JButton btnSalvar;
    private JButton btnExcluir;
    private JButton btnLimpar;

    private JTable tabelaClientes;
    private DefaultTableModel modeloTabela;

    private ClienteController controller;

    public TelaCliente() {

        setTitle("Cadastro de Clientes");
        setSize(1100, 700);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        criarComponentes();

        controller = new ClienteController(this);

        configurarEventos();

        controller.carregarTabela();
    }

    private void criarComponentes() {

        JPanel painelFormulario = new JPanel(new GridLayout(0, 2, 10, 10));

        painelFormulario.setBorder(
            BorderFactory.createTitledBorder("Dados do Cliente")
        );

        lblId = new JLabel("ID:");
        txtId = new JTextField();
        txtId.setEditable(false);
        lblNome = new JLabel("Nome:");
        txtNome = new JTextField();
        lblNomeSocial = new JLabel("Nome Social:");
        txtNomeSocial = new JTextField();
        lblCpf = new JLabel("CPF:");
        txtCpf = new JTextField();
        lblGenero = new JLabel("Genero:");
        txtGenero = new JTextField();
        chkAfrodescendente = new JCheckBox("Afrodescendente");
        chkEscolaridadePublica = new JCheckBox("Escolaridade Pública");
        lblDataNascimento = new JLabel("Data Nascimento:");
        txtDataNascimento = new JTextField();
        lblLocalNascimento = new JLabel("Local Nascimento:");
        txtLocalNascimento = new JTextField();
        lblNacionalidade = new JLabel("Nacionalidade:");
        txtNacionalidade = new JTextField();
        lblPaisOrigem = new JLabel("País Origem:");
        txtPaisOrigem = new JTextField();
        lblFiliacao1 = new JLabel("Filiação 1:");
        txtFiliacao1 = new JTextField();
        lblFiliacao2 = new JLabel("Filiação 2:");
        txtFiliacao2 = new JTextField();
        lblResponsavelLegal = new JLabel("Responsável Legal:");
        txtResponsavelLegal = new JTextField();
        lblGrauParentesco = new JLabel("Grau Parentesco:");
        txtGrauParentesco = new JTextField();
        lblHabilitacao = new JLabel("Habilitação:");
        txtHabilitacao = new JTextField();
        lblPeriodo = new JLabel("Período:");
        txtPeriodo = new JTextField();
        lblSerieModulo = new JLabel("Série/Módulo:");
        txtSerieModulo = new JTextField();
        lblRuaAvenida = new JLabel("Rua/Avenida:");
        txtRuaAvenida = new JTextField();
        lblBairro = new JLabel("Bairro:");
        txtBairro = new JTextField();
        lblComplemento = new JLabel("Complemento:");
        txtComplemento = new JTextField();
        lblApto = new JLabel("Apto:");
        txtApto = new JTextField();
        lblBloco = new JLabel("Bloco:");
        txtBloco = new JTextField();
        lblCep = new JLabel("CEP:");
        txtCep = new JTextField();
        lblCidade = new JLabel("Cidade:");
        txtCidade = new JTextField();
        lblTelefone = new JLabel("Telefone:");
        txtTelefone = new JTextField();
        lblCelular = new JLabel("Celular:");
        txtCelular = new JTextField();
        lblEmail = new JLabel("Email:");
        txtEmail = new JTextField();
        chkEstudaAtualmenteEtec = new JCheckBox("Estuda atualmente na ETEC");
        chkEstudaOutraEtec = new JCheckBox("Estuda em outra ETEC");
        chkJaEstudouEtec = new JCheckBox("Já estudou na ETEC");
        chkConcluiuEnsinoMedio = new JCheckBox("Concluiu Ensino Médio");
        lblEscolaEnsinoMedio = new JLabel("Escola Ensino Médio:");
        txtEscolaEnsinoMedio = new JTextField();

        painelFormulario.add(lblId);
        painelFormulario.add(txtId);
        painelFormulario.add(lblNome);
        painelFormulario.add(txtNome);
        painelFormulario.add(lblNomeSocial);
        painelFormulario.add(txtNomeSocial);
        painelFormulario.add(lblCpf);
        painelFormulario.add(txtCpf);
        painelFormulario.add(lblGenero);
        painelFormulario.add(txtGenero);
        painelFormulario.add(new JLabel("Afrodescendente:"));
        painelFormulario.add(chkAfrodescendente);
        painelFormulario.add(new JLabel("Escolaridade Pública:"));
        painelFormulario.add(chkEscolaridadePublica);
        painelFormulario.add(lblDataNascimento);
        painelFormulario.add(txtDataNascimento);
        painelFormulario.add(lblLocalNascimento);
        painelFormulario.add(txtLocalNascimento);
        painelFormulario.add(lblNacionalidade);
        painelFormulario.add(txtNacionalidade);
        painelFormulario.add(lblPaisOrigem);
        painelFormulario.add(txtPaisOrigem);
        painelFormulario.add(lblFiliacao1);
        painelFormulario.add(txtFiliacao1);
        painelFormulario.add(lblFiliacao2);
        painelFormulario.add(txtFiliacao2);
        painelFormulario.add(lblResponsavelLegal);
        painelFormulario.add(txtResponsavelLegal);
        painelFormulario.add(lblGrauParentesco);
        painelFormulario.add(txtGrauParentesco);
        painelFormulario.add(lblHabilitacao);
        painelFormulario.add(txtHabilitacao);
        painelFormulario.add(lblPeriodo);
        painelFormulario.add(txtPeriodo);
        painelFormulario.add(lblSerieModulo);
        painelFormulario.add(txtSerieModulo);
        painelFormulario.add(lblRuaAvenida);
        painelFormulario.add(txtRuaAvenida);
        painelFormulario.add(lblBairro);
        painelFormulario.add(txtBairro);
        painelFormulario.add(lblComplemento);
        painelFormulario.add(txtComplemento);
        painelFormulario.add(lblApto);
        painelFormulario.add(txtApto);
        painelFormulario.add(lblBloco);
        painelFormulario.add(txtBloco);
        painelFormulario.add(lblCep);
        painelFormulario.add(txtCep);
        painelFormulario.add(lblCidade);
        painelFormulario.add(txtCidade);
        painelFormulario.add(lblTelefone);
        painelFormulario.add(txtTelefone);
        painelFormulario.add(lblCelular);
        painelFormulario.add(txtCelular);
        painelFormulario.add(lblEmail);
        painelFormulario.add(txtEmail);
        painelFormulario.add(new JLabel("Estuda atualmente na ETEC:"));
        painelFormulario.add(chkEstudaAtualmenteEtec);
        painelFormulario.add(new JLabel("Estuda em outra ETEC:"));
        painelFormulario.add(chkEstudaOutraEtec);
        painelFormulario.add(new JLabel("Já estudou na ETEC:"));
        painelFormulario.add(chkJaEstudouEtec);
        painelFormulario.add(new JLabel("Concluiu Ensino Médio:"));
        painelFormulario.add(chkConcluiuEnsinoMedio);
        painelFormulario.add(lblEscolaEnsinoMedio);
        painelFormulario.add(txtEscolaEnsinoMedio);

        JScrollPane scrollFormulario = new JScrollPane(painelFormulario);

        JPanel painelTopo = new JPanel(new BorderLayout());

        painelTopo.add(
            scrollFormulario,
            BorderLayout.CENTER
        );

        painelTopo.setPreferredSize(
            new Dimension(1000, 350)
        );

        add(painelTopo, BorderLayout.NORTH);

        modeloTabela = new DefaultTableModel(
            new Object[] { "ID", "Nome", "CPF", "Email", "Celular" }, 0
        ) {

            private static final long serialVersionUID = 1L;

            public boolean isCellEditable(int row, int column) {
                return false;
            }
        };

        tabelaClientes = new JTable(modeloTabela);

        JScrollPane scrollPane = new JScrollPane(tabelaClientes);

        scrollPane.setBorder(
            BorderFactory.createTitledBorder("Lista de Clientes")
        );

        add(scrollPane, BorderLayout.CENTER);

        JPanel painelBotoes = new JPanel(
            new FlowLayout(FlowLayout.CENTER, 15, 10)
        );

        btnNovo = new JButton("Novo");
        btnSalvar = new JButton("Salvar");
        btnExcluir = new JButton("Excluir");
        btnLimpar = new JButton("Limpar");

        painelBotoes.add(btnNovo);
        painelBotoes.add(btnSalvar);
        painelBotoes.add(btnExcluir);
        painelBotoes.add(btnLimpar);

        add(painelBotoes, BorderLayout.SOUTH);
    }

    private void configurarEventos() {

        btnNovo.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent e) {
                controller.limpar();
            }
        });

        btnSalvar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent e) {
                controller.salvar();
            }
        });

        btnExcluir.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent e) {
                controller.excluir();
            }
        });

        btnLimpar.addActionListener(new java.awt.event.ActionListener() {

            public void actionPerformed(java.awt.event.ActionEvent e) {
                controller.limpar();
            }
        });

        tabelaClientes.addMouseListener(new MouseAdapter() {

            public void mouseClicked(MouseEvent e) {
                controller.preencherFormulario();
            }
        });
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public JTextField getTxtNome() {
        return txtNome;
    }

    public JTextField getTxtNomeSocial() {
        return txtNomeSocial;
    }

    public JTextField getTxtCpf() {
        return txtCpf;
    }

    public JTextField getTxtGenero() {
        return txtGenero;
    }

    public JTextField getTxtDataNascimento() {
        return txtDataNascimento;
    }

    public JTextField getTxtLocalNascimento() {
        return txtLocalNascimento;
    }

    public JTextField getTxtNacionalidade() {
        return txtNacionalidade;
    }

    public JTextField getTxtPaisOrigem() {
        return txtPaisOrigem;
    }

    public JTextField getTxtFiliacao1() {
        return txtFiliacao1;
    }

    public JTextField getTxtFiliacao2() {
        return txtFiliacao2;
    }

    public JTextField getTxtResponsavelLegal() {
        return txtResponsavelLegal;
    }

    public JTextField getTxtGrauParentesco() {
        return txtGrauParentesco;
    }

    public JTextField getTxtHabilitacao() {
        return txtHabilitacao;
    }

    public JTextField getTxtPeriodo() {
        return txtPeriodo;
    }

    public JTextField getTxtSerieModulo() {
        return txtSerieModulo;
    }

    public JTextField getTxtRuaAvenida() {
        return txtRuaAvenida;
    }

    public JTextField getTxtBairro() {
        return txtBairro;
    }

    public JTextField getTxtComplemento() {
        return txtComplemento;
    }

    public JTextField getTxtApto() {
        return txtApto;
    }

    public JTextField getTxtBloco() {
        return txtBloco;
    }

    public JTextField getTxtCep() {
        return txtCep;
    }

    public JTextField getTxtCidade() {
        return txtCidade;
    }

    public JTextField getTxtTelefone() {
        return txtTelefone;
    }

    public JTextField getTxtCelular() {
        return txtCelular;
    }

    public JTextField getTxtEmail() {
        return txtEmail;
    }

    public JTextField getTxtEscolaEnsinoMedio() {
        return txtEscolaEnsinoMedio;
    }

    public JCheckBox getChkAfrodescendente() {
        return chkAfrodescendente;
    }

    public JCheckBox getChkEscolaridadePublica() {
        return chkEscolaridadePublica;
    }

    public JCheckBox getChkEstudaAtualmenteEtec() {
        return chkEstudaAtualmenteEtec;
    }

    public JCheckBox getChkEstudaOutraEtec() {
        return chkEstudaOutraEtec;
    }

    public JCheckBox getChkJaEstudouEtec() {
        return chkJaEstudouEtec;
    }

    public JCheckBox getChkConcluiuEnsinoMedio() {
        return chkConcluiuEnsinoMedio;
    }

    public JTable getTabelaClientes() {
        return tabelaClientes;
    }
<<<<<<< HEAD
}
=======
}
>>>>>>> 24f01402c9cd41677100957650088234ca2d52cb

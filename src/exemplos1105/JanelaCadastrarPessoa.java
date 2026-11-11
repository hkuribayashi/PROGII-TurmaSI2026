package exemplos1105;

import javax.swing.*;

public class JanelaCadastrarPessoa extends JFrame {
    private PessoaController controller = new PessoaController();

    private JLabel labelNome;

    private JButton botaoCadastrar;
    private JButton botaoConsultar;

    private JTextField textoNome;
    private JTextArea textoResultado;

    public JanelaCadastrarPessoa() {
        initComponents();
    }
    private void initComponents() {
        labelNome = new JLabel();
        textoNome = new JTextField();
        botaoCadastrar = new JButton();
        botaoConsultar = new JButton();
        textoResultado = new JTextArea();
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setTitle("Cadastro de Pessoa");
        setLayout(null);
        labelNome.setText("Nome:");
        labelNome.setBounds(30, 30, 60, 25);
        add(labelNome);
        textoNome.setColumns(20);
        textoNome.setBounds(90, 30, 180, 25);
        add(textoNome);
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(evt -> {
            String nome = textoNome.getText();
            // Verifica se o campo está vazio
//            if (nome.trim().isEmpty()) {
//                JOptionPane.showMessageDialog(
//                        this,
//                        "Por favor, informe um nome!"
//                );
//                return;
//            }
            controller.cadastrarPessoa(nome);
            JOptionPane.showMessageDialog(
                    this,
                    "Pessoa cadastrada com sucesso!"
            );
        });
        botaoCadastrar.setBounds(30, 120, 110, 30);
        add(botaoCadastrar);
        botaoConsultar.setText("Consultar");
        botaoConsultar.addActionListener(evt -> {
            String nome = textoNome.getText();
            Pessoa pessoa = controller.consultarPessoa(nome);
            if (pessoa != null) {
                textoResultado.setText(
                        "ID: " + pessoa.getId()
                                + "\nNome: " + pessoa.getNome()
                );

            } else {
                textoResultado.setText(
                        "Pessoa não encontrada."
                );
            }
        });
        botaoConsultar.setBounds(160, 120, 110, 30);
        add(botaoConsultar);
        textoResultado.setColumns(20);
        textoResultado.setRows(5);
        textoResultado.setBounds(30, 170, 240, 100);
        add(textoResultado);
        setSize(330, 350);
        setLocationRelativeTo(null);
    }
}
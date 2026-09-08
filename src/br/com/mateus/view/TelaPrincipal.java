package br.com.mateus.view;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.MaskFormatter;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.SwingConstants;
import javax.swing.KeyStroke;
import java.awt.event.KeyEvent;
import java.awt.event.InputEvent;
import javax.swing.JSeparator;
import javax.swing.JTabbedPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField txtEmail;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaPrincipal frame = new TelaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public TelaPrincipal() throws Exception {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 965, 558);
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnNewMenu = new JMenu("Aluno");
		menuBar.add(mnNewMenu);
		
		JMenuItem mnSalvarAluno = new JMenuItem("Salvar");
		mnSalvarAluno.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_S, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu.add(mnSalvarAluno);
		
		JMenuItem mnAlterarAluno = new JMenuItem("Alterar");
		mnNewMenu.add(mnAlterarAluno);
		
		JMenuItem mnConsultarAluno = new JMenuItem("Consultar");
		mnNewMenu.add(mnConsultarAluno);
		
		JMenuItem mnExcluirAluno = new JMenuItem("Excluir");
		mnNewMenu.add(mnExcluirAluno);
		
		JSeparator separator = new JSeparator();
		mnNewMenu.add(separator);
		
		JMenuItem mnSair = new JMenuItem("Sair");
		mnSair.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_R, InputEvent.SHIFT_DOWN_MASK));
		mnSair.setHorizontalAlignment(SwingConstants.LEFT);
		mnNewMenu.add(mnSair);
		
		JMenu mnNewMenu_1 = new JMenu("Notas e Faltas");
		menuBar.add(mnNewMenu_1);
		
		JMenuItem mnSalvarNota = new JMenuItem("Salvar");
		mnNewMenu_1.add(mnSalvarNota);
		
		JMenuItem mnAlterarNota = new JMenuItem("Alterar");
		mnAlterarNota.setAccelerator(KeyStroke.getKeyStroke(KeyEvent.VK_A, InputEvent.CTRL_DOWN_MASK));
		mnNewMenu_1.add(mnAlterarNota);
		
		JMenuItem mnConsultarNota = new JMenuItem("Consultar");
		mnNewMenu_1.add(mnConsultarNota);
		
		JMenuItem mnExcluirNota = new JMenuItem("Excluir");
		mnNewMenu_1.add(mnExcluirNota);
		
		JMenu mnNewMenu_2 = new JMenu("Menu");
		menuBar.add(mnNewMenu_2);
		
		JMenuItem mnSobre = new JMenuItem("Sobre");
		mnNewMenu_2.add(mnSobre);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTabbedPane tabbedPane = new JTabbedPane(JTabbedPane.TOP);
		tabbedPane.setBounds(10, 20, 931, 469);
		contentPane.add(tabbedPane);
		
		JPanel pnlDadosPessoais = new JPanel();
		tabbedPane.addTab("Dados Pessoais", null, pnlDadosPessoais, null);
		pnlDadosPessoais.setLayout(null);
		
		JLabel lblRgm = new JLabel("RGM");
		lblRgm.setHorizontalAlignment(SwingConstants.CENTER);
		lblRgm.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblRgm.setBounds(32, 29, 55, 33);
		pnlDadosPessoais.add(lblRgm);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField.setColumns(10);
		textField.setBounds(97, 29, 162, 33);
		pnlDadosPessoais.add(textField);
		
		JLabel lblData = new JLabel("Data de Nascimento");
		lblData.setHorizontalAlignment(SwingConstants.CENTER);
		lblData.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblData.setBounds(30, 100, 211, 33);
		pnlDadosPessoais.add(lblData);
		
		JFormattedTextField txtData = new JFormattedTextField(new MaskFormatter("##/##/####"));
		txtData.setHorizontalAlignment(SwingConstants.LEFT);
		txtData.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtData.setBounds(253, 100, 170, 33);
		pnlDadosPessoais.add(txtData);
		
		textField_1 = new JTextField();
		textField_1.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_1.setColumns(10);
		textField_1.setBounds(384, 29, 472, 33);
		pnlDadosPessoais.add(textField_1);
		
		JLabel lblNome = new JLabel("Nome");
		lblNome.setHorizontalAlignment(SwingConstants.CENTER);
		lblNome.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNome.setBounds(299, 29, 75, 33);
		pnlDadosPessoais.add(lblNome);
		
		JLabel lblCpf = new JLabel("CPF");
		lblCpf.setHorizontalAlignment(SwingConstants.CENTER);
		lblCpf.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCpf.setBounds(483, 100, 75, 33);
		pnlDadosPessoais.add(lblCpf);
		
		JFormattedTextField txtCpf = new JFormattedTextField(new MaskFormatter("###.###.###-##"));
		txtCpf.setHorizontalAlignment(SwingConstants.LEFT);
		txtCpf.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtCpf.setBounds(568, 100, 288, 33);
		pnlDadosPessoais.add(txtCpf);
		
		JLabel lblEmail = new JLabel("Email");
		lblEmail.setHorizontalAlignment(SwingConstants.CENTER);
		lblEmail.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblEmail.setBounds(30, 179, 69, 33);
		pnlDadosPessoais.add(lblEmail);
		
		txtEmail = new JTextField();
		txtEmail.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtEmail.setColumns(10);
		txtEmail.setBounds(109, 179, 747, 33);
		pnlDadosPessoais.add(txtEmail);
		
		textField_2 = new JTextField();
		textField_2.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_2.setColumns(10);
		textField_2.setBounds(109, 252, 747, 33);
		pnlDadosPessoais.add(textField_2);
		
		JLabel lblEndereco = new JLabel("End.");
		lblEndereco.setHorizontalAlignment(SwingConstants.CENTER);
		lblEndereco.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblEndereco.setBounds(32, 252, 55, 33);
		pnlDadosPessoais.add(lblEndereco);
		
		JLabel lblMunicipio = new JLabel("Municipio");
		lblMunicipio.setHorizontalAlignment(SwingConstants.CENTER);
		lblMunicipio.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblMunicipio.setBounds(32, 321, 97, 33);
		pnlDadosPessoais.add(lblMunicipio);
		
		textField_3 = new JTextField();
		textField_3.setFont(new Font("Tahoma", Font.PLAIN, 22));
		textField_3.setColumns(10);
		textField_3.setBounds(152, 321, 205, 33);
		pnlDadosPessoais.add(textField_3);
		
		JLabel lblEstado = new JLabel("UF");
		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblEstado.setBounds(380, 321, 43, 33);
		pnlDadosPessoais.add(lblEstado);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"", "SP", "RJ", "ES", "MG"}));
		comboBox.setBounds(434, 321, 75, 34);
		pnlDadosPessoais.add(comboBox);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setHorizontalAlignment(SwingConstants.CENTER);
		lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCelular.setBounds(531, 321, 83, 33);
		pnlDadosPessoais.add(lblCelular);
		
		JFormattedTextField formattedTextField = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
		formattedTextField.setFont(new Font("Tahoma", Font.PLAIN, 22));
		formattedTextField.setBounds(620, 321, 236, 33);
		pnlDadosPessoais.add(formattedTextField);
		
		JButton btnSalvaAluno = new JButton("Salvar");
		btnSalvaAluno.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSalvaAluno.setBounds(30, 385, 162, 33);
		pnlDadosPessoais.add(btnSalvaAluno);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnLimpar.setBounds(232, 385, 162, 33);
		pnlDadosPessoais.add(btnLimpar);
		
		JPanel pnlCurso = new JPanel();
		tabbedPane.addTab("Curso", null, pnlCurso, null);
		pnlCurso.setLayout(null);
		
		JPanel pnlNotas = new JPanel();
		tabbedPane.addTab("Notas e Faltas", null, pnlNotas, null);
		pnlNotas.setLayout(null);
		
		JPanel pnlBoletim = new JPanel();
		tabbedPane.addTab("Boletim", null, pnlBoletim, null);
		pnlBoletim.setLayout(null);

	}
}

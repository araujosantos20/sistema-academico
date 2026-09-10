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
import javax.swing.ButtonGroup;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JRadioButton;

public class TelaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField txtNome;
	private JTextField txtEmail;
	private JTextField txtEndereco;
	private JTextField txtMunicipio;
	private JTextField txtRgmCurso;
	private JTextField txtRgmNotas;
	private JTextField txtNota;
	private JTextField txtFaltas;

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
		
		txtNome = new JTextField();
		txtNome.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtNome.setColumns(10);
		txtNome.setBounds(384, 29, 472, 33);
		pnlDadosPessoais.add(txtNome);
		
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
		
		txtEndereco = new JTextField();
		txtEndereco.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtEndereco.setColumns(10);
		txtEndereco.setBounds(109, 252, 747, 33);
		pnlDadosPessoais.add(txtEndereco);
		
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
		
		txtMunicipio = new JTextField();
		txtMunicipio.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtMunicipio.setColumns(10);
		txtMunicipio.setBounds(152, 321, 205, 33);
		pnlDadosPessoais.add(txtMunicipio);
		
		JLabel lblEstado = new JLabel("UF");
		lblEstado.setHorizontalAlignment(SwingConstants.CENTER);
		lblEstado.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblEstado.setBounds(380, 321, 43, 33);
		pnlDadosPessoais.add(lblEstado);
		
		JComboBox cmbEstado = new JComboBox();
		cmbEstado.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cmbEstado.setModel(new DefaultComboBoxModel(new String[] {"SP", "RJ", "ES", "MG"}));
		cmbEstado.setBounds(434, 321, 75, 34);
		pnlDadosPessoais.add(cmbEstado);
		
		JLabel lblCelular = new JLabel("Celular");
		lblCelular.setHorizontalAlignment(SwingConstants.CENTER);
		lblCelular.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCelular.setBounds(531, 321, 83, 33);
		pnlDadosPessoais.add(lblCelular);
		
		JFormattedTextField txtCelular = new JFormattedTextField(new MaskFormatter("(##) #####-####"));
		txtCelular.setFont(new Font("Tahoma", Font.PLAIN, 22));
		txtCelular.setBounds(620, 321, 236, 33);
		pnlDadosPessoais.add(txtCelular);
		
		JButton btnSalvaAluno = new JButton("Salvar");
		btnSalvaAluno.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSalvaAluno.setBounds(30, 385, 162, 33);
		pnlDadosPessoais.add(btnSalvaAluno);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnBuscar.setBounds(232, 385, 162, 33);
		pnlDadosPessoais.add(btnBuscar);
		
		JButton btnLimpar = new JButton("Limpar");
		btnLimpar.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnLimpar.setBounds(434, 385, 162, 33);
		pnlDadosPessoais.add(btnLimpar);
		
		JPanel pnlCurso = new JPanel();
		tabbedPane.addTab("Curso", null, pnlCurso, null);
		pnlCurso.setLayout(null);
		
		JLabel lblCurso = new JLabel("Curso");
		lblCurso.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCurso.setBounds(65, 101, 57, 27);
		pnlCurso.add(lblCurso);
		
		JComboBox cmbCurso = new JComboBox();
		cmbCurso.setModel(new DefaultComboBoxModel(new String[] {"Análise e Desenvolvimento de Sistemas", "Ciências da Computação"}));
		cmbCurso.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cmbCurso.setBounds(182, 95, 666, 33);
		pnlCurso.add(cmbCurso);
		
		JComboBox cmbCampus = new JComboBox();
		cmbCampus.setModel(new DefaultComboBoxModel(new String[] {"Tatuapé", "Santo André", "Villa-Lobos", "Liberdade"}));
		cmbCampus.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cmbCampus.setBounds(181, 158, 666, 33);
		pnlCurso.add(cmbCampus);
		
		JLabel lblCampus = new JLabel("Campus");
		lblCampus.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblCampus.setBounds(65, 161, 80, 27);
		pnlCurso.add(lblCampus);
		
		JLabel lblPeriodo = new JLabel("Periodo");
		lblPeriodo.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblPeriodo.setBounds(65, 228, 73, 27);
		pnlCurso.add(lblPeriodo);
		
		JRadioButton rdbMatutino = new JRadioButton("Matutino");
		rdbMatutino.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbMatutino.setBounds(182, 224, 111, 35);
		pnlCurso.add(rdbMatutino);
		
		JRadioButton rdbVespertino = new JRadioButton("Vespertino");
		rdbVespertino.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbVespertino.setBounds(369, 224, 131, 35);
		pnlCurso.add(rdbVespertino);
		
		JRadioButton rdbNoturno = new JRadioButton("Noturno");
		rdbNoturno.setFont(new Font("Tahoma", Font.PLAIN, 22));
		rdbNoturno.setBounds(571, 224, 105, 35);
		pnlCurso.add(rdbNoturno);
		
		ButtonGroup rdgPeriodo = new ButtonGroup();
		rdgPeriodo.add(rdbMatutino);
		rdgPeriodo.add(rdbVespertino);
		rdgPeriodo.add(rdbNoturno);
		
		JLabel lblRgmCurso = new JLabel("RGM");
		lblRgmCurso.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblRgmCurso.setBounds(65, 39, 46, 27);
		pnlCurso.add(lblRgmCurso);
		
		txtRgmCurso = new JTextField();
		txtRgmCurso.setBounds(182, 33, 318, 33);
		pnlCurso.add(txtRgmCurso);
		txtRgmCurso.setColumns(10);
		
		JButton btnSalvarAluno = new JButton("Salvar");
		btnSalvarAluno.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSalvarAluno.setBounds(65, 357, 150, 35);
		pnlCurso.add(btnSalvarAluno);
		
		JButton btnAlterarCurso = new JButton("Alterar");
		btnAlterarCurso.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnAlterarCurso.setBounds(270, 357, 150, 35);
		pnlCurso.add(btnAlterarCurso);
		
		JButton btnExcluirAluno = new JButton("Excluir");
		btnExcluirAluno.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnExcluirAluno.setBounds(483, 357, 150, 35);
		pnlCurso.add(btnExcluirAluno);
		
		JButton btnSair = new JButton("Sair");
		btnSair.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSair.setBounds(698, 357, 150, 35);
		pnlCurso.add(btnSair);
		
		JPanel pnlNotas = new JPanel();
		tabbedPane.addTab("Notas e Faltas", null, pnlNotas, null);
		pnlNotas.setLayout(null);
		
		JLabel lblRgmNotas = new JLabel("RGM");
		lblRgmNotas.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblRgmNotas.setBounds(58, 31, 46, 38);
		pnlNotas.add(lblRgmNotas);
		
		txtRgmNotas = new JTextField();
		txtRgmNotas.setBounds(147, 31, 283, 38);
		pnlNotas.add(txtRgmNotas);
		txtRgmNotas.setColumns(10);
		
		JLabel lblNomeAluno = new JLabel("");
		lblNomeAluno.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNomeAluno.setBounds(418, 31, 457, 38);
		pnlNotas.add(lblNomeAluno);
		
		JLabel lblNomeCurso = new JLabel("");
		lblNomeCurso.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNomeCurso.setBounds(26, 86, 849, 38);
		pnlNotas.add(lblNomeCurso);
		
		JLabel lblDisciplina = new JLabel("Disciplina");
		lblDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblDisciplina.setBounds(26, 158, 92, 27);
		pnlNotas.add(lblDisciplina);
		
		JComboBox cmbDisciplina = new JComboBox();
		cmbDisciplina.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cmbDisciplina.setModel(new DefaultComboBoxModel(new String[] {"Programação Orientada a Objetos", "Análise de Projeto de Sistemas I", "Banco de Dados", "Estrutura de Dados I", "Tópicos Avançados em Sistemas de Informação I"}));
		cmbDisciplina.setBounds(147, 152, 728, 38);
		pnlNotas.add(cmbDisciplina);
		
		JLabel lblSemestre = new JLabel("Semestre");
		lblSemestre.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblSemestre.setBounds(26, 222, 94, 27);
		pnlNotas.add(lblSemestre);
		
		JComboBox cmbSemestre = new JComboBox();
		cmbSemestre.setModel(new DefaultComboBoxModel(new String[] {"2020-1", "2020-2", "2021-1", "2021-2", "2022-1", "2022-2", "2023-1", "2023-2"}));
		cmbSemestre.setFont(new Font("Tahoma", Font.PLAIN, 22));
		cmbSemestre.setBounds(147, 216, 107, 38);
		pnlNotas.add(cmbSemestre);
		
		JLabel lblNota = new JLabel("Nota");
		lblNota.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblNota.setBounds(309, 222, 46, 27);
		pnlNotas.add(lblNota);
		
		JLabel lblFaltas = new JLabel("Faltas");
		lblFaltas.setFont(new Font("Tahoma", Font.PLAIN, 22));
		lblFaltas.setBounds(543, 222, 58, 27);
		pnlNotas.add(lblFaltas);
		
		txtNota = new JTextField();
		txtNota.setColumns(10);
		txtNota.setBounds(390, 216, 107, 38);
		pnlNotas.add(txtNota);
		
		txtFaltas = new JTextField();
		txtFaltas.setColumns(10);
		txtFaltas.setBounds(625, 216, 107, 38);
		pnlNotas.add(txtFaltas);
		
		JButton btnSalvarNotas = new JButton("Salvar");
		btnSalvarNotas.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSalvarNotas.setBounds(26, 331, 149, 38);
		pnlNotas.add(btnSalvarNotas);
		
		JButton btnAlterarNotas = new JButton("Alterar");
		btnAlterarNotas.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnAlterarNotas.setBounds(210, 331, 149, 38);
		pnlNotas.add(btnAlterarNotas);
		
		JButton btnExcluirNotas = new JButton("Excluir");
		btnExcluirNotas.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnExcluirNotas.setBounds(397, 331, 149, 38);
		pnlNotas.add(btnExcluirNotas);
		
		JButton btnSairNotas = new JButton("Sair");
		btnSairNotas.setFont(new Font("Tahoma", Font.PLAIN, 22));
		btnSairNotas.setBounds(583, 331, 149, 38);
		pnlNotas.add(btnSairNotas);
		
		JPanel pnlBoletim = new JPanel();
		tabbedPane.addTab("Boletim", null, pnlBoletim, null);
		pnlBoletim.setLayout(null);

	}
}

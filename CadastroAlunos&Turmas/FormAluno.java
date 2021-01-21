

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.*;
import javax.swing.*;

public class FormAluno extends JFrame {
	
	TurmaDao daoturma = new TurmaDao();
	AlunoDao daoaluno = new AlunoDao();
	
	JLabel lblnomealuno = new JLabel("Nome do aluno:");
	JTextField txtnomealuno = new JTextField(30);
	JLabel lblcpfaluno = new JLabel("Cpf do aluno:");
	JTextField txtcpfaluno = new JTextField(14);
	JLabel lblturma = new JLabel("Turma");
	
	JComboBox<Turma> cboTurmas = new JComboBox<Turma>();
	
	List<Turma> listaturmas = new ArrayList<Turma>();
	
	JButton btnsalvar = new JButton("Salvar");
	JButton btnfechar = new JButton("Fechar");
	
	public FormAluno() {
		setTitle("Cadastro de Alunos"); // título
		setSize(360, 200); // largura e altura do formulário
		setLocationRelativeTo(null); // centralizar
		getContentPane().setBackground(new Color(255, 255, 255)); // cor de fundo
		setLayout(null);
		
		listaturmas = daoturma.listar();
				
		cboTurmas.removeAllItems();
		cboTurmas.addItem(null);
		
		for(Turma t:listaturmas){
			cboTurmas.addItem(t);
		}
				
		lblnomealuno.setBounds(15, 20, 100, 10);
		txtnomealuno.setBounds(120, 17, 150, 20);
		lblcpfaluno.setBounds(15, 50, 100, 10);
		txtcpfaluno.setBounds(120, 47, 150, 20);
		lblturma.setBounds(15, 80, 100, 10);
		cboTurmas.setBounds(120, 77, 150, 20);
		btnsalvar.setBounds(15, 110, 100, 30);
		btnfechar.setBounds(130, 110, 100, 30);
		
		add(lblnomealuno);	
		add(txtnomealuno);
		add(lblcpfaluno);
		add(txtcpfaluno);
		add(lblturma);
		add(cboTurmas);
		add(btnsalvar);
		add(btnfechar);
		
		btnsalvar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				
				Aluno aluno = new Aluno();
				AlunoDao daoaluno = new AlunoDao();
				aluno.setNomealuno(txtnomealuno.getText());
				aluno.setCpfaluno(txtcpfaluno.getText());
				aluno.setCodTurma(cboTurmas.getSelectedIndex());
				daoaluno.cadastrar(aluno);
				JOptionPane.showMessageDialog(null, "Aluno Cadastrado com sucesso \n Turma: "+cboTurmas.getSelectedIndex());
				txtnomealuno.setText(null);	
				txtcpfaluno.setText(null);
				cboTurmas.setSelectedItem(null);
			}
		});
		
		btnfechar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		
	}
}


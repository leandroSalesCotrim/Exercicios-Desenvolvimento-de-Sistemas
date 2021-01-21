import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class FormPrincipal extends JFrame{
	  
	JLabel lbltitulo = new JLabel("CADASTRO ESCOLAR");
	Font fonteTitulo = new Font("Verdana", Font.BOLD, 20);
	
	JButton btnturma = new JButton("Cadastro de Turmas");
	JButton btnaluno = new JButton("Cadastro de Alunos");
	JButton btnsair = new JButton("Sair");
	
	
	public FormPrincipal() {
		setTitle("CADASTRO ESCOLAR"); // título
		setSize(800, 500); // largura e altura do formulário
		setLocationRelativeTo(null); // centralizar
		getContentPane().setBackground(new Color(44,44,44)); // cor de fundo
		
		setLayout(null);
		
		lbltitulo.setFont(fonteTitulo);// Fonte do titulo
		lbltitulo.setForeground(Color.white); // cor da fonte do titulo
		
		
//		lbltitulo.setBounds(x, y, width, height);
		lbltitulo.setBounds(280, 40, 300, 50);
		btnturma.setBounds(240, 200, 200, 30);
		btnaluno.setBounds(240, 240, 200, 30);
		btnsair.setBounds(450, 200, 80, 70);
		
//		Alterando a cor e tirando as bordas		
		btnsair.setBackground(Color.white);
		btnaluno.setBackground(Color.white);
		btnturma.setBackground(Color.white);
		btnturma.setBorderPainted(false);
		btnsair.setBorderPainted(false);
		btnaluno.setBorderPainted(false);
		
		
		add(lbltitulo);
		add(btnturma);
		add(btnaluno);
		add(btnsair);
		
		btnturma.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FormTurma fturma = new FormTurma();
				fturma.setVisible(true);//abre novo formulário
			}
		});
		
		btnaluno.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				FormAluno faluno = new FormAluno();
				faluno.setVisible(true);
			}
		});
		
		btnsair.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent arg0) {
				dispose(); //fechar formulário				
			}
		});
	}
}

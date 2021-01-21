
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;

public class FormTurma extends JFrame {
	
	JLabel lblnometurma = new JLabel("Nome da turma:");
	Font fonteTitulo = new Font("Verdana", Font.BOLD, 14);
	JTextField txtnometurma = new JTextField(20);
	JButton btnsalvar = new JButton("Salvar");
	JButton btnfechar = new JButton("Fechar");
	
	public FormTurma() {
		setTitle("Cadastro de Turmas"); // título
		setSize(340, 200); // largura e altura do formulário
		setLocationRelativeTo(null); // centralizar
		getContentPane().setBackground(new Color(44,44,44)); // cor de fundo
		setLayout(null);
		
		lblnometurma.setFont(fonteTitulo);// Fonte do titulo
		lblnometurma.setForeground(Color.white);// cor da fonte do titulo
		
//		lbltitulo.setBounds(x, y, width, height);
		lblnometurma.setBounds(10, 30, 130, 15);
		txtnometurma.setBounds(140, 30, 150, 20);
		btnsalvar.setBounds(60, 90, 100, 30);
		btnfechar.setBounds(170, 90, 100, 30);
		
//		Alterando a cor e tirando as bordas
		btnsalvar.setBackground(Color.white);
		btnfechar.setBackground(Color.white);
		btnfechar.setBorderPainted(false);
		btnsalvar.setBorderPainted(false);

		
		
		add(lblnometurma);	
		add(txtnometurma);
		add(btnsalvar);
		add(btnfechar);

		btnsalvar.addActionListener(new ActionListener() {			
			@Override
			public void actionPerformed(ActionEvent e) {
				Turma turma = new Turma();
				TurmaDao daoturma = new TurmaDao();
				turma.setNometurma(txtnometurma.getText());
				daoturma.cadastrar(turma);				
				
				JOptionPane.showMessageDialog(null, "Turma cadastrada com sucesso \n Turma: "+turma.getNometurma());
				txtnometurma.setText(null);
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

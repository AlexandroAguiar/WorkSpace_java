import java.awt.Font;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JFrame;
import javax.swing.JLabel;

public class TelinhaDoTimer extends JFrame implements Runnable, MouseListener{
	
	private int tempo;
	private JLabel rotulo;
	private Thread thread;
	
	public TelinhaDoTimer() {
		
		tempo = 10;
		setSize(400,300);
		setTitle("Telinha do Timer");
		setVisible(true);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(null);
		rotulo = new JLabel();
		rotulo.setBounds(100, 100, 100, 100);
		rotulo.setFont(new Font("Arial",1, 45));
		rotulo.setText(tempo+" ");
		getContentPane().add(rotulo);
		
	    addMouseListener(this);
		thread = new Thread(this);
				
	}

	@Override
	public void run() {
		while (tempo > 0) {
			try {
				tempo--;
				rotulo.setText(tempo+" ");
				Thread.sleep(1000);
			}
			catch(Exception ex) {
				System.out.println("deu ruim");
			}
		}
		thread = null; 
	}

	@Override
	public void mouseClicked(MouseEvent e) {
		if (thread != null)
			thread.start();
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("Entrei com o mouse na tela");
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		System.out.println("saí da tela");
	}

}
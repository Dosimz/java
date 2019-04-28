package pepsi;

import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.BorderLayout;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JTextPane;

import pepsi.UserCntion;

public class pepsiGui {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JLabel lblNewLabel_2;
	private JTextField textField_2;
	private JButton btnNewButton_1;
	private JLabel lblNewLabel_3;
	String iadress;
	int port;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					pepsiGui window = new pepsiGui();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public pepsiGui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 538, 492);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("服务器主机名:");
		lblNewLabel.setBounds(12, 12, 88, 37);
		frame.getContentPane().add(lblNewLabel);
		
		textField = new JTextField("localhost");
		textField.setBounds(102, 20, 114, 21);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("服务器端口号:");
		lblNewLabel_1.setBounds(245, 22, 88, 17);
		frame.getContentPane().add(lblNewLabel_1);
		
		textField_1 = new JTextField("7");
		textField_1.setBounds(333, 20, 46, 21);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("连接服务器");
		btnNewButton.setBounds(408, 17, 107, 27);
		frame.getContentPane().add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e) {
			iadress = textField.getText();
			port = Integer.parseInt(textField_1.getText());
			System.out.println(iadress + port);
		}
		});

		
		lblNewLabel_2 = new JLabel("待发送消息:");
		lblNewLabel_2.setBounds(12, 85, 88, 17);
		frame.getContentPane().add(lblNewLabel_2);
		
		textField_2 = new JTextField();
		textField_2.setBounds(102, 83, 276, 21);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		btnNewButton_1 = new JButton("发   言");
		btnNewButton_1.setBounds(408, 80, 107, 27);
		frame.getContentPane().add(btnNewButton_1);
		
		lblNewLabel_3 = new JLabel("服务器 Echo 消息面板");
		lblNewLabel_3.setBounds(12, 152, 151, 17);
		frame.getContentPane().add(lblNewLabel_3);
		
		JTextPane textPane = new JTextPane();
		textPane.setBounds(12, 181, 509, 263);
		frame.getContentPane().add(textPane);
	}

//	@Override
//	public void actionPerformed(ActionEvent e) {
//		// TODO Auto-generated method stub
//	}

}

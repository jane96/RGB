package rgb;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.BorderLayout;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class ToRgb {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					ToRgb window = new ToRgb();
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
	public ToRgb() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		textField = new JTextField();
		textField.setBounds(75, 55, 66, 21);
		panel.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(179, 55, 66, 21);
		panel.add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(273, 55, 66, 21);
		panel.add(textField_2);
		textField_2.setColumns(10);
		
		JLabel lblrgb = new JLabel("\u8BF7\u8F93\u5165RGB\u7684\u503C");
		lblrgb.setFont(new Font("»ªÎÄÁ¥Êé", Font.BOLD, 15));
		lblrgb.setBounds(47, 30, 100, 15);
		panel.add(lblrgb);
		
		JButton btnNewButton = new JButton("\u786E\u8BA4");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int t1=Integer.parseInt(textField.getText().toString());
				int t2=Integer.parseInt(textField_1.getText().toString());
				int t3=Integer.parseInt(textField_2.getText().toString());
				String result="";
				result=Integer.toHexString(t1)+	Integer.toHexString(t2)+	Integer.toHexString(t3);
				result=result.toUpperCase();
				textField_3.setText(result);
				
			}
		});
		btnNewButton.setBounds(349, 54, 93, 23);
		panel.add(btnNewButton);
		
		textField_3 = new JTextField();
		textField_3.setBounds(128, 128, 100, 21);
		panel.add(textField_3);
		textField_3.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("\u7ED3\u679C\u4E3A:");
		lblNewLabel.setBounds(49, 131, 54, 15);
		panel.add(lblNewLabel);
	}
}

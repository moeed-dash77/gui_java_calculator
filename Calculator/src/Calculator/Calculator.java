package Calculator;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.JTextField;
import javax.swing.JRadioButton;
import javax.swing.LayoutStyle.ComponentPlacement;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;
import javax.swing.ButtonGroup;
import javax.swing.JLabel;

public class Calculator extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private final ButtonGroup buttonGroup = new ButtonGroup();
	public double num1,num2,result;
	public String op;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator frame = new Calculator();
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
	public Calculator() {
		setFont(new Font("Chilanka", Font.BOLD, 14));
		setTitle("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 396, 514);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		
		
		textField = new JTextField();
		textField.setFont(new Font("Dialog", Font.PLAIN, 21));
		textField.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("");
		
		JButton btnNewButton = new JButton("Backspace");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int length = textField.getText().length();
				int number = textField.getText().length() - 1;
				
				if (length > 0) {
					
					StringBuilder obj = new StringBuilder(textField.getText());
					obj.deleteCharAt(number);
					String store;
					store = obj.toString();
					textField.setText(store);
					
				}
				
			}
		});
		
		JButton btnNewButton_1 = new JButton("Cancel");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText("");
				lblNewLabel.setText("");
			}
		});
		
		JButton btnNewButton_2 = new JButton("7");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "7");
			}
		});
		
		JButton btnNewButton_2_1 = new JButton("8");
		btnNewButton_2_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "8");
			}
		});
		
		JButton btnNewButton_2_2 = new JButton("9");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "9");
			}
		});
		
		JButton btnNewButton_2_3 = new JButton("/");
		btnNewButton_2_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "/";
				lblNewLabel.setText(num1 + "/");
			}
		});
		
		JButton btnNewButton_2_4 = new JButton("4");
		btnNewButton_2_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "4");
			}
		});
		
		JButton btnNewButton_2_5 = new JButton("5");
		btnNewButton_2_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "5");
			}
		});
		
		JButton btnNewButton_2_6 = new JButton("6");
		btnNewButton_2_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "6");
			}
		});
		
		JButton btnNewButton_2_7 = new JButton("*");
		btnNewButton_2_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "*";
				lblNewLabel.setText(num1 + "*");
			}
		});
		
		JButton btnNewButton_2_8 = new JButton("1");
		btnNewButton_2_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "1");
			}
		});
		
		JButton btnNewButton_2_9 = new JButton("2");
		btnNewButton_2_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "2");
			}
		});
		
		JButton btnNewButton_2_10 = new JButton("3");
		btnNewButton_2_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "3");
			}
		});
		
		JButton btnNewButton_2_11 = new JButton("-");
		btnNewButton_2_11.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "-";
				lblNewLabel.setText(num1 + "-");
			}
		});
		
		JButton btnNewButton_2_12 = new JButton("0");
		btnNewButton_2_12.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + "0");
			}
		});
		
		JButton btnNewButton_2_14 = new JButton("=");
		btnNewButton_2_14.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				num2 = Double.parseDouble(textField.getText());
				switch (op)
				{
					case "+":
						result = num1 + num2;
						break;
					case "-":
						result = num1 - num2;
						break;
					case "*":
						result = num1 * num2;
						break;
						
					case "/":
						result = num1 / num2;
						break;
					default:
						result = 0;
						
				}
				lblNewLabel.setText(Double.toString(num1)+ op +Double.toString(num2));
				textField.setText(Double.toString(result));
			}
		});
		
		JButton btnNewButton_2_13 = new JButton(".");
		btnNewButton_2_13.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(textField.getText() + ".");
				
			}
		});
		
		JButton btnNewButton_2_15 = new JButton("+");
		btnNewButton_2_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				num1 = Double.parseDouble(textField.getText());
				textField.setText("");
				op = "+";
				lblNewLabel.setText(num1 + "+");
				
			}
		});
		
		JRadioButton rdbtnOn = new JRadioButton("ON");
		rdbtnOn.setSelected(true);
		buttonGroup.add(rdbtnOn);
		rdbtnOn.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
					btnNewButton.setEnabled(true);
					btnNewButton_1.setEnabled(true);
					btnNewButton_2.setEnabled(true);
					btnNewButton_2_1.setEnabled(true);
					btnNewButton_2_2.setEnabled(true);
					btnNewButton_2_3.setEnabled(true);
					btnNewButton_2_4.setEnabled(true);
					btnNewButton_2_5.setEnabled(true);
					btnNewButton_2_6.setEnabled(true);
					btnNewButton_2_7.setEnabled(true);
					btnNewButton_2_8.setEnabled(true);
					btnNewButton_2_9.setEnabled(true);
					btnNewButton_2_10.setEnabled(true);
					btnNewButton_2_11.setEnabled(true);
					btnNewButton_2_12.setEnabled(true);
					btnNewButton_2_13.setEnabled(true);
					btnNewButton_2_14.setEnabled(true);
					btnNewButton_2_15.setEnabled(true);					
				}
			});
		
		JRadioButton rdbtnOff = new JRadioButton("OFF");
		buttonGroup.add(rdbtnOff);
		rdbtnOff.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
					
					btnNewButton.setEnabled(false);
					btnNewButton_1.setEnabled(false);
					btnNewButton_2.setEnabled(false);
					btnNewButton_2_1.setEnabled(false);
					btnNewButton_2_2.setEnabled(false);
					btnNewButton_2_3.setEnabled(false);
					btnNewButton_2_4.setEnabled(false);
					btnNewButton_2_5.setEnabled(false);
					btnNewButton_2_6.setEnabled(false);
					btnNewButton_2_7.setEnabled(false);
					btnNewButton_2_8.setEnabled(false);
					btnNewButton_2_9.setEnabled(false);
					btnNewButton_2_10.setEnabled(false);
					btnNewButton_2_11.setEnabled(false);
					btnNewButton_2_12.setEnabled(false);
					btnNewButton_2_13.setEnabled(false);
					btnNewButton_2_14.setEnabled(false);
					btnNewButton_2_15.setEnabled(false);					
				}
			});
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addComponent(textField, GroupLayout.PREFERRED_SIZE, 359, GroupLayout.PREFERRED_SIZE)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton_2_4, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnNewButton_2_5, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton_2_8, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnNewButton_2_9, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton_2_12, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnNewButton_2_13, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
										.addComponent(rdbtnOn)
										.addComponent(rdbtnOff))
									.addGap(18)
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)))
							.addGap(6)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton_1, GroupLayout.PREFERRED_SIZE, 89, GroupLayout.PREFERRED_SIZE)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(lblNewLabel))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(btnNewButton_2_6, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnNewButton_2_7, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton_2_10, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnNewButton_2_11, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton_2_14, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnNewButton_2_15, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE))
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(btnNewButton_2_2, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)
									.addGap(18)
									.addComponent(btnNewButton_2_3, GroupLayout.PREFERRED_SIZE, 73, GroupLayout.PREFERRED_SIZE)))))
					.addGap(283))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap()
					.addComponent(textField, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
					.addPreferredGap(ComponentPlacement.RELATED)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
								.addGroup(gl_contentPane.createSequentialGroup()
									.addComponent(rdbtnOn)
									.addPreferredGap(ComponentPlacement.RELATED)
									.addComponent(rdbtnOff))
								.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
									.addComponent(btnNewButton, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
									.addComponent(btnNewButton_1, GroupLayout.DEFAULT_SIZE, 46, Short.MAX_VALUE)))
							.addGap(23))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addComponent(lblNewLabel, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
							.addPreferredGap(ComponentPlacement.RELATED)))
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2_1, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2_2, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2_3, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_2_4, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_2_5, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
							.addGap(18)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_2_8, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_2_9, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_2_10, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_2_11, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addPreferredGap(ComponentPlacement.RELATED)
							.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
								.addComponent(btnNewButton_2_6, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
								.addComponent(btnNewButton_2_7, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))))
					.addGap(18)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.BASELINE)
						.addComponent(btnNewButton_2_12, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2_13, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2_14, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE)
						.addComponent(btnNewButton_2_15, GroupLayout.PREFERRED_SIZE, 62, GroupLayout.PREFERRED_SIZE))
					.addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
		);
		contentPane.setLayout(gl_contentPane);
		
	}
}



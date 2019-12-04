import java.awt.BorderLayout;
import java.awt.Color;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridBagLayout;
import javax.swing.JLabel;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.GridLayout;
import java.awt.FlowLayout;
import javax.swing.BoxLayout;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;

import javax.swing.JTextField;
import javax.swing.JTextPane;

public class UserInterface extends JFrame{
	private JTextField txtName;
	private JTextField txtMass;
	private JTextField txtXVelocity;
	private JTextField txtYVelocity;
	private JTextField txtXPosition;
	private JTextField txtYPosition;
	private JTextField txtMars;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField txtPrintInterval;
	public UserInterface() {
		getContentPane().setBackground(Color.LIGHT_GRAY);
		setTitle("Gravity");
		getContentPane().setLayout(null);
		
		JLabel lblObjectOne = new JLabel("Object One:");
		lblObjectOne.setBounds(10, 0, 76, 14);
		getContentPane().add(lblObjectOne);
		
		txtName = new JTextField();
		txtName.setText("Earth");
		txtName.setBounds(10, 37, 152, 20);
		getContentPane().add(txtName);
		txtName.setColumns(10);
		
		txtMass = new JTextField();
		txtMass.setText("300000");
		txtMass.setBounds(10, 81, 152, 20);
		getContentPane().add(txtMass);
		txtMass.setColumns(10);
		
		txtXVelocity = new JTextField();
		txtXVelocity.setText("10");
		txtXVelocity.setBounds(10, 126, 152, 20);
		getContentPane().add(txtXVelocity);
		txtXVelocity.setColumns(10);
		
		txtYVelocity = new JTextField();
		txtYVelocity.setText("10");
		txtYVelocity.setBounds(10, 169, 152, 20);
		getContentPane().add(txtYVelocity);
		txtYVelocity.setColumns(10);
		
		txtXPosition = new JTextField();
		txtXPosition.setText("500");
		txtXPosition.setBounds(10, 214, 152, 20);
		getContentPane().add(txtXPosition);
		txtXPosition.setColumns(10);
		
		txtYPosition = new JTextField();
		txtYPosition.setText("1000");
		txtYPosition.setBounds(10, 258, 152, 20);
		getContentPane().add(txtYPosition);
		txtYPosition.setColumns(10);
		
		JLabel lblObject = new JLabel("Object 2:");
		lblObject.setBounds(172, 0, 46, 14);
		getContentPane().add(lblObject);
		
		txtMars = new JTextField();
		txtMars.setText("Mars");
		txtMars.setColumns(10);
		txtMars.setBounds(172, 37, 152, 20);
		getContentPane().add(txtMars);
		
		textField_1 = new JTextField();
		textField_1.setText("200000");
		textField_1.setColumns(10);
		textField_1.setBounds(172, 81, 152, 20);
		getContentPane().add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setText("15");
		textField_2.setColumns(10);
		textField_2.setBounds(172, 126, 152, 20);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setText("-12");
		textField_3.setColumns(10);
		textField_3.setBounds(172, 169, 152, 20);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("30000");
		textField_4.setColumns(10);
		textField_4.setBounds(172, 214, 152, 20);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("500");
		textField_5.setColumns(10);
		textField_5.setBounds(172, 258, 152, 20);
		getContentPane().add(textField_5);
		
		txtPrintInterval = new JTextField();
		txtPrintInterval.setText("3600");
		txtPrintInterval.setBounds(373, 37, 86, 20);
		getContentPane().add(txtPrintInterval);
		txtPrintInterval.setColumns(10);
		
		JLabel lblName = new JLabel("Name: ");
		lblName.setBounds(10, 25, 46, 14);
		getContentPane().add(lblName);
		
		JLabel lblMass = new JLabel("Mass:");
		lblMass.setBounds(10, 68, 46, 14);
		getContentPane().add(lblMass);
		
		JLabel lblXComponentVelocity = new JLabel("X component Velocity:");
		lblXComponentVelocity.setBounds(10, 110, 152, 14);
		getContentPane().add(lblXComponentVelocity);
		
		JLabel lblYComponentVelocity = new JLabel("Y component Velocity:");
		lblYComponentVelocity.setBounds(10, 157, 152, 14);
		getContentPane().add(lblYComponentVelocity);
		
		JLabel lblXPosition = new JLabel("X Position:");
		lblXPosition.setBounds(10, 200, 112, 14);
		getContentPane().add(lblXPosition);
		
		JLabel lblYPosition = new JLabel("Y Position:");
		lblYPosition.setBounds(10, 245, 112, 14);
		getContentPane().add(lblYPosition);
		
		JLabel lblPrintInterval = new JLabel("Print Interval:");
		lblPrintInterval.setBounds(373, 25, 86, 14);
		getContentPane().add(lblPrintInterval);
		
		JTextPane txtpnBasedOnSeveral = new JTextPane();
		txtpnBasedOnSeveral.setText("Based on your inputs, the gravity between the objects will be calculated until they either exit the region or collide. Positions must be less than 10,000. ");
		txtpnBasedOnSeveral.setBounds(334, 200, 246, 78);
		getContentPane().add(txtpnBasedOnSeveral);
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				txtpnBasedOnSeveral.setText("Calculation Done");
				try {
					PhysDriver.run();
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCalculate.setBounds(373, 80, 169, 23);
		getContentPane().add(btnCalculate);
		
		JButton btnDowloadReadableFile = new JButton("Dowload Readable File");
		btnDowloadReadableFile.setBounds(373, 125, 169, 23);
		getContentPane().add(btnDowloadReadableFile);
		
		JButton btnDownloadMathematicaFile = new JButton("Download Mathematica File");
		btnDownloadMathematicaFile.setBounds(373, 168, 169, 23);
		getContentPane().add(btnDownloadMathematicaFile);
		
	}
	public static void main(String[] args) {
		
		UserInterface m = new UserInterface();
		m.setSize(600, 320);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible(true);
		
		
	}
}

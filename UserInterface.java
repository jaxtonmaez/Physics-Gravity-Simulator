import java.awt.Color;
import java.awt.Desktop;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.IOException;
import javax.swing.JTextField;
import javax.swing.JTextPane;

@SuppressWarnings("serial")
public class UserInterface extends JFrame{
	private JTextField txtName;
	private JTextField txtMass;
	private JTextField txtXVelocity;
	private JTextField txtYVelocity;
	private JTextField txtXPosition;
	private JTextField txtYPosition;
	private JTextField txtName2;
	private JTextField txtMass2;
	private JTextField txtXVelocity2;
	private JTextField txtYVelocity2;
	private JTextField txtXPosition2;
	private JTextField txtYPosition2;
	private JTextField txtPrintInterval;
	
    public static Space sp = new Space(10000,10000);    //A square region of space with side length 50;
	public static double maxDistance = Math.pow(Math.pow(sp.getHeight(),2)+Math.pow(sp.getWidth(), 2),2); //max distance of region 
	private static Object ob = new Planet("Null", 300000, 10, 10, sp, 0, 0);   //create an object
	private static Object ob2 = new Planet("Null", 200000, 0, 0, sp, 0, 0);
	
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
		txtMass.setText("10000");
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
		txtXPosition.setText("1");
		txtXPosition.setBounds(10, 214, 152, 20);
		getContentPane().add(txtXPosition);
		txtXPosition.setColumns(10);
		
		txtYPosition = new JTextField();
		txtYPosition.setText("1");
		txtYPosition.setBounds(10, 258, 152, 20);
		getContentPane().add(txtYPosition);
		txtYPosition.setColumns(10);
		
		JLabel lblObject = new JLabel("Object 2:");
		lblObject.setBounds(172, 0, 112, 14);
		getContentPane().add(lblObject);
		
		txtName2 = new JTextField();
		txtName2.setText("Mars");
		txtName2.setColumns(10);
		txtName2.setBounds(172, 37, 152, 20);
		getContentPane().add(txtName2);
		
		txtMass2 = new JTextField();
		txtMass2.setText("10000");
		txtMass2.setColumns(10);
		txtMass2.setBounds(172, 81, 152, 20);
		getContentPane().add(txtMass2);
		
		txtXVelocity2 = new JTextField();
		txtXVelocity2.setText("10");
		txtXVelocity2.setColumns(10);
		txtXVelocity2.setBounds(172, 126, 152, 20);
		getContentPane().add(txtXVelocity2);
		
		txtYVelocity2 = new JTextField();
		txtYVelocity2.setText("10");
		txtYVelocity2.setColumns(10);
		txtYVelocity2.setBounds(172, 169, 152, 20);
		getContentPane().add(txtYVelocity2);
		
		txtXPosition2 = new JTextField();
		txtXPosition2.setText("15");
		txtXPosition2.setColumns(10);
		txtXPosition2.setBounds(172, 214, 152, 20);
		getContentPane().add(txtXPosition2);
		
		txtYPosition2 = new JTextField();
		txtYPosition2.setText("15");
		txtYPosition2.setColumns(10);
		txtYPosition2.setBounds(172, 258, 152, 20);
		getContentPane().add(txtYPosition2);
		
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
		txtpnBasedOnSeveral.setText("Based on your inputs, the gravity between the objects will be calculated until they either exit the region or collide. "
				+ "Positions must be less than 10,000 and Mass must be positive.\nNo zero nor empty values!"
				+ "\nProgram can take a very long time to calculate all values. ");
		txtpnBasedOnSeveral.setBounds(10, 289, 532, 122);
		getContentPane().add(txtpnBasedOnSeveral);
		

		
		
		JButton btnCalculate = new JButton("Calculate");
		btnCalculate.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				ob.setName(txtName.getText());
				ob.setMass(Double.parseDouble(txtMass.getText())); 
				ob.setvelocX(Double.parseDouble(txtXVelocity.getText()));
				ob.setvelocY(Double.parseDouble(txtYVelocity.getText()));
				ob.setX(Double.parseDouble(txtXPosition.getText()));
				ob.setvelocY(Double.parseDouble(txtYPosition.getText()));
				ob2.setName(txtName2.getText());
				ob2.setMass(Double.parseDouble(txtMass2.getText())); 
				ob2.setvelocX(Double.parseDouble(txtXVelocity2.getText()));
				ob2.setvelocY(Double.parseDouble(txtYVelocity2.getText()));
				ob2.setX(Double.parseDouble(txtXPosition2.getText()));
				ob2.setvelocY(Double.parseDouble(txtYPosition2.getText()));
				Physics.setPrintInterval(Integer.parseInt(txtPrintInterval.getText()));

				try {
					String data = Physics.run(ob, ob2);
					txtpnBasedOnSeveral.setText("Calculation Done \n"+data+" Check data file for more info.");
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnCalculate.setBounds(352, 80, 190, 23);
		getContentPane().add(btnCalculate);
		
		JButton btnOpenReadableData = new JButton("Open Readable Data");
		btnOpenReadableData.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().open(new java.io.File("data.txt"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnOpenReadableData.setBounds(352, 125, 190, 23);
		getContentPane().add(btnOpenReadableData);
		
		JButton btnOpenMathematicaFile = new JButton("Open Mathematica File");
		btnOpenMathematicaFile.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().open(new java.io.File("DataPlotter.nb"));
				} catch (IOException e1) {
					e1.printStackTrace();
				}
			}
		});
		btnOpenMathematicaFile.setBounds(352, 213, 190, 23);
		getContentPane().add(btnOpenMathematicaFile);
		
		JButton btnOpenMathematicaData = new JButton("Open Mathematica Data");
		btnOpenMathematicaData.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Desktop.getDesktop().open(new java.io.File("MathematicaData.txt"));
				} catch (IOException | IllegalArgumentException e1) {
					txtpnBasedOnSeveral.setText("Error getting or reading file.");
					e1.printStackTrace();
				}
			}
		});
		btnOpenMathematicaData.setBounds(352, 168, 190, 23);
		getContentPane().add(btnOpenMathematicaData);
		
	}
	public static void main(String[] args) {
		
		UserInterface m = new UserInterface();
		m.setSize(590, 470);
		m.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		m.setVisible(true);
		
		
	}
}

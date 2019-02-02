package zNullLayout;
import java.awt.*;
import javax.swing.*;

class PantallaNullLayout extends JFrame{
	PantallaNullLayout() {
		
		getContentPane().setLayout(null);
		setSize(700, 550);
		setTitle(">>>>>FORMULARIO<<<<<");
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setVisible(true);
		
		JLabel lbl1=new JLabel("The classic form includes all visible fields for");
		Font actual=lbl1.getFont();
		lbl1.setFont(new Font(actual.getFontName(),Font.PLAIN,12));
		lbl1.setBounds(10, -30, 260, 90);
		add(lbl1);
		
		
		JLabel lbl2=new JLabel("for this list");
		lbl2.setFont(new Font(actual.getFontName(),Font.PLAIN,12));
		lbl2.setBounds(10,-15,260,90);
		add(lbl2);
		
		JLabel lbl3=new JLabel("Form Options");

		lbl3.setFont(new Font(actual.getFontName(),Font.PLAIN,15));
		lbl3.setBounds(10,5,260,90);
		add(lbl3);
		
		JLabel lbl4=new JLabel("Include the following");
		lbl4.setFont(new Font(actual.getFontName(),Font.PLAIN,12));
		lbl4.setBounds(10,25,260,90);
		add(lbl4);
		
		JCheckBox cb1=new JCheckBox();
		cb1.setBounds(10, 85, 20, 20);
		add(cb1);
		
		
		JLabel lbl5=new JLabel(" a title for you form");
		lbl5.setFont(new Font(actual.getFontName(),Font.PLAIN,12));
		lbl5.setBounds(30,85,120,25);
		add(lbl5);
		
		
		JTextField caja1=new JTextField("Subscribe to our mailing list",10);
		caja1.setBounds(10,110,250,30);
		add(caja1);
		
		ButtonGroup bg =new ButtonGroup();
		
		JRadioButton onlyB=new JRadioButton("only required fileds");
		onlyB.setBounds(10,170,145,20);
		bg.add(onlyB);
		add(onlyB);
		JRadioButton allB=new JRadioButton("all fields");
		allB.setBounds(10,190,120,20);
		bg.add(allB);
		add(allB);
		
		JLabel lbl6=new JLabel("(edit required fields in");
		lbl6.setFont(new Font(actual.getFontName(),Font.PLAIN,12));
		lbl6.setBounds(20,210,150,25);
		add(lbl6);
		
		JLabel lbl7=new JLabel("the form builder");
		lbl7.setFont(new Font(actual.getFontName(),Font.PLAIN,12));
		lbl7.setForeground(new Color(0, 0, 255));
		lbl7.setBounds(145,210,150,25);
		add(lbl7);
		
		
		JLabel lbl=new JLabel(")");
		lbl.setFont(new Font(actual.getFontName(),Font.PLAIN,12));
		lbl.setBounds(233,210,150,25);
		add(lbl);
		
		
		JCheckBox cb2=new JCheckBox("interest group fields",true);
		cb2.setBounds(10, 265, 150, 20);
		add(cb2);
		
		JCheckBox cb3=new JCheckBox("required field indicators",true);
		cb3.setBounds(10, 290, 160, 20);
		add(cb3);
		
		
		JLabel lbl8=new JLabel("Set form width");
		lbl8.setFont(new Font(actual.getFontName(),Font.PLAIN,12));
		lbl8.setBounds(10,330,120,20);
		add(lbl8);
		
		JTextField caja2=new JTextField("Subscribe to our mailing list",10);
		caja2.setBounds(10,350,250,30);
		add(caja2);
		

		JLabel lbl9=new JLabel("Enhance your form");
		lbl9.setFont(new Font(actual.getFontName(),Font.PLAIN,12));
		lbl9.setBounds(10,390,120,20);
		add(lbl9);
		
		JCheckBox cb4=new JCheckBox("enable evil popup mode",false);
		cb4.setBounds(10, 410, 180, 20);
		add(cb4);
		
		JCheckBox cb5=new JCheckBox("disable all JavaScript",false);
		cb5.setToolTipText("(!)info");
		cb5.setBounds(10, 435, 180, 20);
		add(cb5);
		
		JCheckBox cb6=new JCheckBox("include archive link",false);
		cb6.setToolTipText("(!)info");
		cb6.setBounds(10, 460, 180, 20);
		add(cb6);
		
		JCheckBox cb7=new JCheckBox("include MonkeyRewards link",false);
		cb7.setBounds(10, 485, 180, 20);
		add(cb7);
		
		JPanel panel1=new JPanel();
		panel1.setLayout(null);
		panel1.setBackground(Color.WHITE);
		panel1.setBounds(290, 30, 380,220);
		
		JLabel lbl12=new JLabel("Preview");
		lbl12.setFont(new Font(actual.getFontName(),Font.PLAIN,15));
		lbl12.setBounds(290,10,150,13);
		add(lbl12);
		
		JLabel lbl10=new JLabel("*indicates required");
		lbl10.setFont(new Font(actual.getFontName(),Font.PLAIN,10));
		lbl10.setBounds(250,0,100,10);
		panel1.add(lbl10);
		
		
		
		JLabel lbl18=new JLabel("Email Adress");
		lbl18.setFont(new Font(actual.getFontName(),Font.PLAIN,12));
		lbl18.setBounds(15,-10,100,50);
		panel1.add(lbl18);
		
		JTextField caja3=new JTextField(10);
		caja3.setBounds(15,30,360,30);
		panel1.add(caja3);
		
		JLabel lbl13=new JLabel("First Name");
		lbl13.setFont(new Font(actual.getFontName(),Font.PLAIN,12));
		lbl13.setBounds(15,50,100,50);
		panel1.add(lbl13);
		
		JTextField caja4=new JTextField(10);
		caja4.setBounds(15,90,360,30);
		panel1.add(caja4);
		
		JLabel lbl14=new JLabel("Last Name");
		lbl14.setFont(new Font(actual.getFontName(),Font.PLAIN,12));
		lbl14.setBounds(15,110,100,50);
		panel1.add(lbl14);
		
		JTextField caja5=new JTextField(10);
		caja5.setBounds(15,150,360,30);
		panel1.add(caja5);
		
		
		JButton btn1=new JButton("Subscribe");
		btn1.setBounds(15,190,100,30);
		panel1.add(btn1);
		
		add(panel1);
		
		JLabel lbl15=new JLabel("Copy/Paste onto your site");
		lbl15.setFont(new Font(actual.getFontName(),Font.PLAIN,15));
		lbl15.setBounds(290,260,190,50);
		add(lbl15);
		
		JTextArea atxt1=new JTextArea("escribe aqui",10,10);
		atxt1.setLineWrap(true);
		atxt1.setWrapStyleWord(true);
		JScrollPane scrollAD=new JScrollPane(atxt1);
		atxt1.setBounds(290,300,360,150);
		add(scrollAD);
		add(atxt1);
		
	}

}

public class NullLayout {

	public static void main(String[] args) {
		try {
			UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
		} catch (ClassNotFoundException | InstantiationException | IllegalAccessException
				| UnsupportedLookAndFeelException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		SwingUtilities.invokeLater(new Runnable() {
			@Override
			public void run() {
				// TODO Auto-generated method stub
				new PantallaNullLayout();
			}
		});
	}

}

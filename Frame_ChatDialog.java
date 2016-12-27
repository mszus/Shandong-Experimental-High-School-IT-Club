import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*;
public class SubString {

	public static void main(String[] args) {//throws ClassNotFoundException, InstantiationException, IllegalAccessException, UnsupportedLookAndFeelException {
		// TODO Auto-generated method stub
	//	UIManager.setLookAndFeel("com.jtattoo.plaf.texture.TextureLookAndFeel");
		//UIManager.setLookAndFeel("com.jtattoo.plaf.noire.NoireLookAndFeel");
		//UIManager.setLookAndFeel("com.jtattoo.plaf.bernstein.BernsteinLookAndFeel");
		
		MyFirstFrame myFrame= new MyFirstFrame();
		
		myFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		myFrame.setVisible(true);	
	}

}

class MyFirstFrame extends JFrame implements ActionListener
{
	JButton    buttonOne;
	JLabel     labelOne;
	JTextField textFOne;
	JTextArea  textAOne;
	
	//Magpie2    magpOne;
	int MaxCharacter = 30;
	final int  nWidth  = MaxCharacter; // JTextArea Width
	MyFirstFrame()
	{
		this.setSize(280,400);
		this.getContentPane().setLayout(null);
		
		this.add(this.getJButton(),null);
		
		this.add(this.getJLabel(),null);
//		magpOne = new Magpie2();
		                 
//		labelOne.setText(magpOne.getGreeting());  //getGreeting
	
		this.add(this.getJTextArea(), null);
		
		this.add(this.getJTextField(), null);
	}
	private JButton getJButton()
	{
		 buttonOne = new JButton();
		 buttonOne.setBounds(160, 250, 70, 30);
		 buttonOne.setText("OK");
		 buttonOne.addActionListener(this);
		 
		 return buttonOne;
	}
	private JLabel getJLabel()
	{
		labelOne = new JLabel();
		labelOne.setBounds(50, 200, 200, 50);
		
		return labelOne;
	}
	private JTextArea getJTextArea()
	{
//		textAOne = new JTextArea(magpOne.getGreeting());
		textAOne = new JTextArea("");
		textAOne.setForeground(new Color(255,0,255));
		textAOne.setBounds(50, 0, 200, 200);
		
		return textAOne;
	}
	private JTextField getJTextField()
	{
		textFOne = new JTextField();
		textFOne.setBounds(50, 250, 100, 30);
		
		return textFOne;
	}
	public void actionPerformed(ActionEvent e)
	{
		//JTextField width: 60
		int a = 0;
		int InputLength = ("You:"+textFOne.getText()).length();
		String input = "You:"+textFOne.getText();
		
		if(InputLength > MaxCharacter)
		{
			for(int i =1; InputLength > MaxCharacter*i; i++)
			{
				textAOne.append("\n" + input.substring(MaxCharacter*(i-1), MaxCharacter*i));
		        a = i;
			}
			textAOne.append("\n" + input.substring( MaxCharacter *a));
		}
		else
			{
				textAOne.append("\n" + input);
			}


	}
	
}

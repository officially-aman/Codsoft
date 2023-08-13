import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class StudentGrade implements ActionListener
{
	JFrame fr;
	JLabel lb0,lb1,lb2,lb3,lb4,lb5,lb6,lb7,lb8;
	JTextField tf1,tf2,tf3,tf4,tf5,tf6,tf7,tf8;
	JButton b1,b2,b3,b4;
	public static void main(String s[])
	{
		new StudentGrade();
			
	}
	StudentGrade()
	{
		fr=new JFrame("Form");
		fr.setLayout(null);
		fr.setSize(800,800);
	
		lb0 =new JLabel("Subject Marks are Out of 100 , Total Marks are Out of 500 & Percentage is Out of 100%");
        lb0.setBounds(10,10,700,30);
		fr.add(lb0);

		lb1=new JLabel("English");
		lb1.setBounds(50,50,100,30);
		fr.add(lb1);

        tf1=new JTextField();
		tf1.setBounds(170,50,100,30);
		fr.add(tf1);

		
		lb2=new JLabel("Mathematics");
		lb2.setBounds(50,100,100,30);
		fr.add(lb2);
		
        tf2=new JTextField();
		tf2.setBounds(170,100,100,30);
		fr.add(tf2);


        lb3=new JLabel("Physics");
		lb3.setBounds(290,50,100,30);
		fr.add(lb3);

        tf3=new JTextField();
		tf3.setBounds(410,50,100,30);
		fr.add(tf3);

		
		lb4=new JLabel("Chemistry");
		lb4.setBounds(290,100,100,30);
		fr.add(lb4);

        tf4=new JTextField();
		tf4.setBounds(410,100,100,30);
		fr.add(tf4);


        lb5=new JLabel("Computer Science");
		lb5.setBounds(50,150,100,30);
		fr.add(lb5);

		tf5=new JTextField();
		tf5.setBounds(170,150,100,30);
		fr.add(tf5);
		
	
		b1=new JButton("Generate Result");
		b1.setBounds(50,200,200,30);
		fr.add(b1);
		
        lb6=new JLabel("Total Marks Obtained");
		lb6.setBounds(50,250,100,30);
		fr.add(lb6);

		tf6=new JTextField();
		tf6.setBounds(170,250,100,30);
		fr.add(tf6);

        lb7=new JLabel("Percentage");
		lb7.setBounds(50,300,100,30);
		fr.add(lb7);

		tf7=new JTextField();
		tf7.setBounds(170,300,100,30);
		fr.add(tf7);

        lb8=new JLabel("Grade");
		lb8.setBounds(50,350,100,30);
		fr.add(lb8);

		tf8=new JTextField();
		tf8.setBounds(170,350,100,30);
		fr.add(tf8);

		b1.addActionListener(this);
		
		fr.setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		int a=Integer.parseInt(tf1.getText());
		int b=Integer.parseInt(tf2.getText());
        int c=Integer.parseInt(tf3.getText());
		int d=Integer.parseInt(tf4.getText());
        int f=Integer.parseInt(tf5.getText());
		if(e.getSource()==b1)
		{
		    int sum=a+b+c+d+f;
		    tf6.setText(sum+"");
            int per=(sum/5);
            tf7.setText(per+" %");
            if(per>90 && per<100)  tf8.setText("A1");
            else if(per>80 && per<90)  tf8.setText("A2");
            else if(per>70 && per<80)  tf8.setText("B1");
            else if(per>60 && per<70)  tf8.setText("B2");
            else if(per>50 && per<60)  tf8.setText("C1");
            else if(per>40 && per<50)  tf8.setText("C2");
            else if(per>=33 && per<40)  tf8.setText("D");
            else if(per<33)  tf8.setText("E(Failed)");
		}
		
		
	}
	
}
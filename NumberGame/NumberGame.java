import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.util.*;

class NumberGame implements ActionListener {
    JFrame fr;
    JButton gen,com;
    JLabel l2;
    JTextField f1,l1,fed;
    int ran;


    public static void main(String s[]) {
        new NumberGame();
    }

    NumberGame(){
        fr=new JFrame();
        fr.setLayout(null);
        fr.setSize(700, 700);

        gen=new JButton("Generate");
        gen.setBounds(100, 50, 100, 30);
        fr.add(gen);

        l1=new JTextField("Random Number");
        l1.setBounds(250, 50, 100, 30);
        fr.add(l1);

        l2=new JLabel("Enter Number");
        l2.setBounds(100, 150, 100, 30);
        fr.add(l2);

        f1=new JTextField();
        f1.setBounds(250, 150, 70, 30);
        fr.add(f1);

        com=new JButton("Compute");
        com.setBounds(100, 250, 100, 30);
        fr.add(com);

        fed = new JTextField("FeedBack");
        fed.setBounds(150, 350, 100, 50);
        fr.add(fed);

        gen.addActionListener(this);
        com.addActionListener(this);
/**
     * 
     */
    
        fr.setVisible(true);
    }


    public void actionPerformed(ActionEvent e)
	{	
		//System.out.println("YES OUTPUT");
		
		if(e.getSource()==gen)
		{ 
            try {
                Random random = new Random();
                int ran = (int)(Math.random()*(100-1+1)+1);
                l1.setText(ran+"");
            }
            catch(Exception ee){}
		}

        if(e.getSource()==com){
            int a=Integer.parseInt(l1.getText());
            int b =Integer.parseInt(f1.getText());

            if(a==b){
                fed.setText("Correct");
            }
            else if(a>b){
                fed.setText("Too Low");
            }
            else if(a<b){
                fed.setText("Too High");
            }
        }
		
	}
}
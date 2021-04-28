/*<applet code=Applet_Practice.java width=350 height=350></applet>*/
import java.applet.*;
import java.awt.Graphics;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.*; 
public class Applet_Practice extends Applet implements ActionListener{
          Boolean t;
	     JLabel l;
	     JButton b;
	   
        public void init(){
                    setLayout(new FlowLayout());
                 l=new JLabel("hey");
                     add(l);
                b=new JButton("click me");
               add(b);
               b.addActionListener(this);
        } 

        
        
		@Override
		public void actionPerformed(ActionEvent arg0) {
			
            l.setText("Button was cliked");
                       t=true;
                     repaint();
			
		}


                public void paint(Graphics g){
                                if(t)
                                g.drawString("Hello",100,100);
                                   t=false;
                            
                              }
}

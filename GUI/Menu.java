import java.awt.*; 
import javax.swing.*; 
import javax.swing.JMenuBar;
import java.awt.event.*; 

public class Menu implements ActionListener { 
    static JFrame f;
    static JMenuBar mb; 
  
    static JMenu x; 
 
    static JMenuItem m1, m2, m3, m4, m5, m6, m7; 
  
    public  Menu() 
    { 
      
        mb = new JMenuBar(); 
  
        x = new JMenu("Menu"); 
  
        m1 = new JMenuItem("Home"); 
        m2 = new JMenuItem("Details"); 
        m3 = new JMenuItem("Deposit"); 
        m4 = new JMenuItem("Withdraw"); 
        m5 = new JMenuItem("Transfer"); 
        m6 = new JMenuItem("My Info"); 
        m7 = new JMenuItem("Log Out"); 
  
       
        x.add(m1); 
        x.add(m2); 
        x.add(m3); 
        x.add(m4); 
        x.add(m5); 
        x.add(m6); 
        x.add(m7); 
        
        m1.addActionListener(this);
        m2.addActionListener(this);
        m3.addActionListener(this);
        m4.addActionListener(this);
        m5.addActionListener(this);
        m6.addActionListener(this);
        m7.addActionListener(this);
        
        mb.add(x); 
        
       
        
   
    }
   
    public  void actionPerformed(ActionEvent e){
        if (e.getSource()==m2){
        new Details("Details");
        }
        else if (e.getSource()==m1)
        new Home("Home");
        else if (e.getSource()==m6)
        new MyInfo("My Info");
        else  
        new LogIn();
        
    }

     public static void main(String[]args){
         new Menu();
        }
}

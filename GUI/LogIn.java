 


import java.awt.Color;

import javax.swing.BoxLayout;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JTextField;
import javax.swing.SwingConstants;



import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

public class LogIn extends JFrame {
    
        private static final long serialVersionUID = 1L;
 String usernam;
    JPanel panel, form,p1,p2; 
    JTextField username ;
    JTextField password;
    JButton login;
    
public LogIn(){
        
     setTitle("Log In");    
     setLayout(new GridLayout(3,0));
     
     
     Icon icon = new ImageIcon("C:\\Users\\TASHI\\jalwa\\bank management system\\icon1.png");
     add(new JLabel(icon));
     JLabel bank = new JLabel("BankBank", SwingConstants.CENTER);
     Font f1 = new Font(Font.SERIF, Font.BOLD,  24);
     bank.setFont(f1);
             
     add(bank);
     
     panel = new JPanel();
     
     add(panel);
     setUpPanel();
     
     setSize(600,600);
     setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
     setVisible(true);
    
    }
    
      
     public void setUpPanel() { 
         panel.setLayout(new BoxLayout(this.panel, BoxLayout.X_AXIS));
         
         panel.add(new JPanel());
         
        
         form = new JPanel(new GridLayout(3,1));
         panel.add(form);
         setUpForm();
         panel.add(new JPanel());
         
         panel.setVisible(true);
        
        
     }
     public void setUpForm() {
         
          username = new JTextField(30);
          password = new JPasswordField(15);
          login = new JButton ("Log In");
        
         form.add(new JLabel("Username"));form.add(username);
         form.add(new JLabel("Password")); form.add(password);
         form.add(login);
         login.addActionListener(new login());
         
         form.setVisible(true);
     }
     
     private class login implements ActionListener {

            @Override
            public void actionPerformed(ActionEvent e){
                usernam = username.getText();
                String input1 = password.getText();
                
                
                 try {
                        Database db = new Database();
                        String password = db.getPassword(usernam);
                        
                         if (input1.equals(password)) 
                        {Home f1 = new Home("Home");
                        f1.setVisible(true);
                    }
                    else {System.out.println("enter the valid username and password");
                       JOptionPane.showMessageDialog(LogIn.this,"Incorrect login or password",
                               "Error",JOptionPane.ERROR_MESSAGE);
                    }
                       db.closeConnection();
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
                
     }
     }
     public static void main(String []args) throws SQLException {
         
                        new LogIn();
                        
    }
}

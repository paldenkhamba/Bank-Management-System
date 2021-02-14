
import java.awt.*;
import javax.swing.*;

import java.sql.SQLException;
public class Details extends JFrame 
 {
        JPanel panel ;
        
        public Details(String title) {
        super(title);
        
        
         setLayout(new BorderLayout());
         setBackground(Color.gray);
         
         Menu m = new Menu();
        setJMenuBar(m.mb);
        
          JLabel b = new JLabel("BANKBANK", SwingConstants.CENTER);
        Font f1 = new Font(Font.SERIF, Font.BOLD,  24);
        b.setFont(f1);
        add(b,BorderLayout.NORTH);
        
        panel = new JPanel();
        add(panel, BorderLayout.CENTER);
        setupp1();
        JButton changeP = new JButton("Change Password");
        
        add(changeP, BorderLayout.SOUTH);
        
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } 
        public void  setupp1() {
         try {
                    Database db = new Database();
                    LogIn LogIn = new LogIn();
                    Customer c = db.getCustomer(LogIn.usernam); 
                    
                        Account a = db.getAccount(c.getId());
                        panel.setLayout(new GridLayout(5,2));
                        
                        panel.add(new JLabel("Account ID   :"));
                        panel.add(new JLabel(String.valueOf(a.getAccountId())));
                        panel.add(new JLabel("Account Type"));
                        panel.add(new JLabel(String.valueOf(a.getAccountType())));
                        panel.add(new JLabel("Balance"));
                        panel.add(new JLabel(String.valueOf(a.getBalance())));
                        panel.add(new JLabel("Customer ID"));
                        panel.add(new JLabel(String.valueOf(a.getCustId())));
                        panel.add(new JLabel("Interest Rate"));
                        panel.add(new JLabel(String.valueOf(a.getInterest())));
                        
                        panel.setVisible(true);
                        panel.setPreferredSize(new Dimension(400,400));
                       db.closeConnection();
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
          
     }
     
    public static void main (String [] args){
        new Details("Details");
       }
    }

import java.awt.*;
import javax.swing.*;

import java.sql.SQLException;
public class MyInfo extends JFrame 
 {
        JPanel panel ;
        
 
        public MyInfo(String title) {
        super(title);
        
        //adding menubar
        Menu m = new Menu();
        setJMenuBar(m.mb);
        
         //setting layout
         setLayout(new BorderLayout());
         setBackground(Color.gray);
         
         //adding label with font
        JLabel b = new JLabel("BANKBANK", SwingConstants.CENTER);
        Font f1 = new Font(Font.SERIF, Font.BOLD,  24);
        b.setFont(f1);
        add(b,BorderLayout.NORTH);
        
        panel = new JPanel();
        add(panel, BorderLayout.CENTER);
        setuppanel();
        
        
        setSize(600,600);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } 
        
        
        public void  setuppanel() {
          try {
                    Database db = new Database();
                    LogIn LogIn = new LogIn();
                    Customer c = db.getCustomer(LogIn.usernam); 
                    
                        
                        panel.setLayout(new GridLayout(0,2));
                        
                        panel.add(new JLabel("Customer ID   :"));
                        panel.add(new JLabel(String.valueOf(c.getId())));
                        panel.add(new JLabel("Name          :"));
                        panel.add(new JLabel(String.valueOf(c.getName())));
                        panel.add(new JLabel("Address       :"));
                        panel.add(new JLabel(String.valueOf(c.getAddress())));
                        panel.add(new JLabel("Phone No.     :"));
                        panel.add(new JLabel(String.valueOf(c.getPhoneNo())));
                        panel.add(new JLabel("Email         :"));
                        panel.add(new JLabel(String.valueOf(c.getEmail())));
                        panel.add(new JLabel("DOB           :"));
                        panel.add(new JLabel(String.valueOf(c.getdob() )));
                        panel.add(new JLabel("Gender        :"));
                        panel.add(new JLabel(String.valueOf(c.getGender())));
                        panel.add(new JLabel("Salary        :"));
                        panel.add(new JLabel(String.valueOf(c.getSalary())));
                        
                        panel.setVisible(true);
                       db.closeConnection();
                    } catch (Exception exception) {
                        exception.printStackTrace();
                    }
          
     }
     
    public static void main (String [] args){
        new MyInfo("MyInfo");
       }
    }

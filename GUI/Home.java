    import javax.swing.JMenuBar;
    import java.awt.event.*; 
    import java.awt.*;
    import javax.swing.*;
    import java.sql.SQLException;

    public class Home extends JFrame implements ActionListener{
            JPanel P2;
            JButton  details,deposit,withdraw,transfer,transaction,info;
          
           
            public Home(String title) {
            super(title);
         
                
                //adding menubar
            Menu m = new Menu(); 
            setJMenuBar(m.mb);
             
            
            setLayout(new BorderLayout());
            setBackground(Color.gray);
             
                //adding label with font
            JLabel b = new JLabel("BANKBANK", SwingConstants.CENTER);
            Font f1 = new Font(Font.SERIF, Font.BOLD,  24);
            b.setFont(f1);
            add(b,BorderLayout.NORTH);
            
            P2 = new JPanel();
            add(P2, BorderLayout.CENTER);
             
            
            setupP2();
            setSize(600,600);
            setVisible(true);
            setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             
        }
      
           
          public void setupP2(){
              
              //setting layout 
              GridLayout l = new GridLayout(2,3);
              P2.setLayout(l);
              
              //setting gaps
              l.setHgap(25);
              l.setVgap(25);
              
              details = new JButton("Details"); 
              P2.add(details);
              deposit = new JButton("Deposit"); 
              P2.add(deposit);
              withdraw = new JButton("Withdraw"); 
              P2.add(withdraw);
              transfer = new JButton("Transfer"); 
              P2.add(transfer);
              transaction = new JButton("Transaction History"); 
              P2.add(transaction);
              info  = new JButton("My Info"); 
              P2.add(info);
              
              //setting button dimensions
              details.setPreferredSize(new Dimension(100, 100));
              deposit.setPreferredSize(new Dimension(100, 100));
              withdraw.setPreferredSize(new Dimension(100, 100));
              transfer.setPreferredSize(new Dimension(100, 100));
              transaction.setPreferredSize(new Dimension(100, 100));
              info.setPreferredSize(new Dimension(100, 100));
              
              
              setAction();
              setVisible(true);
    }
    
            public void setAction(){
                   details.addActionListener(this);
                   deposit.addActionListener(this);
                   withdraw.addActionListener(this);
                   transfer.addActionListener(this);
                   transaction.addActionListener(this);
                   info.addActionListener(this);
                }
                  
        //the system so far only displays 'details' and 'myinfo'
        public  void actionPerformed(ActionEvent e){
        if (e.getSource()==details){
        new Details("Details");
         dispose(); }
       
        else  {
        new MyInfo("My Info");}
        
        
    }
    

            public static void main (String [] args ){
             new Home("Home");   
            }
}

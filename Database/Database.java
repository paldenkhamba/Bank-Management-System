import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.sql.Connection;



public class Database {
	
	String url = "jdbc:mysql://localhost:3306/tbl_graph?useUnicode=true&useJDBCCompliantTimezoneShift=true&useLegacyDatetimeCode=false&serverTimezone=UTC"";  
	String username = "tashi";
	String password = "tashi";
	String sql = "";
	Statement stmt;
	ResultSet rs;
	Connection con;
    
	public Database() throws SQLException {
		con = (Connection) DriverManager.getConnection(url, username, password);

	}
	

	public void addAccount(Account a) throws SQLException{

		sql = "Insert into Account " + "values('" + a.getAccountId() + "', " + a.getAccountType() + "', " +  a.getBalance()+ "', " +a.getInterest()    + "', " + a.getCustId();
				
		System.out.println(sql);
		stmt = (Statement) con.createStatement();
		stmt.executeUpdate(sql);
		stmt.close();
	}
    
	public Account getAccount(int vId) throws SQLException {
		Account a = null;
		sql = "SELECT * FROM account where Account ID=" + vId;
		stmt = (Statement) con.createStatement();
		rs = stmt.executeQuery(sql);
		rs.next();
		int id = rs.getInt(1);
		String type = rs.getString(2);
		float balance = rs.getFloat(3);
		int customerID = rs.getInt(4);
		float interest = rs.getFloat(5);
		a = new Account(id, type, balance, customerID , interest);
		rs.close();
		stmt.close();
		return a;
	}

	public List<Account> getAllAcccount() throws SQLException {
		Account a;
		List<Account> aList = new ArrayList<Account>();
		sql = "SELECT * FROM Account";
		stmt = (Statement) con.createStatement();
		rs = stmt.executeQuery(sql);
		while (rs.next()) {

			int id = rs.getInt(1);
			String type = rs.getString(2);
			float balance = rs.getFloat(3);
			int customerID = rs.getInt(4);
			float interest = rs.getFloat(5);
			a = new Account(id, type, balance, customerID , interest);
			aList.add(a);

		}
		rs.close();
		stmt.close();
		return aList;
	}

    public Customer getCustomer(String name) throws SQLException {
    	Customer c=null;
    	sql = "select * from Customer where  Name ='"+name+"'";
    	stmt = (Statement) con.createStatement();
    	rs = stmt.executeQuery(sql);
    	while (rs.next()) {
    		        int cid= rs.getInt(1);
			String custName = rs.getString(2);
			String address = rs.getString(7);
			int phone = rs.getInt(3);
			String email = rs.getString(4);
			String dob = rs.getString(6);
			String gender = rs.getString(8);
			int salary = rs.getInt(5);
			
			c = new Customer( cid,custName,phone, email,salary, dob, address, gender );
    	}
    	rs.close();
    	stmt.close();
		return c;
    	
		
    }
    
    public String getPassword(String name) throws SQLException {
    	con = (Connection) DriverManager.getConnection(url, username, password);
    	sql = "select Password from Customer where  Name ='"+name+"'";
    	stmt = (Statement) con.createStatement();
    	rs = stmt.executeQuery(sql);
    	String password = rs.getString(1);
    	
    	rs.close();
    	stmt.close();
    	
    	return password;
    }
    
    public String getAccountId(String custName) throws SQLException {
	    con = (Connection) DriverManager.getConnection(url, username, password);
    	sql = "select Account ID from customer where Name = '"+custName+"'";
    	stmt = (Statement) con.createStatement();
    	rs = stmt.executeQuery(sql);
    	String password = rs.getString(1);
    	
    	rs.close();
    	stmt.close();
    	
    	return password;
	   }
    
    public void closeConnection()  throws SQLException {
    	con.close();
}
}

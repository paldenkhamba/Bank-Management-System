 

public class Account  {

	private int accountID;
	private String accountType;
	private int customerID;
	private float balance;
	private float interest;
	
	
	public Account(int id, String type,float balance,int customerID , float interest){
		this.customerID=customerID;
		this.accountID = id;
		this.accountType = type;
		this.balance = balance;
		this.interest = interest;
	}
	
	public int getAccountId() {
			return accountID;
		}
		
	

	public void setAccountId(int id) {
			this.accountID = id;
		}
	
	public String getAccountType() {
		return accountType;
	}

	public void setAccountType(String id) {
		this.accountType = id;
	}
	
	public float getBalance() {
		return balance;
	}

	public void setBalance(float id) {
		this.balance = id;
	}
	public float getInterest() {
		return interest;
	}

	public void setInterest(float id) {
		this.interest = id;
	
	}
	public int getCustId() {
		return customerID;
	}

	public void setCust(int id) {
		this.customerID = id;
	}


	}



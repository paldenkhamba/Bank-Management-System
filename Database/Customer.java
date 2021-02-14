

public class Customer {

    private int customerID;
    private String custName;
    private String address;
    private int phoneNo;
    private String email;
    private String dob;
    private String gender;
    private int salary;
    private String password;

public Customer(int id , String name , int phoneNo , String email , int salary) {
    this.customerID = id;
    this.custName = name;
    this.phoneNo = phoneNo;
    this.email = email;
    this.salary = salary;
    
    
}



public Customer(int id , String name , int phoneNo , String email ,int salary,String dob, String address,String gender) {
    this(id,name,phoneNo, email,salary);
    
    this.dob = dob;
    this.address = address;
    this.gender = gender;
}


public int getId() {
    return customerID;
}

public void setId(int id) {
    this.customerID = id;
}
public String getPassword() {
    return this.password;
}



public void setPassword(String Password) {
    this.password = Password;
}


public String getName() {
    return custName;
}

public void setName(String name) {
    this.custName = name;
}


public String getAddress() {
    return address;
}

public void setaddress(String id) {
    this.address = id;
}

public int getPhoneNo() {
    return phoneNo;
}

public void setPhoneNo(int id) {
    this.phoneNo = id;
}


public String getEmail() {
    return this.email;
}

public void setEmail (String email) {
    this.email = email;
}


public String getdob() {
    return dob;
}

public void setdob(String id) {
    this.dob = id;
}


public String getGender() {
    return this.gender;
}

public void setGender(String id) {
    this.gender = id;
}


public int getSalary() {
    return salary;
}

public void setSalary(int id) {
    this.salary = id;
}
}

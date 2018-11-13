
package GroupProject;


public class Customer {
    
    public String fname;
    public String lname;
    protected String address;
    protected String phoneNumber;
    protected String email;
    public int customerId;
    
    
    public Customer(String fname
            , String lname
            , String email
            , String address
            , String phoneNumber
            , int customerId
            )
            
    {
        this.fname = fname;
        this.lname = lname;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.customerId = customerId;
    }
            
    public Customer( String fname , String lname,String email,int customerId )
    {
        this.fname = fname;
        this.lname = lname;
        this.email = email;
        this.customerId= customerId;
    }
    
    
    public void setFname(String fName)
    {
        this.fname = fName;
    }
    
        public void setLname(String lName)
    {
        this.lname = lName;
    }
        
        
        public void setAddress(String address)
    {
        this.address = address;
    }
        
            public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
        
}

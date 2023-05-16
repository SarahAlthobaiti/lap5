public class Customer {
    private String name;
    private String contactNumber;
    private String email;
    private Order order ;
    

    public Customer(){

    }

    public Customer(Order order){
     this.order = order.coby();
    }

    public Customer(String name, String contactNumber, String email) {
        this.name = name;
        this.contactNumber = contactNumber;
        this.email = email;
    }
    
    public void setName(String name) {
        this.name = name;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }
    
    public void setEmail(String email) {
        this.email = email;
    }

    public void setOrder(Order ord){
        this.order = ord.coby();
    }

    public String getName() {
        return name;
    }
    
    public String getContactNumber() {
        return contactNumber;
    }
    
    public String getEmail() {
        return email;
    }

    public String getOrder(){
        return Order.coby();
    }
    
    
    public String toString() {
        return "Name: " + name + "\nContact number: " + contactNumber + "\nEmail: " + email + "\nOrder Informaition: " + Order.toString(); ;
    }
}
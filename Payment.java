public class Payment {
    
    // this variable detrmain if the payment is by card or cash   
    private String paymentMethod;
    // this variable detrmain the amount of the cost   
    private double paymentCost;
    // this variable defines the tax value   
    private static final double CHARGE=0.15;
    
    //no-arg Constructor
        public Payment() {
        }
    //Constructor with Tow parametr 
        public Payment(String paymentMethod,double paymentCost){
            
        }
    //method that store paymentMethod
        public void setPaymentMethod(String paymentMethod) {
            this.paymentMethod = paymentMethod;
        }
    //method that return paymentMethod of type String 
        public String getPaymentMethod() {
            return paymentMethod;
        }
    //method that store paymentCost   
        public void setPaymentCost(double paymentCost) {
            this.paymentCost = paymentCost;
        }
    //method that return paymentCost of type double      
        public double getPaymentCost() {
            return paymentCost;
        }
    //method that calculate the paymentCost and the tax value  
        public double calculateAmount(double paymentCost){
            
         double total=paymentCost+(paymentCost*CHARGE);   
         return total;   
            
        }
    //A method creates a new object and copy the fields one by one   
        public Payment copy(){
         Payment d = new Payment();
         d.paymentMethod=paymentMethod;
         d.paymentCost=paymentCost;  
         return d;
        }
    //method that return a String indicating the objects paymentMethod and paymentCost   
    
        /**
         *
         * @return
         */
    @Override
        public String toString(){
         String str= "the paymentMethod " + this.paymentMethod + "/n the paymentCost is"+this.paymentCost;  
         return str;        
        }
        
    }
public class Payment {
    //public static double totalCost = 0;   // this feild store the total cost of cakes 
  // this variable detrmain if the payment is by card or cash   
  private String paymentMethod;
  // this variable detrmain the amount of the cost   
  private double paymentCost;
  // this variable defines the tax value   
  private static final double CHARGE=0.15;
  private double totalCost =0;
  //no-arg Constructor
      public Payment() {
      }
  //Constructor with Tow parametr 
      public Payment(String paymentMethod,double paymentCost){
          this.paymentMethod=paymentMethod;
          this.paymentCost=paymentCost;
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
    
  //A method creates a new object and copy the fields one by one   
      public Payment copy(){
       Payment d = new Payment();
       d.paymentMethod=paymentMethod;
       d.paymentCost=paymentCost;  
       return d;
      }
      
      public double calculateCost(int cost){
       
     totalCost = (totalCost+ cost )*CHARGE;
     return totalCost;
 
    }
      
  //method that return a String indicating the objects paymentMethod and paymentCost   
  
      /**
       *
       * @return
       */
  @Override
      public String toString(){
       
       return "the paymentMethod " + this.paymentMethod + "\n"+"the paymentCost is"+this.paymentCost;        
      }
      
  }
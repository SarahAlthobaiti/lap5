public class Order {
    // declare all instance varible
   public static double totalCost = 0; // this feild store the total cost of cakes 
   private Payment payment; // this feild store information about payment 
   private Cake newCake; // this feild store information about cake like flavour and size...
   private int numberOfCakes; // this felid store number of cakes that the customer will order
   
   // constructor with no-arg
   public Order(){}
   
   // parameterized constructor
   public Order(int numberOfCakes, Payment payment, Cake newCake){
       this.numberOfCakes = numberOfCakes;
       this.payment = payment;
       this.newCake = newCake;
       totalCost++;
   }
   
    public Order(Cake newCake){
       this.newCake = newCake;
   }

   // set method, that store object of type Payment
   public void setPayment (Payment payment){
       this.payment = payment.copy();
   }
   
   // get method, that return object of type Payment
   public Payment getPayment(){
       return payment.copy();
   }
   
   // set method, that store object of type Cake
   public void setNewCake (Cake newCake){
       this.newCake = newCake;
   }
   
   // get method, that return object of type Cake
   public Cake gatNewCake(){
       return newCake;
   }
   
   // set method, that store number of cakes
   public void setNumberOfCakes(int numberOfCakes){
       this.numberOfCakes=numberOfCakes;
   }

   // get method, that return number of cakes  
   public int getNumberOfCakes(){
       return numberOfCakes;
   }

   // toString method, that override the implemntation and print all feild in class order
    /**
     *
     * @return
     */
    @Override
   public String toString(){
       String str;
       str = "cake info: "+newCake  +"total cost: " + totalCost +"\n"+ "number of cakes: " + this.numberOfCakes +"\n"+ "payment info: " + this.payment + "\n" + "cake info: " + this.newCake;
       return str;
   }
   
   // copy method, when we creat a new obj it copy the reference not the obj itself
   public Order copy (){
       Order order = new Order();
       order.numberOfCakes = numberOfCakes;
       return(order);
   }
}
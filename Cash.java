public class Cash extends Payment{
   private String DayOfReceived ; // the day that Customer chose to receive the cake
   public final String Location = "Cake bakery in Alawali"; // the adress that a customer inter to receive the cake
   private double totalCost;
   
   // no-arg Constructor
    public Cash(){ } 
    

    // Constructor takes 2 parameters
    public Cash(String dayofreceived ){
       this.DayOfReceived = dayofreceived;
    }
   
    //methode set to store the day that the customer chose
    public void setDayOfReceived(String Day)
  {
     this.DayOfReceived=Day;
  }

    
   //methode get to return the day that the customer chose
    public String getDayOfReceived()
  {
     return DayOfReceived; 
  }

    public void SetTotalCost(double tcost){
      this.totalCost=tcost;
  }
    
    public double getTotalCost(){
       return this.totalCost;
  }
   /**
    *
    * @return
    */
   @Override
     public String toString(){
      
      return "We are preparing your order and here is our location: "+Location+" do not forget to pick up your order.";
  }
     
}
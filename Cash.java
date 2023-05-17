public class Cash extends Payment{
    private String DayOfReceived ; // the day that Customer chose to receive the cake
    private String Location; // the adress that a customer inter to receive the cake
    
    
    // no-arg Constructor
     public Cash(){ } 
     
 
     // Constructor takes 2 parameters
     public Cash(String dayofreceived , String location){
        this.DayOfReceived = dayofreceived; 
        this.Location = location;
     }
    
     //methode set to store the day that the customer chose
     public void setDayOfReceived(String Day)
   {
      this.DayOfReceived=Day;
   }
    
     //methode set to store the adress that the customer interd
      public void setLocation(String Adress)
   {
      this.Location=Adress;
   }
     
    //methode get to return the day that the customer chose
     public String getDayOfReceived()
   {
      return DayOfReceived; 
   }
    //methode get to store the adress that the customer chose
      public String getLocation()
   {
      return Location; 
   }    
      
}
public class CreditCard extends Payment  {
    //its a child of class paymaent
    
 //Decalre all instance variables 
    
   private  String cardNumber ;
 private int expirationYear; 
 private int expirationMonth ;
 private String cvv ;
 
 
 public boolean validatenum;
 

 // default constructor
 public CreditCard(){};
 
// parameterized constructor
     public CreditCard(String cardNumber,int expirationYear, int expirationMonth, String cvv ){
     this.cardNumber=cardNumber;
     this.expirationYear=expirationYear;
     this.expirationYear= expirationYear;
     this.cvv=cvv;
     }
//method validate the Card Number
public boolean validateCardNumber (String cardNumber ){
    for (int i = 0; i < 17; i++) {
        
    }
 return validatenum;
}
//method validate the cvv number
public boolean validateCvv ( String cvv){
    for (int i = 0; i < 4; i++) {
        
    }
return validatenum;
}
//method validate the expiration Year 
public  boolean validateExpirationYear (int expirationYear){
for (int i = 0; i <5; i++) {
        
    }
return validatenum;
}
//method validate the Expiration Month
public  boolean validateExpirationMonth(int expirationMonth){
for (int i = 0; i < 3; i++) {
        
    }
return validatenum;
}
// setter for card name
public void setCardNumber(String cardNum ){
this.cardNumber=cardNum;
}
// setter for Expiration Year
public void setExpirationYear (int expYr){
this.expirationYear=expYr;
}
// setter for Expiration Month
public void setExpirationMonth(int expMn){
this.expirationYear= expMn;
}
// setter for Cvv number
public void setCvv(String cvv ){
this.cvv=cvv;
}
//getter for Card Number
public String getCardNumber (){
return this.cardNumber;
        
}
//getter for Expiration Year
public int getExpirationYear (){
return this.expirationYear;
}
//getter for Expiration Month
public int getExpirationMonth (){
return this.expirationMonth;
}
//getter for cvv number
public String getCvv (){
return this.cvv;
}
}
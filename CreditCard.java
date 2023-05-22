public class CreditCard extends Payment  {
    //its a child of class paymaent
    
 //Decalre all instance variables 
    
 private  long cardNumber ;
 private int expirationYear; 
 private int expirationMonth ;
 private String cvv ;
 
 
 //public boolean validatenum =true;
 

 // default constructor
 public CreditCard(){};
 
// parameterized constructor
     public CreditCard(int cardNumber,int expirationYear, int expirationMonth, String cvv ){
     this.cardNumber=cardNumber;
     this.expirationYear=expirationYear;
     this.expirationYear= expirationYear;
     this.cvv=cvv;
     }
//method validate the Card Number
public boolean validateCardNumber (String cardNumber){
    if ((cardNumber.length()+1)== 16){
       return true;  
    }
    else{
        return false;
    }
}
public boolean validateCardNumber(long n) {
    long count = 0;
    while (n != 0) {
        n = n / 10;
        count++;
    }
    if(count==16){
       return true; 
    }
    else{
       return false; 
    }
    
}
//method validate the cvv number
public boolean validateCvv ( String cvv){
    if(cvv.length()==3){
      return true; 
    }
    else{
      return false;  
    }
}
//method validate the expiration Year 
public  boolean validateExpirationYear (int expirationYear){
if (expirationYear > 2023){
  return true;  
}
else{
  return false;  
}
}
//method validate the Expiration Month
public  boolean validateExpirationMonth(int expirationMonth){
if(expirationMonth>=1 && expirationMonth<=12 ){
  return true;  
}
else{
  return false; 
}

}
// setter for card name
public void setCardNumber(long cardNum ){
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
public long getCardNumber (){
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
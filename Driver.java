import java.util.ArrayList;
import java.util.Scanner;
import java.io.FileNotFoundException;
import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.io.IOException;
/**
 *
 * @author 
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner userIn = new Scanner(System.in);
        System.out.println("\"Welcome to our CAKE BARKERY\"");
        ArrayList<Cake> cakesInfo = new ArrayList<Cake>();
        
        String file ="text.txt";
        Scanner scanner =null;
        
      try{  
        scanner = new Scanner(new File(file));
        while(scanner.hasNextLine()){
            String line=scanner.nextLine();
            String[]parts=line.split(",");
            
            String name = parts[0];
            int id =Integer.parseInt(parts[1].trim());
            double calories = Double.parseDouble(parts[2].trim());
            double cost = Double.parseDouble(parts[3].trim());
            String flavor =parts[4];
            int size= Integer.parseInt(parts[5].trim());
            
            Cake cake =new Cake(name,id,calories,cost,flavor,size);
            
            cakesInfo.add(cake);
            
        }
       
        scanner.close();
      }
      
      catch(FileNotFoundException e){
          System.out.println(e.getMessage());
      }

        System.out.println("Here is our meneu: "+"\n");
        System.out.println(cakesInfo);
        System.out.println("please choose number of the cake that you want");
        int Id = userIn.nextInt();
        int index =0;
        boolean check = true;
        while (check){
        if(Id>=101&&Id<=110){
           switch(Id){
            case 101:
                index = 0;
                break;
            case 102:
                index = 1;
                break;
            case 103 :
                index = 2;
                break;
            case 104 :
                index = 3;
                break;
            case 105 :
                index = 4;
                break;
            case 106 :
                index = 5;
                break;
            case 107 :
                index = 6;
                break;
            case 108 :
                index = 7;
                break;
            case 109 :
                index = 8;
                break;
            case 110 :
                index = 9;
                break;
                 } 
           check = false;
        }else{
            System.out.println("Please try againe invalid number");
            Id = userIn.nextInt();
        }
    }
        //System.out.println("Do you want to order onother cake? yes/no");
        
        Order order1 = new Order(cakesInfo.get(index));
        System.out.println("Enter your name: ");
        userIn.nextLine();
        String name = userIn.nextLine();
        System.out.println("Enter your phone number: ");
        String phoneNum = userIn.nextLine();
        System.out.println("Enter your email: ");
        String email = userIn.nextLine();
        
        System.out.println();
        System.out.println("write payment method cash or credit card : ");
        String paymentWay = userIn.nextLine();
        Payment d;
        Cash pay;
        CreditCard pay2;
        if(paymentWay.equalsIgnoreCase("Cash")){
            d = new Payment(paymentWay);
            System.out.println("Enter the day of received :");
            String day = userIn.next();
            System.out.println();
            pay = new Cash(day);
            d.calculateCost(order1.gatNewCake().getCost());
            System.out.println(pay);
            order1.setPayment(d);
        }
        
        else if(paymentWay.equalsIgnoreCase("credit card")){
            pay2 = new CreditCard();
            d = new Payment(paymentWay);
            boolean v = true;
            while(v){
            System.out.println("please enter your card number: ");
            String cardNum = userIn.nextLine();
            boolean  validateNum = pay2.validateCardNumber(cardNum);
            System.out.println("please enter your card expiration year: ");
            int year = userIn.nextInt();
            boolean  validateYear = pay2.validateExpirationYear(year);
            System.out.println("please enter your card expiration month: ");
            int month = userIn.nextInt();
            boolean  validateMonth = pay2.validateExpirationMonth(month);
            System.out.println("please enter your cvv number: ");
            userIn.nextLine();
            String cvv = userIn.nextLine();
            boolean  validateCvv = pay2.validateCvv(cvv);
            boolean v1=(validateNum && validateYear && validateMonth && validateCvv);
            if (v1){
            pay2.setCardNumber(cardNum);
            pay2.setExpirationYear(year);
            pay2.setExpirationMonth(month);
            pay2.setCvv(cvv);
            d.calculateCost(order1.gatNewCake().getCost());
            //pay2 = new CreditCard (cardNum,year,month,cvv);
            order1.setPayment(d);
            System.out.println("THANK YOU");
            v=false;
            }
            else{
                System.out.println("please check your card information again");
             }  
            } 
            System.out.println();
        }
        Customer customer1 = new Customer(name, phoneNum,email ,order1);
        String customerfile="customerinfo.txt";
        Scanner ip=null;    
        PrintWriter op=null;
        try {
           op= new PrintWriter ("customerinfo.txt");           
           ip = new Scanner (new File (customerfile));
           op.println(customer1);           
           op.close();
          while (ip.hasNextLine()){
            String line =ip.nextLine();   
            System.out.println(line); 
        }        
          ip.close();
          op.close();        
        }
        catch(FileNotFoundException e){
           System.out.println("cannot find file"+ customerfile);
        }
    }
    
}
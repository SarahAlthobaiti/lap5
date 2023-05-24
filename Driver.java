import java.util.ArrayList; // importing the ArrayList class
import java.util.Scanner; // importing the Scanner class
import java.io.FileNotFoundException; // importing the FileNotFoundException
import java.io.File; // importing the File class
import java.io.PrintWriter; // Importing the printWriter class
import java.io.IOException; // importing the IOException
/**
 *
 * @author 
 */
public class Driver {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Creating an object from the class Scanner
        Scanner userIn = new Scanner(System.in);
        // Printing a Welcome massage to the user
        System.out.println("\"Welcome to our CAKE BARKERY\"");
        // Creating an A arraList to hold information about the Cake 
        ArrayList<Cake> cakesInfo = new ArrayList<Cake>();
        // Creating a file variabal of type String store the file name
        String file ="text.txt";
        // declaer scanner object and initialized it to null
        Scanner scanner =null;
        
      try{  
        // Creating new Scanner object  to read from the file
        scanner = new Scanner(new File(file));
        // Read the file lins one by one
        while(scanner.hasNextLine()){
            // Reading each line of the file and splitting it
            // into parts based on the comma separator
            String line=scanner.nextLine();
            String[]parts=line.split(",");
            // Extracet each item into an appropriate variable
            String name = parts[0];
            int id =Integer.parseInt(parts[1].trim());
            double calories = Double.parseDouble(parts[2].trim());
            double cost = Double.parseDouble(parts[3].trim());
            String flavor =parts[4];
            int size= Integer.parseInt(parts[5].trim());
            // Creating new object from the Cake class 
            Cake cake =new Cake(name,id,calories,cost,flavor,size);
            // add the object to the arrayList
            cakesInfo.add(cake);
            
        }
       // close the Scanner after reading from the file
        scanner.close();
      }
      // Catching an exception if the file is not found
      catch(FileNotFoundException e){
          System.out.println(e.getMessage());
      }
      // Printing the list of available cakes to the user
        System.out.println("Here is our meneu: "+"\n");
        System.out.println(cakesInfo);
        // Prompt the user to choose the Cake by the Id Cake number
        System.out.println("please choose number of the cake that you want");
        int Id = userIn.nextInt();

        // Checking if the cake ID entered by the user is valid and
        // converting it to the corresponding index in the cakesInfo ArrayList
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
            // Prompt the user to enter a valid cake ID
            System.out.println("Please try againe invalid number");
            Id = userIn.nextInt();
        }
    }
        // Creating an Order object with the selected cake
        Order order1 = new Order(cakesInfo.get(index));

        // Prompot the user to enter his name
        System.out.println("Enter your name: ");
        // Consuming the newline character left by the previous user input
        userIn.nextLine();
        String name = userIn.nextLine();
         // Prompot the user to enter his phone number
        System.out.println("Enter your phone number: ");
        String phoneNum = userIn.nextLine();
         // Prompot the user to enter his Email
        System.out.println("Enter your email: ");
        String email = userIn.nextLine();
        // Printing a new line
        System.out.println();
         // Prompot the user to choose the payment method
        System.out.println("write payment method cash or credit card : ");
        String paymentWay = userIn.nextLine();
        // declare an object of type payment
        Payment d;
        // declare an object of type cash
        Cash pay;
        // declare an object of type creditCard
        CreditCard pay2;
        // if statment to check if the user enter "cash" or not ? if he enter cash the following code will be excuted
        if(paymentWay.equalsIgnoreCase("Cash")){
            // creat an object of type payment
            d = new Payment(paymentWay);
            // Prompot the user to enter the day of received the cake 
            System.out.println("Enter the day of received :");
            // store the day that user entered in day variable
            String day = userIn.next();
            System.out.println();
            // creat an object of type cash and pass day as a parameter to the constuctor
            pay = new Cash(day);
            // call calculate cost method and pass the cost of cake to it
            d.calculateCost(order1.gatNewCake().getCost());
            // print pay object of class cash to display the cash info 
            System.out.println(pay);
            // store payment method "cash" in object order
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
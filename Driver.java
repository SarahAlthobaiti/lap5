import java.util.ArrayList;
import java.util.Scanner;
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
       
        ArrayList<Cake> cakesInfo = new ArrayList<Cake>();
        cakesInfo.add(0,new Cake("carrot cake", 101 ,140, 35.00,"carrot", 6 ));
        cakesInfo.add(1,new Cake("carrot cake", 102 ,280, 65.00,"carrot", 12));

        cakesInfo.add(2,new Cake("choco cake", 103 ,140, 35.00,"choco", 6 ));
        cakesInfo.add(3,new Cake("choco cake", 104 ,280, 65.00,"choco", 12 ));

        cakesInfo.add(4,new Cake("cheese cake", 105 ,140, 35.00,"berry", 6 ));
        cakesInfo.add(5,new Cake("cheese cake", 106 ,280, 65.00,"berry", 12 ));

        cakesInfo.add(6,new Cake("honey cake", 107 ,140, 35.00,"honey", 6 ));
        cakesInfo.add(7,new Cake("honey cake", 108 ,280, 65.00,"honey", 12 ));

        cakesInfo.add(8,new Cake("lemon cake", 109 ,140, 35.00,"lemon", 6 ));
        cakesInfo.add(9,new Cake("lemon cake", 110 ,280, 65.00,"lemon", 12 ));
        System.out.println("\"Welcom to our bakery \"");
        System.out.println("here is our meneu: "+"\n");
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
        
        Order order1 = new Order(cakesInfo.get(0));
        Customer customer1 = new Customer("Sarah", "0541953885", "Gadofawaz20@gmail.com",order1);
        System.out.println(customer1);
        
        
        
    }
    
}
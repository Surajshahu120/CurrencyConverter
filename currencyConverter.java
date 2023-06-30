import java.util.*;

public class currencyConverter {

    public static void CurrencyConverter(int value){
           Scanner sc2=new Scanner(System.in);
           System.out.println("Enter how much dollar do you have...");
           int dollarvalue=sc2.nextInt();
        switch(value){
            case 1:
                   System.out.println("Euro(EUR) value of "+ dollarvalue+" dollor is "+(dollarvalue*0.92));
                   break;
            case 2:
                   System.out.println("Pound sterling (GBP) value of "+ dollarvalue+" dollor is "+(dollarvalue*0.79));
                   break;
            case 3:
                   System.out.println("Australian dollar (AUD) value of "+ dollarvalue+" dollor is "+(dollarvalue*1.51));
                   break;
            case 4:
                   System.out.println("Canadian dollar (CAD) value of "+ dollarvalue+" dollor is 1"+(dollarvalue*1.33));
                   break;
            case 5:
                   System.out.println("Swiss franc (CHF) value of "+ dollarvalue+" dollor is "+(dollarvalue*0.90));
                   break;
            case 6:
                   System.out.println("Indian Rupee (INR) value of "+ dollarvalue+" dollor is "+(dollarvalue*82.1));
                   break;
              default:
              System.out.println("Enter valid input.....");     
           
        }
    }

       public static void main(String[] args) {
              System.out.println("Currency Converter......");
              Scanner sc = new Scanner(System.in);
              System.out.println("Select option......");
              System.out.println("1.Dollar to Euro(EUR)");
              System.out.println("2.Dollar to pound sterling (GBP)");
              System.out.println("3.Dollar to Australian Dollar (AUD)");
              System.out.println("4.Dollar to Canadian Dollar (CAD)");
              System.out.println("5.Dollar to Swiss franc (CHF)");
              System.out.println("6.Dollar to Indian Rupee (INR)");
              int userinput = sc.nextInt();
              System.out.println("\n");
              CurrencyConverter(userinput);
              System.out.println("\n");
              System.out.println("Thanks......");
       }
}

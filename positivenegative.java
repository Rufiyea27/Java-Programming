
import java.util.Scanner;
public class positivenegative {
    public static void main(String[] args) {
        int number;
        Scanner Scan = new Scanner(System.in);
        System.out.println("enter the number you want to check:");
        number = Scan.nextInt();
        Scan.close();
        if (number > 0) {
            System.out.println(number+"is positive number");
            
        }
        else if(number < 0){
            System.out.println(number+"is negative number");
        }
        else{
            System.out.println(number+"is neither positive nor negative");
        }
            
        }

    }
    


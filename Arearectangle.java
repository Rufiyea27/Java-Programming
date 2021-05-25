import java.util.Scanner;

public class Arearectangle {
    public static void main(String[] args) {
        Scanner Scan = new Scanner(System.in);
        System.out.println("Enter the length of Rectangle:");
       double length = Scan .nextDouble();
       System.out.println("Enter the width of Rectangle:");
       double width = Scan .nextDouble();
       double area = length*width;
       System.out.println("Area of Rectangle is:"+area);

    }
}

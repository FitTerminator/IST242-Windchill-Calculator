import java.util.Scanner;
public class Windchill {
public static void main(String[] args) {
Scanner input = new Scanner(System.in);
try {
int temp = input.nextInt();
int speed = input.nextInt();
      double windchill = temp - (speed * 0.7);
      System.out.println("Windchill " + Math.round(windchill));
      System.out.println(" ");
      System.out.println("Enter any key to continue ('q' to quit):");
     
} catch(Exception e) {
   System.out.println("Error. You entered a non-numeric value");
   System.exit(0);
      }
}
}

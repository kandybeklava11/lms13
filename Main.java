import javax.swing.plaf.SpinnerUI;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
        public static void main(String[] args) {
              
                Scanner scanner=new Scanner(System.in);
                double arrra=scanner.nextDouble();
                System.out.println("Radius: ");
                double ddd=Circle.area(arrra);
               double sss= Circle.circumference(arrra);
                System.out.println("Area Ansver: "+ddd);
                System.out.println("Circumference Ansver: "+sss);
        }
}



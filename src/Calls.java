import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Calls {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Country 1 : ");
        double c1 = Double.parseDouble(br.readLine());
        System.out.print("Time counrty 1 : ");
        double t1 = Double.parseDouble(br.readLine());
        double r1 = c1 * t1;
        System.out.println("Result 1 - " + r1 );

        System.out.print("Country 2 : ");
        double c2 = Double.parseDouble(br.readLine());
        System.out.print("Time counrty 2 : ");
        double t2 = Double.parseDouble(br.readLine());
        double r2 = c2 * t2;
        System.out.println("Result 2 - " + r2 );

        System.out.print("Country 3 : ");
        double c3 = Double.parseDouble(br.readLine());
        System.out.print("Time country 3 - ");
        double t3 = Double.parseDouble(br.readLine());
        double r3 = c3 * t3;
        System.out.println("Result 3 - " + r3);

        double tr = r1 + r2 + r3;
        System.out.println("Total result = " + tr);
    }
}

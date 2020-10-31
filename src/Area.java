import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Area {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Radius - ");
        double radius = Double.parseDouble(br.readLine());
        int number = 2;
        final float PI = 3.14F; // константа, після float F в кінці
        System.out.println("Perimeter is - " + radius * number * PI);
        System.out.println("Area is - " + PI * radius * radius);
    }
}
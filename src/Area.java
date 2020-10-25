import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;

public class Area {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.print("Radius - ");
        double radius = Double.parseDouble(br.readLine());
        int number = 2;
        double pi = 3.14;
        System.out.println("Perimeter is - " + radius * number * pi);
        System.out.println("Area is - " + pi * radius * radius);
    }
}
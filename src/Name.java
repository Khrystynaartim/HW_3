import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.IOException;


public class Name {
    public static void main(String[] args)  throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("What is your name?");
        String name = br.readLine();
        System.out.println("Where are you live, " + name);
        String live = br.readLine();
        System.out.println(name + live);
    }
}
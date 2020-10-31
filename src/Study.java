import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Study {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        int a, b, c, x, y;
        System.out.println("Розміри ребер цеглини - ");
        a = Integer.parseInt(br.readLine());
        b = Integer.parseInt(br.readLine());
        c = Integer.parseInt(br.readLine());
        System.out.println("Розміри сторін прямокутного отвору - ");
        x = Integer.parseInt(br.readLine());
        y = Integer.parseInt(br.readLine());

        if ((a<=0) || (b<=0) || (c<=0) || (x<=0) || (y<=0) ){
            System.out.println("Введено некоректні дані!");
        }
        else if (((a<x)&&(b<x))||((a<y)&&(b<y))||((a<x)&&(c<x))||((a<y)&&(c<y))||((b<x)&&(c<x))||((b<y)&&(c<y))) {
            System.out.println("Цеглина пройде через отвір!");
        }
        else{
            System.out.println("Цеглина не пройде через отвір!");
        }

    }

}
import java.util.Scanner;

public class Intro {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = x/y;
        int remainder = x-y * z;
        System.out.println("Remainder =" + remainder);
    }
}

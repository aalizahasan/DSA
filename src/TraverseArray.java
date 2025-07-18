import java.util.Scanner;

class Traverse{

    int TraverseArr() {
        System.out.println("Find Number:");
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();

        int[] arr = {1, 5, 8};
        for (int i = 0; i < arr.length; i++) {
            if (x == arr[i]) {
                System.out.println("the number is present");
                return x;
            }
        }
        return -1;
    }

    }
public class TraverseArray {
    public static void main(String[] args) {
        Traverse t  = new Traverse();
        t.TraverseArr();
    }
}

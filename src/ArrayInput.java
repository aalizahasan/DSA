import java.util.Scanner;

class Input{
    void InputArr(){

        System.out.println("Enter Size Of Array:");
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        System.out.println(" Enter " + n + " Numbers: ");
        for (int i = 0; i<n ; i++){
            arr[i] = sc.nextInt();
        }

        for(int i = 0; i<n ; i++){
            System.out.println(arr[i]);
        }

    }
}



public class ArrayInput {
    public static void main(String[] args) {
        Input i = new Input();
        i.InputArr();
    }
}

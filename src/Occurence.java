import java.util.Scanner;


class Occ{

    void Occ_Arr(){
        int[] arr = {1,2,3,5,6,3};
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Number whose Occurence is checking:");
        int x = sc.nextInt();
        for (int i = 0; i<arr.length; i++){
            if (x==arr[i]){
                count++;

            }
        }
        System.out.println(count);
    }
}




public class Occurence {
    public static void main(String[] args) {
        Occ o = new Occ();
        o.Occ_Arr();

    }
}

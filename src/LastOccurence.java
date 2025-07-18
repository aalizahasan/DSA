import java.util.Scanner;


class Last_Occ{

    void Occ_Last(){
        int index = 0;
        int[] arr = {1,2,3,5,6,3};
        Scanner sc = new Scanner(System.in);
        System.out.println("Number whose Occurence is checking:");
        int x = sc.nextInt();
        for (int i = 0; i<arr.length; i++){
            if (x==arr[i]){
                //System.out.println(i);
                index = i;


            }
        }
        System.out.println(index);

    }
}




public class LastOccurence {
    public static void main(String[] args) {
        Last_Occ o = new Last_Occ();
        o.Occ_Last();

    }
}

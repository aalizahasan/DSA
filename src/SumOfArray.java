class Sum{

    int summ =0;
    void SumArr(){

        int[] arr = {1,5,7};
        for (int i =0; i<3; i++){
            summ = summ+arr[i];

        }
        System.out.println(summ);
    }
}
public class SumOfArray {
    public static void main(String[] args) {
        Sum s = new Sum();
        s.SumArr();
    }
}

class Max{


    void MaxArr(){
        int max = 0;
        int[] arr = {1,5,8};
        for (int i =0; i<arr.length; i++){
            if(max<arr[i]){
                max = arr[i];
            }

        }
        System.out.println(max);
    }
}
public class MaxOfArray {
    public static void main(String[] args) {
        Max m = new Max();
        m.MaxArr();
    }
}

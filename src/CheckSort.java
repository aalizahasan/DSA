
class Sort{

    static void printArray(int arr[]){
        for (int i=0; i<arr.length; i++){
            System.out.print( arr[i] );
        }
    }

    boolean Sort_check(){

        int[] arr = {1,2,3};
        printArray(arr);

        for (int i = 0; i<arr.length-1; i++){

                if (arr[i+1]>arr[i]) {
                    System.out.println("the Array is sorted");
                    return true;
                }


            }
        System.out.println(" array is not  sorted");
        return false;


    }
}




public class CheckSort {
    public static void main(String[] args) {
        Sort s = new Sort();
        s.Sort_check();

    }
}

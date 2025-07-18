class Array{

static void printArray(int arr[]){
    for (int i=0; i<arr.length; i++){
        System.out.print(arr[i]);
    }
}
void copyArray() {
    int[] arr = new int[3];
    arr[0] = 2;
    arr[1] = 3;
    arr[2] = 5;
printArray(arr);
int [] arr_1 = arr;
printArray(arr_1);
int [] arr_2 = arr.clone();
printArray(arr_2);

arr_2[0] = 4;
arr_2[1] = 2;

printArray(arr);
printArray(arr_2);



}

}




public class ArrayReference {
    public static void main(String[] args) {
    Array a = new Array();
    a.copyArray();

}
}

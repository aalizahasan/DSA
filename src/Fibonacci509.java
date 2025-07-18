class Fibonacci{
    int fib(int n) {
        if (n==0){
            return 0;
        }
        else if (n==1){
            return 1;

        }

        int FirstNumber = 0;
        int SecondNumber = 1;


        for (int i= 1; i<n; i++ ){
            int ThirdNumber = FirstNumber + SecondNumber;

            FirstNumber = SecondNumber;
            SecondNumber = ThirdNumber;

        }
        return SecondNumber;


    }

}



public class Fibonacci509 {
    public static void main(String[] args) {
        Fibonacci f = new Fibonacci();
        f.fib(4);

    }
}
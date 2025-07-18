class PalindromeNo {
    boolean isPalindrome(int x) {
        int n = x;
        if (n < 0) {
            return false;
        }
        long revNo = 0;
        while (n > 0) {
            int R = n % 10;
            revNo = revNo * 10 + R;
            n = n / 10;
        }
        return revNo == x;
    }
}

public class Palindrome9th {
    public static void main(String[] args) {
        PalindromeNo p = new PalindromeNo();
        boolean result = p.isPalindrome(232);
        System.out.println( "Is palindrome? " + result);
    }
}

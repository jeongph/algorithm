public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        boolean ans = true;
        String xToStr = Integer.toString(x);
        int decalPointer = xToStr.length() - 1;

        if (xToStr.charAt(0) == '-') ans = false;
        else {  // negative check
            for (int i = 0; i < (xToStr.length() / 2); i++) {
                if (xToStr.charAt(i) != xToStr.charAt(decalPointer)) ans = false;
                else --decalPointer;
            }
        }

        return ans;
    }

    public static void main(String[] args) {
        PalindromeNumber pn = new PalindromeNumber();

        int x = 1001;
//        int x = -121;
        System.out.println(pn.isPalindrome(x));
    }
}

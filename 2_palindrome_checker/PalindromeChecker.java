

public class PalindromeChecker {
    public static void main(String[] args) {
        System.out.println(isPalindrome(-121));
        
    }

    
    public static boolean isPalindrome(int x) {
        String num = String.valueOf(x);
        String numRevers = "";

        for (int i = num.length() - 1; i > -1; i--) {
            numRevers += num.charAt(i);
        }     
        
        return num.equals(numRevers);
    }
    
    
}

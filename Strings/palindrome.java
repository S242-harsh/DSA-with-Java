public class palindrome {
    public static boolean checkPalindrome(String str){
        int left=0;
        int right=str.length()-1;
        while(left < right) {
            if(str.charAt(left) != str.charAt(right)) {
                return false; // Characters do not match, not a palindrome
            }
            left++; // Move towards the center from the left
            right--; // Move towards the center from the right
}
        return true; // All characters matched, it is a palindrome
    }
    public static void main(String[] args) {
        String str = "madam";
        boolean isPalindrome = checkPalindrome(str);
        
        if (isPalindrome) {
            System.out.println(str + " is a palindrome.");
        } else {
            System.out.println(str + " is not a palindrome.");
        }
    }
    
}

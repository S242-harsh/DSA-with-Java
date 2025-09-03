public class vowelCount {
    public static int vowel_Count(String name) {
        int count = 0;
        // Convert the string to lowercase to handle both uppercase and lowercase vowels
        name = name.toLowerCase();
        // Iterate through each character in the string
        for (int i = 0; i < name.length(); i++) {
            char ch=name.charAt(i);
            // Check if the character is a vowel
            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                count++; // Increment the count for each vowel found

                
            }
        }
      return count; // Return the total count of vowels

        
    }
    public static void main(String[] args) {
        String name="Shani Kumar Payasi ji";
        int result = vowel_Count(name);
        System.out.println("The number of vowels in the string is: " + result);
      
    }
    
}

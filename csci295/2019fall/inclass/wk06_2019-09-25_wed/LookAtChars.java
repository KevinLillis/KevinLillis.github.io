class LookAtChars {
    public static void main(String[] args) {
        // Use the charAt metho to extract individual characters from a String
        
        String school = "Ambrose";
        String formatString = "school[%d] = %c%n";
        
        for(int index = 0; index < school.length(); index++){
            System.out.printf(formatString, index, school.charAt(index));
        }
    }
    
}
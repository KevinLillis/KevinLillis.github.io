
/**
 * @author Dr. Lillis
*/

public interface BalanceCheckerInterface {
    
    /**
     * Adds a pair of matching characters. For example '(' matches with ')'
     * and '{' matches with '}'.
     * @param open An opening character
     * @param close The corresponding closing character
     */
    void addPair(Character open, Character close);
    
    /**
     * Checks the given string and uses the pairs of symbols previously added
     * with addPair to see if the string has balanced symbols. If the string 
     * does have balanced symbols, this method returns true, otherwise it
     * returns false.
     * @param s The string to be checked for balanced symbols
     * @return true if the string s has balanced symbols, returns false otherwise
     */
    boolean isBalanced(String s);

    /**
     * Checks to see if the given character has been added as an opening 
     * character.
     * @param c The symbol to check
     * @return true if the given character has been added as an opening 
     * character, returns false otherwise.
     */
    boolean isOpening(Character c);

    /**
     * Checks to see if the given character has been added as a closing 
     * character.
     * @param c The symbol to check
     * @return true if the given character has been added as a closing 
     * character, returns false otherwise.
     */
    boolean isClosing(Character c);
    
    /**
     * Returns true if the two given characters are a pair of matching
     * characters that have been previously added with the addPair method.
     * The first symbol is assumed to be an opening character (this is not 
     * checked). The method returns true if the second character is the closing
     * character that corresponds to the first.
     * @param c1 The first character to check
     * @param c2 The second character to check
     * @return true if the symbols are a matching pair that has been previously
     * added with the addPair method.
     */
    boolean match(Character c1, Character c2);
}

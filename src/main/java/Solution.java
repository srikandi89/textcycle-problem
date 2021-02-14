public class Solution {
    private final int CHAR_LIMIT = 'z'-'a'+1;

    // Answer for question 1 : the algorithm
    // Time Complexity = O(n)
    // assumption 1 : all characters transformed are in lower case
    public String transformString(String str, int n) {
        StringBuilder transformed = new StringBuilder();

        // toLowerCase operation time complexity is O(n)
        String lowerCase = str.toLowerCase();

        // this loop runs at O(n) time complexity
        for (int i = 0; i < lowerCase.length(); i++) {
            char chr = lowerCase.charAt(i);
            n = n % CHAR_LIMIT;
            chr += n;
            if (chr >= 'z') {
                chr-=CHAR_LIMIT;
            }
            transformed.append(chr);
        }

        return transformed.toString();
    }

    // Answer for question 1 : the algorithm
    // Time Complexity = O(n)
    // assumption 2 : all characters transformed based on its case, upper or lower case
    // for example : str = aA, n = 2, will transformed to cC
    public String transformString2(String str, int n) {
        StringBuilder transformed = new StringBuilder();

        // this loop runs at O(n) time complexity
        for (int i = 0; i < str.length(); i++) {
            char chr = str.charAt(i);
            char upperBound = getUpperBound(chr);
            chr += n;
            if (chr >= upperBound) {
                chr-=CHAR_LIMIT;
            }
            transformed.append(chr);
        }

        return transformed.toString();
    }

    public boolean isLowerCase(char chr) {
        return (chr >= 'a' && chr < 'z');
    }

    public char getUpperBound(char chr) {
        if (isLowerCase(chr)) {
            return 'z';
        } else {
            return 'Z';
        }
    }

    // Answer of Question 2
    // The disadvantage by using ASCII value of the letters is adding computation for conversion.
    // Instead of using ASCII value, we just increment or decrement the char in literal way
}

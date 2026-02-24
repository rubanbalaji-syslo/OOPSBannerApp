import java.util.HashMap;
import java.util.Map;

public class OOPSBannerApp {

    // Static Inner Class
    static class CharacterPattern {
        private char character;
        private String[] pattern;

        // Constructor
        public CharacterPattern(char character, String[] pattern) {
            this.character = character;
            this.pattern = pattern;
        }

        // Getter
        public String[] getPattern() {
            return pattern;
        }

        public char getCharacter() {
            return character;
        }
    }

    public static void main(String[] args) {

        // Map to store character and pattern
        Map<Character, CharacterPattern> patternMap = new HashMap<>();

        // Add O
        patternMap.put('O', new CharacterPattern('O', new String[]{
                " ***** ",
                "*     *",
                "*     *",
                "*     *",
                " ***** "
        }));

        // Add P
        patternMap.put('P', new CharacterPattern('P', new String[]{
                " ***** ",
                "*     *",
                " ***** ",
                "*      ",
                "*      "
        }));

        // Add S
        patternMap.put('S', new CharacterPattern('S', new String[]{
                " ***** ",
                "*      ",
                " ***** ",
                "      *",
                " ***** "
        }));

        String word = "OOPS";

        // Render using StringBuilder
        for (int row = 0; row < 5; row++) {
            StringBuilder line = new StringBuilder();

            for (char ch : word.toCharArray()) {
                CharacterPattern cp = patternMap.get(ch);
                if (cp != null) {
                    line.append(cp.getPattern()[row]).append("   ");
                }
            }

            System.out.println(line);
        }
    }
}
import java.util.HashMap;
import java.util.Map;
public class OOPSBannerApp 
{
    public static Map<Character, String[]> createCharacterPatternMap()
    {
        Map<Character, String[]> charMap = new HashMap<>();

        charMap.put('O', new String[]
        {
            "   ***    ",
            " **   **  ",
            "**     ** ",
            "**     ** ",
            "**     ** ",
            "**     ** ",
            "**     ** ",
            " **   **  ",
            "   ***    "
        });

        charMap.put('P', new String[]
        {
            "******    ",
            "**    **  ",
            "**     ** ",
            "**    **  ",
            "******    ",
            "**        ",
            "**        ",
            "**        ",
            "**        "
        });

        charMap.put('S', new String[]
        {
            "   ***** ",
            "  **     ",
            "**       ",
            "  **     ",
            "   ***   ",
            "     **  ",
            "       **",
            "     **  ",
            " *****   "
        });

        return charMap;
    }
    public static void displayBanner(String message, Map<Character, String[]> charMap)
    {
        int patternHeight = charMap.get(message.charAt(0)).length;

        for (int i = 0; i < patternHeight; i++)
        {
            StringBuilder line = new StringBuilder();

            for (char ch : message.toCharArray())
            {
                String[] pattern = charMap.get(ch);
                line.append(pattern[i]);
            }

            System.out.println(line.toString());
        }
    }

    public static void main(String[] args) {
        Map<Character, String[]> charMap = createCharacterPatternMap();
        String message = "OOPS";
        displayBanner(message, charMap);
    }
}
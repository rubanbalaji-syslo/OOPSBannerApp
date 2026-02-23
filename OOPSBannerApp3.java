/**
 * OOPSBannerApp2 UC4 Render OOPS as Banner using String Array and Loop
 *
 * This class improves upon UC3 by using a String array to store banner lines
 * and iterating through them with a for-each loop, eliminating hardcoded print
 * statements and improving modularity and reusability.
 * * @author Developer
 * @version 4.0
 */
public class OOPSBannerApp2 {

    /**
     * Main method to run the banner display.
     * Constructs banner lines using String.join(), stores them in an array, 
     * and prints them using a for-each loop.
     */
    public static void main(String[] args) {
        // 1. Define a String array with a size equal to the number of lines (7) [cite: 178, 192]
        String[] lines = new String[7];

        // 2. Populate each index of the array using String.join() [cite: 173, 193]
        lines[0] = String.join("", "  **** ", "  **** ", " ***** ", "  **** ");
        lines[1] = String.join("", " ** ** ", " ** ** ", " ** ** ", " ** ");
        lines[2] = String.join("", " ** ** ", " ** ** ", " ** ** ", "  *** ");
        lines[3] = String.join("", " ** ** ", " ** ** ", " ***** ", "    ** ");
        lines[4] = String.join("", " ** ** ", " ** ** ", " ** ", "    ** ");
        lines[5] = String.join("", " ** ** ", " ** ** ", " ** ", " ** ** ");
        lines[6] = String.join("", "  **** ", "  **** ", " ** ", "  **** ");

        // 3. Use an enhanced for-each loop to iterate and print [cite: 176, 180, 194, 207]
        for (String line : lines) {
            System.out.println(line); [cite: 209]
        }
    }
}
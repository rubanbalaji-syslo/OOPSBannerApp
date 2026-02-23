/**
 * OOPSBannerApp1 UC3 OOPS Banner Application (Use Case 3)
 * * This class refactors the banner display to use String.join() for better 
 * memory efficiency and readability[cite: 7, 8].
 * * @author Developer [cite: 88]
 * @version 3.0 [cite: 90]
 */
public class OOPSBannerApp1 {

    public static void main(String[] args) {
        // Construct each line using String.join() for better readability and efficiency[cite: 116].
        // Each line corresponds to a row in the banner for the letters O, O, P, S[cite: 118].

        // Row 1
        System.out.println(String.join("", " **** ", " **** ", " ***** ", "  **** "));
        
        // Row 2
        System.out.println(String.join("", "** ** ", "** ** ", "** ** ", " ** "));
        
        // Row 3
        System.out.println(String.join("", "** ** ", "** ** ", "** ** ", "  *** "));
        
        // Row 4
        System.out.println(String.join("", "** ** ", "** ** ", "***** ", "    ** "));
        
        // Row 5
        System.out.println(String.join("", "** ** ", "** ** ", "** ", "    ** "));
        
        // Row 6
        System.out.println(String.join("", "** ** ", "** ** ", "** ", " ** **"));
        
        // Row 7
        System.out.println(String.join("", " **** ", " **** ", "** ", "  **** "));
    }
}
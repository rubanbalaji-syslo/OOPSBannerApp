public class OOPSBannerApp {
    public static void main(String[] args) {
        String[] bannerLines = new String[9];

        bannerLines[0] = String.join("", "   ***    ", "   ***    ", "******    ", "   ***** ");
        bannerLines[1] = String.join("", " **   **  ", " **   **  ", "**    **  ", "  **     ");
        bannerLines[2] = String.join("", "**     ** ", "**     ** ", "**     ** ", "**       ");
        bannerLines[3] = String.join("", "**     ** ", "**     ** ", "**    **  ", "  **     ");
        bannerLines[4] = String.join("", "**     ** ", "**     ** ", "******    ", "   ***   ");
        bannerLines[5] = String.join("", "**     ** ", "**     ** ", "**        ", "     **  ");
        bannerLines[6] = String.join("", "**     ** ", "**     ** ", "**        ", "       **");
        bannerLines[7] = String.join("", " **   **  ", " **   **  ", "**        ", "     **  ");
        bannerLines[8] = String.join("", "   ***    ", "   ***    ", "**        ", " *****   ");

        for (String line : bannerLines) {
            System.out.println(line);
        }
    }
// }
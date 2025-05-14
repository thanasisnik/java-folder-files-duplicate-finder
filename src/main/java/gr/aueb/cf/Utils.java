package gr.aueb.cf;

public class Utils {
    // Εμφανίζει το μέγεθος ενός αρχείου σε ανθρώπινο αναγνώσιμο format (π.χ. KB, MB)
    public static String formatSize(long bytes) {
        if (bytes < 1024) {
            return bytes + " B";
        } else if (bytes < 1024 * 1024) {
            return bytes / 1024 + " KB";
        } else {
            return bytes / (1024 * 1024) + " MB";
        }
    }
}

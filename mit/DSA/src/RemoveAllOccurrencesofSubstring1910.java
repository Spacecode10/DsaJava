public class RemoveAllOccurrencesofSubstring1910 {
    public static String removeOccurrences(String s, String part) {
        int n = s.length();
        int index = s.indexOf(part);
        while(index != -1) {
            s = s.substring(0, index) + s.substring(index + part.length());
            n = s.length();
            index = s.indexOf(part);
        }
        return s;
    }

    public static void main(String[] args) {
        System.out.println(removeOccurrences("daabcbaabcbc","abc"));
    }
}

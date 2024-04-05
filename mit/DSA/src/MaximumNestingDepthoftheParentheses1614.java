public class MaximumNestingDepthoftheParentheses1614 {
    public static int maxDepth(String s) {
        if (s.length() == 0 || s.length() == 1) {
            return 0;
        }
        // List<Integer> arr=new ArrayList<Integer>();
        // arr.add(0);
        int count = 0;
        int temp = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == '(') {
                temp++;
            }
            if (s.charAt(i) == ')') {
                temp--;
            }
            if (count < temp) {
                count = temp;
            }
        }
        // System.out.print(arr);
        return count;
    }

    public static void main(String[] args) {
        System.out.println(maxDepth("(1+(2*3)+((8)/4))+1"));
    }
}

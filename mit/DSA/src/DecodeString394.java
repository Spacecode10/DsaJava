import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

public class DecodeString394 {
    public static String decodeString(String s) {
        Stack<Integer> counts = new Stack<>();
        Stack<StringBuilder> resultStack = new Stack<>();
        StringBuilder current = new StringBuilder();
        int i = 0;

        while (i < s.length()) {
            char ch = s.charAt(i);

            if (Character.isDigit(ch)) {
                // Parse the entire number (handles multi-digit numbers)
                int start = i;
                while (i < s.length() && Character.isDigit(s.charAt(i))) {
                    i++;
                }
                int count = Integer.parseInt(s.substring(start, i));
                counts.push(count);
                continue; // Already incremented i
            } else if (ch == '[') {
                // Push the current string onto the result stack
                resultStack.push(current);
                current = new StringBuilder();
                i++;
            } else if (ch == ']') {
                // Pop the repeat count and previous string
                int repeatCount = counts.pop();
                StringBuilder temp = resultStack.pop();
                for (int j = 0; j < repeatCount; j++) {
                    temp.append(current);
                }
                current = temp;
                i++;
            } else {
                // Regular character, append to current
                current.append(ch);
                i++;
            }
        }

        return current.toString();
    }

    public static void main(String[] args) {
        System.out.println(decodeString("2[abc]3[cd]ef"));
    }
}

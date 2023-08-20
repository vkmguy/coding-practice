import java.util.HashMap;
import java.util.Map;
import java.util.Stack;

public class ValidParenthesis {

    public static void main(String[] args) {
        isValid("()");
    }

    public static boolean isValid(String s) {

        Map<Character, Character> p = new HashMap<>();
        p.put(')', '(');
        p.put('}', '{');
        p.put(']', '[');
        Stack<Character> stack = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (p.containsKey(c)) {
                char top = stack.empty() ? '#' : stack.pop();
                if (top != p.get(c)) {
                    return false;
                }
            } else {
                stack.push(c);
            }
        }
        return stack.isEmpty();
    }
}

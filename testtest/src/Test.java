import java.util.*;

/**
 * TODO
 *
 * @Author: zhuzw
 * @Date: 2021-05-29 11:42
 * @Version: 1.0
 */
public class Test {
    public static void main(String[] args) {
        String s = "{{[]}";
        boolean check = check(s);
        System.out.println(check);
    }

    private static boolean check(String s) {
        if (s == null || s.length() == 0) {
            return false;
        }
        Map<Character, Character> map = new HashMap<>();
        map.put('(', ')');
        map.put('[', ']');
        map.put('{', '}');
        Collection<Character> right = map.values();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < s.length(); i++) {
            stack.push(s.charAt(i));
        }
        Stack<Character> stack2 = new Stack<>();
        while (!stack.isEmpty()) {
            Character pop = stack.pop();
            if (right.contains(pop)) {
                stack2.push(pop);
            }else {
                if (stack2.isEmpty()) {
                    return false;
                }else {
                    Character pop2 = stack2.pop();
                    if (!map.get(pop).equals(pop2)) {
                        return false;
                    }
                }
            }
        }
        if (!stack2.isEmpty()) {
            return false;
        }
        return true;
    }
}

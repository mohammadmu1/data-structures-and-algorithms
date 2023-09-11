package brackets;
import java.util.Stack;

public class Bracket {
    static private boolean isOpenBracket(char c) {
        return (c == '(' || c == '{' || c == '[');
    }

    static private boolean isCloseBracket(char c) {
        return (c == ')' || c == '}' || c == ']');
    }

    static private boolean isSimilarBracket(char openBracket, char closeBracket) {
        switch (openBracket) {
            case '[':
                return closeBracket == ']';
            case '(':
                return closeBracket == ')';
            case '{':
                return closeBracket == '}';
            default:
                return false;
        }
    }

    static public boolean validateBrackets(String s) {
        Stack<Character> stack = new Stack<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char temp = s.charAt(i);
            if (isOpenBracket(temp)) {
                stack.push(temp);
            } else if (isCloseBracket(temp)) {
                if (!stack.isEmpty() && isSimilarBracket(stack.peek(), temp)) {
                    stack.pop();
                } else {
                    return false; 
                }
            }
        }

        return stack.isEmpty();
    }

    public static void main(String[] args) {
        String expression = "{[()]()}";
        boolean isValid = validateBrackets(expression);
        System.out.println("Is the expression balanced? " + isValid); // Should print true
    }
}


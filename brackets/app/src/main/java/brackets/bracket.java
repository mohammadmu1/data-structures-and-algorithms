package brackets;
import java.util.Stack;

public class bracket {
    static private boolean isOpenBracket(char c){
        if(c=='(' || c=='{' || c=='[')
        return true;
        return false;
    }

    static private boolean isCloseBracket(char c){
        if(c==')' || c=='}' || c==']')
            return true;
        return false;
    }

    static  private boolean isSimilarBracket(char openBracket,char closeBracket){
        if((openBracket=='['&& closeBracket==']') ||
                (openBracket=='('&& closeBracket==')') ||
                (openBracket=='{'&& closeBracket=='}')
        )    return true;
        return false;
    }
    static public boolean validateBrackets(String s) {
       int counter=0;
        Stack<Character> stack = new Stack<>();
        int length = s.length();
        for (int i = 0; i < length; i++) {
            char temp = s.charAt(i);
            if (isOpenBracket(temp)) {
                stack.push(temp);
                counter++;
                continue;
            }

                if (isCloseBracket(temp)) {
                    counter++;
                    if(stack.size()!=0){
                    if (isSimilarBracket(stack.peek(), temp)) {
                        stack.pop();
                        counter=counter-2;
                    }}
                }

            }

            return ( stack.size() ==0 && counter==0);
    }}

# validate brackets method
<!-- Description of the  -->

challenge is create method  called "validateBrackets" that takes a single input parameter, a string. The function should return a boolean value indicating whether the brackets in the input string are balanced. The types of brackets to consider are round brackets (()), square brackets ([]), and curly brackets ({}). A set of brackets is considered balanced if every opening bracket has a corresponding closing bracket in the correct order.


## Whiteboard Process
<!-- Embedded whiteboard image -->
![](../brackets/Whiteboard%203%20(1).png)
### the code

```


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

  
}


```

### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### approach
1. Get the length of the input string.

2. Loop through each character in the string:
   - If it's an opening bracket, push it onto the stack.
   - If it's a closing bracket:
     - Check if the stack is not empty and if the closing bracket matches the most recent open bracket on the stack.
     - If they match, pop the open bracket from the stack.
     - If they don't match, return false (brackets are unbalanced).

3. After processing the entire string, check if the stack is empty:
   - If it's empty, all brackets are balanced, so return true.
   - If it's not empty, return false (unmatched open brackets).



### Big O space/time
 * Time Complexity  O(n)
 * Space Complexity O(n)
## Solution
<!-- Show how to run your code, and examples of it in action -->
### test code 
```
public class BracketTest {

    @Test
    public void testValidBrackets() {
        assertTrue(Bracket.validateBrackets(""));
        assertTrue(Bracket.validateBrackets("()"));
        assertTrue(Bracket.validateBrackets("{}"));
        assertTrue(Bracket.validateBrackets("[]"));
        assertTrue(Bracket.validateBrackets("({})"));
        assertTrue(Bracket.validateBrackets("([{}])"));
        assertTrue(Bracket.validateBrackets("{[()]}"));
    }

    @Test
    public void testInvalidBrackets() {
        assertFalse(Bracket.validateBrackets("("));
        assertFalse(Bracket.validateBrackets(")"));
        assertFalse(Bracket.validateBrackets("{"));
        assertFalse(Bracket.validateBrackets("}"));
        assertFalse(Bracket.validateBrackets("["));
        assertFalse(Bracket.validateBrackets("]"));
        assertFalse(Bracket.validateBrackets("({}"));
        assertFalse(Bracket.validateBrackets("{[()]}]"));
        assertFalse(Bracket.validateBrackets("[(])"));
        assertFalse(Bracket.validateBrackets(")("));
        assertFalse(Bracket.validateBrackets("{{[}}"));
    }
}
``` 

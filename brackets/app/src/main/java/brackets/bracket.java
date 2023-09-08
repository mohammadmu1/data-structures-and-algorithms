package brackets;

public class bracket {
    boolean isOpenbracket(char c){
        if(c=='(' || c=='{' || c=='[')
        return true;
        return false;
    }

    boolean isClosebracket(char c){
        if(c=='(' || c=='{' || c=='[')
            return true;
        return false;
    }

    boolean isSimilarbracket(char openBracket,char closeBracket){
        if((openBracket=='['&& closeBracket==']') ||
                (openBracket=='('&& closeBracket==')') ||
                (openBracket=='{'&& closeBracket=='}')
        )    return true;
        return false;
    }

}

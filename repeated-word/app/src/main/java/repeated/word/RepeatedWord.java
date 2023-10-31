package repeated.word;

import java.util.HashSet;

public class RepeatedWord {

    static String repeatedWord(String input){

        String[] stringArray = input.toLowerCase().split("[^a-zA-Z0-9]+");
        HashSet<String> set=new HashSet<>();
        int length = stringArray.length;
        for(int i = 0 ; i<length;i++){
            if(set.contains(stringArray[i])) return stringArray[i];
            else set.add(stringArray[i]);
        }
        return "There is no repeated string";
    }
}

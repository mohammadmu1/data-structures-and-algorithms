# find first repeated word  
<!-- Description of the  -->

find first repeated word in string 

input : String 
output : String
## Whiteboard Process
<!-- Embedded whiteboard image -->
![](../repeated-word/Whiteboard%2016.png)
### the code

```

static String repeatedWord(String input){

        String[] stringArray = input.toLowerCase().split("[,\\s]+");
        HashSet<String> set=new HashSet<>();
        int length = stringArray.length;
        for(int i = 0 ; i<length;i++){
            if(set.contains(stringArray[i])) return stringArray[i];
            else set.add(stringArray[i]);
        }
        return "There is no repeated string";
    } 



```

### Approach & Efficiency
<!-- What approach did you take? Why? What is the Big O space/time for this approach? -->
### approach
1. Convert the input string to lowercase using `toLowerCase()` to make the search case-insensitive.

2. Split the lowercase string into an array of words using both spaces and commas as delimiters.

3. Create a `HashSet` to store unique words.

4. Iterate through the array of words.
   - If a word is already in the `HashSet`, return it as the first repeated word.
   - Otherwise, add the word to the `HashSet`.

5. If no repeated words are found, return "There is no repeated string."



### Big O space/time
 * Time Complexity  O(n)
 * Space Complexity O(n)
<!-- ## Solution -->
<!-- Show how to run your code, and examples of it in action -->


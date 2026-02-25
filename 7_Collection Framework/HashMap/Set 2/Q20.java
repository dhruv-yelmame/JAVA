/*20. Implement Word Dictionary using HashMap
Problem Statement:
Store word and meaning in HashMap. Allow search functionality.
Input:
java → programming language
Search: java
Output:
Meaning = programming language
Explanation:
Use map.get().
*/


import java.util.*;
public class Q20 
{
    public static void main(String x[]) 
	{
        
        HashMap<String, String> map = new HashMap<>();
        
        map.put("java", "programming language");
        
        String searchWord = "java";
        
        String meaning = map.get(searchWord);
        
        if(meaning != null) 
		{
            System.out.println("Meaning = " + meaning);
        } 
		else 
		{
            System.out.println("Word not found");
        }
    }
}
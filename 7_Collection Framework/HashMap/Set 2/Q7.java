/*7. Invert a Map (Value → List of Keys)
Problem Statement:
Invert a Map<String, String> such that values become keys and group corresponding keys in list.
Input:
A → X
B → Y
C → X
Output:
X → [A,C]
Y → [B]
Explanation:
Use Map<String, List<String>>.
*/

import java.util.*;
public class Q7
{
	public static void main(String x[])
	{
		Scanner sc = new Scanner(System.in);
		HashMap<String, String> map = new HashMap<>();
		map.put("A", "X");
		map.put("B", "Y");
		map.put("C", "X");
		
		Map<String, List<String>> map2 = new HashMap<>();
		for(Map.Entry<String, String> entry : map.entrySet())
		{
			String key = entry.getKey();
            String value = entry.getValue();

            if(!map2.containsKey(value))
            {
                map2.put(value, new ArrayList<>());
            }

            map2.get(value).add(key);
		}
		
		for(Map.Entry<String, List<String>> entry : map2.entrySet())
		{
			System.out.println(entry.getKey()+" = "+entry.getValue());
		}
	}
}
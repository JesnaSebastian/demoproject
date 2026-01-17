package Programs;

import java.util.LinkedHashMap;
import java.util.Map;

public class counttheoccuranceandreplace {

           public static void main(String[] args) {

            String input = "Automation".toLowerCase();

            Map<Character, Integer> countMap = new LinkedHashMap<>();

            // Count occurrences
            for (char ch : input.toCharArray()) {
                countMap.put(ch, countMap.getOrDefault(ch, 0) + 1);
            }

            StringBuilder result = new StringBuilder();

            // Build result
            for (char ch : input.toCharArray()) {
                int count = countMap.get(ch);
                if (count > 1) {
                    result.append(count);
                } else {
                    result.append(ch);
                }
            }

            System.out.println(result);
        }
    }

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* Given two strings representing sentences,
return the words that are not common to both strings (i.e. the words that only appear in one of the sentences).
You may assume that each sentence is a sequence of words (without punctuation)
correctly separated using space characters. */
public class UncommonWords {

    public static void main(String[] args) {
        // sentence1 = "the quick", sentence2 = "brown fox", returns ["the", "quick", "brown", "fox"]
        // sentence1 = "the tortoise beat the haire", sentence2 = "the tortoise lost to the haire", returns ["beat", "to", "lost"]
        // sentence1 = "copper coffee pot", sentence2 = "hot coffee pot", returns ["copper", "hot"]
        System.out.println(uncommonFromSentences("the quick", "brown fox"));
    }

    public static List<String> uncommonFromSentences(String sentence1, String sentence2) {
        Map<String, Integer> wordCounts = new HashMap<>();
        countWords(sentence1, wordCounts);
        countWords(sentence2, wordCounts);

        List<String> uncommonWords = new ArrayList<>();
        for(String key: wordCounts.keySet()) {
            if(wordCounts.get(key) == 1) {
                uncommonWords.add(key);
            }
        }

        return uncommonWords;
    }

    private static void countWords(String sentence, Map<String, Integer> counts) {
        String[] words = sentence.split(" ");
        for(String word: words) {
            if(counts.containsKey(word)) {
                counts.put(word, -1);
            } else {
                counts.put(word, 1);
            }
        }
    }
}

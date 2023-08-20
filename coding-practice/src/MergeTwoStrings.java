public class MergeTwoStrings {

    public static String mergeAlternately(String word1, String word2) {

        StringBuilder sb = new StringBuilder();
        int l1 = 0;
        int l2 = 0;

        while (l1 < word1.length()  && l2 < word2.length()){
            sb.append(word1.charAt( l1));
            l1++;
            sb.append(word2.charAt(l2));
            l2++;
        }
        if (l1 == word1.length()){
            sb.append(word2, l2, word2.length());
        }
        if (l2 == word2.length()){
            sb.append(word1, l1, word1.length());
        }

        return sb.toString();

    }

    public static void main(String[] args) {

        String word1 = "ab";
        String word2 = "pqrs";

       String result = mergeAlternately(word1,word2);

        System.out.println(result);
    }
}

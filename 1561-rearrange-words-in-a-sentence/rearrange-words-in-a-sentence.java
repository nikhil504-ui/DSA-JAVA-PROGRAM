class Solution {
    public String arrangeWords(String text) {
         String[] words = text.split(" ");
        
        words[0] = words[0].toLowerCase();
        
        Arrays.sort(words, (a, b) -> Integer.compare(a.length(), b.length()));
        
        String result = String.join(" ", words);
        
        return Character.toUpperCase(result.charAt(0)) + result.substring(1);
    }
}
class Solution {
    public static void main(String[] args) {
        String[] strings = {"are","amy","u"};
        int left = 0, right = 2;
        System.out.println(vowelStrings(strings, left, right));
    }
    public static int vowelStrings(String[] words, int left, int right) {
        int result = 0;

        for(int i = left; i <= right; i++){
            if(isVowel(words[i]))
                result++;
        }
        return result;
    }

    public static boolean isVowel(String s){
        return (s.charAt(0) == 'a' || s.charAt(0) == 'e' || s.charAt(0) == 'i' || s.charAt(0) == 'o' ||
                s.charAt(0) == 'u') && (s.charAt(s.length() - 1) == 'a' || s.charAt(s.length() - 1) == 'e' ||
                s.charAt(s.length() - 1) == 'i' || s.charAt(s.length() - 1) == 'o' || s.charAt(s.length() - 1) == 'u');
    }
}
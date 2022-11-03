public class StringLoops {
    public StringLoops(){}
    public int countCharacters(String character, String searchString){
        int count = 0;
        for(int i = 0; i < searchString.length(); i++){
            String check = String.valueOf(searchString.charAt(i));
            if(check.equals(character)){
                count++;
            }
        }
        return count;
    }
    public String reverseString(String origString){
        String newStr = "";
        for(int i = origString.length(); i <= 0; i--){
            newStr += "" + origString.charAt(i);
        }
        return newStr;
    }
    public String reverseString2(String origString){
        String newStr = "";
        for(int i = 0; i <= origString.length(); i++){
            newStr += "" + origString.charAt(origString.length() - i);
        }
        return newStr;
    }
    public int countVowels(String origString){
        int count = 0;
        for (int i = 0; i <= origString.length(); i++){
            String check = "" + origString.charAt(i);
            if(check.equals("a") || check.equals("e") || check.equals("i") || check.equals("o") || check.equals("u"))
                count++;
        }
        return count;
    }
    
}

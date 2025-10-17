class Solution {
    public String capitalizeTitle(String title) {
        String lower = title.toLowerCase();
        String[] words = lower.split(" ");
        
        StringBuilder sb = new StringBuilder("");

        for(int i = 0 ; i < words.length ; i++){
            if(words[i].length() > 2){
                sb.append(Character.toUpperCase(words[i].charAt(0)));
                sb.append(words[i] , 1 , words[i].length());
                sb.append(" ");
            }
            else{
                sb.append(words[i]);
                sb.append(" ");
                } 
        }

        return sb.toString().trim();
    }
}
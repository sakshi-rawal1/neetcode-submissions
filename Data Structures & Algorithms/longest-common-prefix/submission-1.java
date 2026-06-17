class Solution {
    public String longestCommonPrefix(String[] strs) {
        // consider first word as longest common prefix 
        StringBuilder result = new StringBuilder(strs[0]);
        //iterate 
        for(int i=1;i<strs.length;i++){
        // will compare the lengths of first and next string 
        if(strs[i].length() == 0){
            return "";
        }
        int j=0;
        if(strs[i].length() < result.length()){
            result.delete(strs[i].length(), result.length());
        }
        for(char ch : result.toString().toCharArray()){
            if(ch != strs[i].charAt(j)){
                result.delete(j, result.length());
                break;
            }
            j++;
        }
        // if make the shorter srtring as the result 
        // will keep comparing with the letters from begining 
        // if does not matches at all will return empty string 
        // if matches will a bit will discard the rest of the letters 
        }
        return result.toString();
    }
}

//TC : O(n * m)
//SC : O(1)
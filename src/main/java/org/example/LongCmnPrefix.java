package org.example;

public class LongCmnPrefix {
    public String longestCommonPrefix(String[] strs) {
        String ans ="",res="";int len = Integer.MAX_VALUE;
        for(int i=0;i<strs.length;i++){
            if(strs[i].length() < len){
                res = strs[i]; len = res.length();
            }
        }
        //res - smallest string of strs array
        int c=0;
        for(int i=0;i<res.length();i++){
            for(int j=0;j<strs.length;j++){
                if(res.charAt(i)==strs[j].charAt(i)){
                    c++;
                }else{
                    break;
                }
            }
            if(c == strs.length){
                ans+=res.charAt(i); c=0;
            }else{
                break;
            }
        }
        return ans;
    }
}

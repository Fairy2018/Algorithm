//第14题-easy

class Solution {
    public String longestCommonPrefix(String[] strs) {
        int slen=strs.length;
        if(slen==0||strs==null) return "";
        if(slen==1) return strs[0];
        StringBuilder res=new StringBuilder();
        int i=0;
        while(i>=0){
            for(int j=0;j<slen-1;j++){
                if(strs[j]=="") return "";
                if(strs[j].length()==i||strs[j+1].length()==i) return res.toString();
                if(strs[j].charAt(i)!=strs[j+1].charAt(i)) return res.toString(); 
            }
            res.append(strs[0].charAt(i));
            i++; 
        }   
        return res.toString();
    }
}
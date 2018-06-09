//第20题
class Solution {
    public boolean isValid(String s) {
        int slen=s.length();
        if(s=="") return true;
        if(s==null||slen==1) return false;
        Stack<Character> stack=new Stack<>();
        for(int i=0;i<slen;i++){
            switch(s.charAt(i)){
                    case '(':stack.push(s.charAt(i));continue;
                    case '[':stack.push(s.charAt(i));continue;
                    case '{':stack.push(s.charAt(i));continue;
                    case ')':{
                        if(stack.isEmpty()) return false;
                        if(stack.pop()=='(') {continue;}
                        else return false;
                    }
                    case ']':{
                        if(stack.isEmpty()) return false;
                        if(stack.pop()=='[') {continue;}
                        else return false;
                    }
                    case '}': {
                        if(stack.isEmpty()) return false;
                        if(stack.pop()=='{') {continue;}
                        else return false;
                    }
            }   
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}
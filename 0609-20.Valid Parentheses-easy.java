//第20题
class Solution {
    public boolean isValid(String s) {
        int slen=s.length();
        if(s=="") return true;
        if(s==null||slen==1) return false;
        Stack<Character> stack=new Stack<>();
        HashMap<Character,Character> map=new HashMap<>();
        map.put(')','(');
        map.put(']','[');
        map.put('}','{');
        for(int i=0;i<slen;i++){
            char ss=s.charAt(i);
            if(ss=='('||ss=='['||ss=='{') {
                stack.push(ss);continue;
            }
            if(ss==')'||ss==']'||ss=='}') {
                if(stack.isEmpty()) return false;
                if(stack.pop()==map.get(ss)) {continue;}
                else return false;
            }   
        }
        if(!stack.isEmpty()) return false;
        return true;
    }
}

//学习别人的代码   
class Solution{
    public boolean isValid(String s) {
        Stack<Character> stack = new Stack<Character>();
        for (char c : s.toCharArray()) {
            if (c == '(')
                stack.push(')');
            else if (c == '{')
                stack.push('}');
            else if (c == '[')
                stack.push(']');
            else if (stack.isEmpty() || stack.pop() != c)
                return false;
        }
        return stack.isEmpty();
}
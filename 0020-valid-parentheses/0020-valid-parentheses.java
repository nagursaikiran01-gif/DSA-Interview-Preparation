class Solution {
    public boolean isValid(String s) {
        Stack<Character> s1=new Stack<>();
        int n=s.length();
        HashMap<Character,Character> m1=new HashMap<>();
        m1.put('[',']');
        m1.put('(',')');
        m1.put('{','}');
        for(int i=0;i<n;i++){
            char c=s.charAt(i);
            if(m1.containsKey(c)){
                s1.push(c);
            }
            else{
                if(!s1.isEmpty()){
                    char p=s1.peek();
                    if(m1.get(p)==c){
                        s1.pop();
                        continue;
                    }
                    else{
                        return false;
                    }
                }
                else{
                    return false;
                }
            }
        }
        if(s1.isEmpty()){
            return true;
        }
        return false;
    }
}
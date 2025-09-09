class Solution {
    public boolean isValid(String s) {
        int count = 0;
        if(!(s.length()%3 == 0)){
            return false;
        }else{
            Stack<Character> st = new Stack<>();
            
            for(int i = 0;i<s.length();i++){
                st.push(s.charAt(i));
                if(st.size() >= 3){
                    Character c1 = st.pop();
                    Character c2 = st.pop();
                    Character c3 = st.pop();
                    
                    String s1 = String.valueOf(c3) + String.valueOf(c2) + String.valueOf(c1);
                    
                    if(s1.equalsIgnoreCase("abc")){
                        count++;
                    }else{
                        st.push(c3);
                        st.push(c2);
                        st.push(c1);
                }

            }
           
        }

       
    }
     if(count == s.length()/3) return true;
        else return false;
        
    }
}

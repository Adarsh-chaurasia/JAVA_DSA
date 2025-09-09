class Solution {
    
    public boolean balanced(char s , char e){
        if(s == '(' && e == ')') return true;
        else if(s == '{' && e == '}') return true;
        else if(s == '[' && e == ']') return true;
        else return false;
        
    }

    public boolean isValid(String s) 
    {
        Stack<Character> st = new Stack<>();
        for(int i = 0; i<s.length();i++){
            Character ch = s.charAt(i);
            if(ch =='(' || ch == '{' || ch == '[' )
                st.push(ch);
            else{
                if(st.isEmpty()) return false;
                else if(!balanced(st.peek() , ch)){
                    return false;
                }

                st.pop();

                }
            }


            if(st.isEmpty()) return true;
            else return false;
        }
        
    }

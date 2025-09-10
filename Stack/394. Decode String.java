class Solution {
    public String decodeString(String s) 
    {
        Stack<StringBuilder> st =new Stack<>();
        Stack<Integer> st1 =new Stack<>();
        StringBuilder sb = new StringBuilder();
        int n = 0;


        for(int i = 0 ; i<s.length();i++){
            char c = s.charAt(i);

            if(Character.isDigit(c)){
                n = n*10+(c-'0');

            }
            else if(c == '['){
                st1.push(n);
                n = 0;
                st.push(sb);
                sb = new StringBuilder();

            }else if(c == ']'){
                int k = st1.pop();
                StringBuilder tmp = sb;
                sb = st.pop();
                while(k-- >0){
                    sb.append(tmp);
                }
            }
            else{
                sb.append(c);
            }
           
        }

        return sb.toString();
        


    }
}

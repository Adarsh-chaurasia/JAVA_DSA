class Solution {
    public int calculate(String s) 
    {
        Stack<Integer> exp = new Stack<>();
        int result = 0;

        int num= 0 ;
        int sign = 1;

        for(int i = 0 ;i<s.length();i++)
        {
            char c = s.charAt(i);
            if(Character.isDigit(c)){
                num = num*10 +  (int)(c - '0');
            }
            else if(c == '+'){
                result += sign*num;
                num = 0;
                sign = 1;

            }
            else if(c == '-'){
                result += sign*num;
                num = 0;
                sign = -1;
            }
            else if(c == '('){
                exp.push(result);
                exp.push(sign);
                result = 0;
                sign= 1;

            }
            
            else if(c == ')'){
                result += sign*num;
                num =0;
                result*=exp.pop();
                result+=exp.pop();
            }

        }

        if(num != 0){
            result += sign*num;
        }

        return result;




    }
}

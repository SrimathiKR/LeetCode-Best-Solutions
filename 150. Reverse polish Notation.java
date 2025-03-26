class Solution {
    public int evalRPN(String[] tokens) {
        Stack<Integer> st=new Stack<>();
        for(int i=0;i < tokens.length;i++){
            if(tokens[i].equals("+") || tokens[i].equals("-") || tokens[i].equals("*") || tokens[i].equals("/") ){
                int b=st.pop();
                int a=st.pop();
                if(tokens[i].equals("+")){
                    st.push(a+b);
                }
                if(tokens[i].equals("-")){
                    st.push(a-b);
                }
                if(tokens[i].equals("*")){
                    st.push(a*b);
                }
                if(tokens[i].equals("/")){
                    st.push(a/b);
                }
            }
            else{
                int num=Integer.parseInt(tokens[i]);
                st.push(num);
            }
        }
        return st.pop();
        
    }
}
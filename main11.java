import java.util.Stack;

class ValidParentheses {
    public boolean isValid(String s) 
    {
        final String opening="({[";
        final String closing= ")}]";
       Stack<Character> st = new Stack<>();

        for(char c:s.toCharArray())
        {
            if(opening.indexOf(c)!=-1)
            {
                st.push(c);
            }
            else if(closing.indexOf(c)!=-1)
            {
                if(st.isEmpty())//Nothing to match with.
                {
                    return false;
                }
                if(closing.indexOf(c)!=opening.indexOf(st.pop()))//mismatched delimiter
                {
                    return false;       
                }
                
            }
           
            
        } 
        return st.isEmpty();//were all opening delimiters matched?
    }
}
    
public class PathCheckerLc {
    public static void main(String[] args) {
        Stack<String> st = new Stack<>();
        String curr = "";
        String path = ""

        for(int i=0;i<path.length();i++){

            if(path.charAt(i) = '/'){
                if(curr != "" && curr != ""){
                st.push(curr);
            }
            else if(curr == ".."){
                st.pop();
            }
            curr = "";
            }  
            else {
            curr += path.charAt(i);
            }
        }
     }
}

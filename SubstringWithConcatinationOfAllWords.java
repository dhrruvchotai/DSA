import java.util.ArrayList;
import java.util.List;

//Leetcode 30
class SubstringWithConcatinationOfAllWords {
    public static void main(String[] args) {
        String s = "foobar";
        String words[] = {"foo","bar"};
        List<Integer> ans = new ArrayList<>();
        boolean visited[] = new boolean[words.length];
        findAllPermutations(s,words,visited,new ArrayList<>(),ans);
        System.out.println(ans);;
    }

    public static List<Integer> findAllPermutations(String s, String[] words, boolean[] visited, List<String> temp, List<Integer> ans){
        if(temp.size() == words.length){
            String str = "";
            for(int i = 0; i < temp.size(); i++){
                str += temp.get(i);
            }
            int idx = s.indexOf(str);
            while(idx != -1){
                if(!ans.contains(idx)) ans.add(idx);
                idx = s.indexOf(str,idx+1);
            }
        }

        for(int i = 0; i < words.length; i++){
            if(visited[i]) continue;
            visited[i] = true;
            temp.add(words[i]);
            findAllPermutations(s,words,visited,temp,ans);
            visited[i] = false;
            temp.remove(temp.size()-1);
        }

        return ans;
    }
}
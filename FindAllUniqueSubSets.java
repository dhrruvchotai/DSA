import java.util.ArrayList;
import java.util.Arrays;

public class FindAllUniqueSubSets{
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer>> ans = new ArrayList<ArrayList<Integer>>();
        int elements[] = {1,2,2};
        ans = findAllSubSetsForASet(0,elements,new ArrayList<>(), ans);
        System.out.println(ans);
    }

    public static ArrayList<ArrayList<Integer>> findAllSubSetsForASet(int startIndex, int elements[], ArrayList<Integer> tempList, ArrayList<ArrayList<Integer>> ans){
        if(!ans.contains(tempList)){
            ans.add(new ArrayList<>(tempList));
        }
        for(int i=startIndex;i<elements.length;i++){
            tempList.add(elements[i]);
            findAllSubSetsForASet(i+1, elements, tempList, ans);
            tempList.remove(tempList.size() - 1);
        }
        return ans;
    }
}
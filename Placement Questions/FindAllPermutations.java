import java.util.ArrayList;

public class FindAllPermutations {
    public static void main(String[] args) {
        int arr[] = {1,2,3};
        boolean visited[] = new boolean[arr.length];
        ArrayList<ArrayList<Integer>> ansList = new ArrayList<>();
        findAllPossiblePermutations(arr,visited,new ArrayList<>(), ansList);
        System.out.println(ansList);
    }

    public static ArrayList<ArrayList<Integer>> findAllPossiblePermutations(int arr[], boolean visited[], ArrayList<Integer> tempList, ArrayList<ArrayList<Integer>> ansList){
        if(tempList.size() == arr.length){
            ansList.add(new ArrayList<>(tempList));
        }

        for(int i = 0; i < arr.length; i++){
            if(visited[i] == true) continue;

            visited[i] = true;
            tempList.add(arr[i]);
            findAllPossiblePermutations(arr, visited, tempList, ansList);
            visited[i] = false;
            tempList.remove(tempList.size()-1);
        }

        return ansList;
    }
}

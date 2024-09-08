import java.util.ArrayList;
import java.util.Collections;

public class BucketSort {
    public static void main(String[] args) {
        float arr[] = {3.6f, 2.1f, 5.4f, 3.9f, 0.5f, 8.7f, 1.3f};

        float max = arr[0];
        float min = arr[0];

        for(int i=0;i<arr.length;i++){
            if(arr[i] > max){
                max = arr[i];
            }
            if(arr[i] < min){
                min = arr[i];
            }
        }

        bucketSort(arr,max,min);

        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }

    public static void bucketSort(float arr[],float max,float min){
        if(arr.length == 0) return;

        int bucketCount = arr.length;
        float bucketSize = (max - min) / bucketCount;
        
        ArrayList<Float>[] buckets = new ArrayList[bucketCount];

        for(int i=0;i<bucketCount;i++){
            buckets[i] = new ArrayList<>();
        }

        for(float num : arr){
            int index = (int)((num - min) / bucketSize);
            if (index == bucketCount) {  //for edge case when num == max
                index--;
            }
            buckets[index].add(num);
        }

        for(ArrayList<Float> bucket : buckets){
            Collections.sort(bucket);
        }
        
        int index = 0;
        for(ArrayList<Float> bucket : buckets){
            for(Float num : bucket){
                arr[index++] =  num;
            }
        }
    }
}

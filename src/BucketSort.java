import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class BucketSort {
    public static void main(String[] args){
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size=pk.nextInt();
        float[] arr=new float[size];
        System.out.print("Enter elements in the array : ");
        for (int i=0;i<size;i++){
            arr[i]=pk.nextFloat();
        }
        System.out.println();
        System.out.print("Array before sorting : ");
        print(arr);
        System.out.println();
        bucketSort(arr);
        System.out.print("Array after sorting : ");
        print(arr);

    }
    static void bucketSort(float[] arr){
        int n=arr.length;
        //Buckets
        ArrayList<Float>[] buckets=new ArrayList[n];
        //Create empty buckets
        for (int i=0;i<n;i++){
            buckets[i]=new ArrayList<Float>();
        }
        //Add elements into our buckets
        for (int i=0;i<n;i++){
            int bucketIndex=(int) arr[i]*n;
            buckets[bucketIndex].add(arr[i]);
        }
        //Sort each bucket individually
        for (int i=0;i<buckets.length;i++){
            Collections.sort(buckets[i]);
        }
        //Merge all buckets to get final sorted array
        int index=0;
        for (int i=0;i<buckets.length;i++){
            ArrayList<Float> currBuckt=buckets[i];
            for (int j=0;j<currBuckt.size();j++){
                arr[index++]=currBuckt.get(j);
            }
        }
    }
    static void print(float[] arr){
        for (float i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

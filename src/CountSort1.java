import java.util.Scanner;
public class CountSort1 {
    public static void main(String[] args){
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter the size of the array : ");
        int size=pk.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter elements in the array : ");
        for (int i=0;i<size;i++){
            arr[i]=pk.nextInt();
        }
        System.out.println();
        System.out.print("Array before sorting : ");
        print(arr);
        System.out.println();
        basicCountSort(arr);
        System.out.print("Array after sorting : ");
        print(arr);
    }
    static void basicCountSort(int[] arr){
        int n=arr.length;
        int max=findMax(arr);
        int[] count=new int[max+1];
        for (int i=0;i<n;i++){
            count[arr[i]]++;
        }
        int k=0;
        for (int i=0;i<count.length;i++){
            for (int j = 0; j< count[i]; j++){
                arr[k++]=i;
            }
        }
    }
    static int findMax(int[] arr){
        int max=Integer.MIN_VALUE;
        for (int i=0;i<arr.length;i++){
            if (arr[i]>max){
                max=arr[i];
            }
        }
        return max;
    }
    static void print(int[] arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

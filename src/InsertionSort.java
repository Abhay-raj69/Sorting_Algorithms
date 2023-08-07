import java.util.Scanner;
public class InsertionSort {
    public static void main(String[] args){
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter length of the array : ");
        int n=pk.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements in the array : ");
        for (int i=0;i<n;i++){
            arr[i]=pk.nextInt();
        }
        insertionSort(arr);
        System.out.println();
        System.out.print("Sorted Array : ");
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    static void insertionSort(int[] arr){
        int n=arr.length;
        for (int i=1;i<n;i++){
            int j=i;
            while (j>0 && arr[j]<arr[j-1]){
                int temp=arr[j];
                arr[j]=arr[j-1];
                arr[j-1]=temp;
                j--;
            }
        }
    }
}

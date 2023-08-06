import java.util.Scanner;
public class SelectionSort {
    public static void main(String[] args){
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter length of the array : ");
        int n=pk.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements in the array : ");
        for (int i=0;i<n;i++){
            arr[i]=pk.nextInt();
        }
        selectionSort(arr);
        System.out.println();
        System.out.print("Sorted Array : ");
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    static void selectionSort(int[] arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            int min_index=i;
            for (int j=i+1;j<n;j++){
                if (arr[j]<arr[min_index]){
                    min_index=j;
                }
            }
            int temp=arr[i];
            arr[i]=arr[min_index];
            arr[min_index]=temp;
        }
    }
}

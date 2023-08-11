import java.util.Scanner;
public class QuickSort {
    public static void main(String[] args){
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter size of the array : ");
        int size=pk.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter elements in the array : ");
        for (int i=0;i<size;i++){
            arr[i]=pk.nextInt();
        }
        System.out.println();
        System.out.print("Array before sorting : ");
        display(arr);
        System.out.println();
        quickSort(arr,0,arr.length-1);
        System.out.print("Array after sorting : ");
        display(arr);
    }
    static void quickSort(int[] arr,int start,int end){
        if (start>=end){
            return;
        }
        //Pivot Index
        int pi=partition(arr,start,end);
        quickSort(arr,start,pi-1);
        quickSort(arr,pi+1,end);
    }
    static int partition(int[] arr,int start,int end){
        int pivot=arr[start];
        int count=0;
        for (int i=start+1;i<=end;i++){
            if (arr[i]<=pivot){
                count++;
            }
        }
        int pivotIndex=start+count;
        swap(arr,start,pivotIndex);
        int i=start,j=end;
        while (i<pivotIndex && j>pivotIndex){
            while (arr[i]<=pivot) i++;
            while (arr[j]>pivot) j--;
            if (i<pivotIndex && j>pivotIndex){
                swap(arr,i,j);
                i++;
                j--;
            }
        }
        return pivotIndex;
    }
    static void display(int[] arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    static void swap(int[] arr,int x,int y){
        int temp=arr[x];
        arr[x]=arr[y];
        arr[y]=temp;
    }
}

import java.util.Scanner;
public class MergeSort {
    public static void main(String[] args){
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter length of the array : ");
        int size=pk.nextInt();
        int[] arr=new int[size];
        System.out.print("Enter elements in the array : ");
        for (int i=0;i<size;i++){
            arr[i]=pk.nextInt();
        }
        int n=arr.length;
        System.out.print("Array before Sorting : ");
        display(arr);
        mergeSort(arr,0,n-1);
        System.out.println();
        System.out.print("Array after Sorting : ");
        display(arr);


    }
    static void display(int[] arr){
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    static void mergeSort(int[] arr,int l,int r){
        if (l>=r){
            return;
        }
        int mid=(l+r)/2;
        mergeSort(arr,l,mid);
        mergeSort(arr,mid+1,r);
        merge(arr,l,mid,r);
    }
    static void merge(int[] arr,int l,int mid,int r){
        int n1=mid-l+1;
        int n2=r-mid;
        int[] left=new int[n1];
        int[] right=new int[n2];
        int i,j,k;
        for (i=0;i<n1;i++){
            left[i]=arr[l+i];
        }
        for (j=0;j<n2;j++){
            right[j]=arr[mid+1+j];
        }
        i=0;
        j=0;
        k=l;
        while (i<n1 && j<n2){
            if (left[i]<=right[j]){
                arr[k++]=left[i++];
            }
            else {
                arr[k++]=right[j++];
            }
        }
        while (i<n1){
            arr[k++]=left[i++];
        }
        while (j<n2){
            arr[k++]=right[j++];
        }
    }
}

import java.util.Scanner;
public class BubbleSort {
    public static void main(String[] args) {
        Scanner pk=new Scanner(System.in);
        System.out.print("Enter length of the array : ");
        int n=pk.nextInt();
        int[] arr=new int[n];
        System.out.print("Enter elements in the array : ");
        for (int i=0;i<n;i++){
            arr[i]=pk.nextInt();
        }
        bubbleSort(arr);
        for (int i:arr){
            System.out.print(i+" ");
        }
    }
    static void bubbleSort(int[] arr){
        int n=arr.length;
        for (int i=0;i<n-1;i++){
            boolean flag=false;
            for (int j=0;j<n-i-1;j++){
                if (arr[j]>arr[j+1]){
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                    flag=true;
                }
            }
            if (!flag) {
                return;
            }
        }
    }
}

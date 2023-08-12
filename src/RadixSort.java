import java.util.Scanner;

public class RadixSort {
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
        print(arr);
        radixSort(arr);
        System.out.println();
        System.out.print("Array after sorting : ");
        print(arr);
    }
    static void radixSort(int[] arr){
        int max=findMax(arr);
        //apply counting sort to sort elements based on place value
        for (int place=1;max/place>0;place*=10){
            countSort(arr,place);
        }
    }
    static void countSort(int[] arr,int place){
        int n=arr.length;
        int[] output=new int[n];
        int[] count=new int[10];
        //making a frequency array
        for (int i=0;i<arr.length;i++){
            count[(arr[i]/place)%10]++;
        }
        //make prefix sum arr of count array
        for (int i=1;i<count.length;i++){
            count[i]+=count[i-1];
        }
        for (int i=n-1;i>=0;i--){
            int idx=count[(arr[i]/place)%10]-1;
            output[idx]=arr[i];
            count[(arr[i]/place)%10]--;
        }
        //copy of all elements of output array to arr array
        for (int i=0;i<arr.length;i++){
            arr[i]=output[i];
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
        for (int i: arr){
            System.out.print(i+" ");
        }
        System.out.println();
    }
}

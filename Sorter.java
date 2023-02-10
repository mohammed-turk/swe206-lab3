import java.util.Arrays;

public class Sorter{
        public static void SelactionSort(int[] list){
        for (int i=0;i<list.length-1;i++){
            int curreentMin=list[i];
            int currentMinIndex= i;
            for(int j=i+1;j<list.length;j++){
                if (curreentMin>list[j]) {
                    curreentMin = list[j];
                    currentMinIndex=j;
                }
            }
            if(curreentMin!= i){
                list[currentMinIndex]=list[i];
                list[i]=curreentMin;
            }
        }

    }
     public static int[] sort(int[] list){
        SelactionSort(list);
        return list;
    } 

    public static void main(String[] args) {
        int[] x= {1,2,7,5};
        SelactionSort(x);
        System.out.println(Arrays.toString(sort(x)));


        int arr[] = { 12, 11, 13, 5, 6 };
        InsertionSort ob = new InsertionSort();
        ob.insertionsort(arr);
        ob.sort(arr);
    }
}



 class InsertionSort {
    /*Function to sort array using insertion sort*/
    void insertionsort(int arr[])
    {
        int n = arr.length;
        for (int i = 1; i < n; ++i) {
            int key = arr[i];
            int j = i - 1;
 

            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }

     void sort(int arr[])
    {
        int n = arr.length;
        for (int i = 0; i < n; ++i)
            System.out.print(arr[i] + " ");
 
        System.out.println();
    }

}
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

    public static void main(String[] args) {
        int[] x= {1,2,7,5};
        SelactionSort(x);
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
 
            /* Move elements of arr[0..i-1], that are
               greater than key, to one position ahead
               of their current position */
            while (j >= 0 && arr[j] > key) {
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = key;
        }
    }
}
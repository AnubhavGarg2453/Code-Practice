package Random_Practice;

public class Sorting {

    public void Sorting(){

    }

    private int [] arr;

    public void setArray(int [] arr){
        this.arr = arr;
    }
    public void bubbleSort(){

        for(int i = 0; i < arr.length; i++){

            for(int j = 0; j < arr.length - i - 1; j++){
                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
    }

    public void selectionSort(){
        for(int i = 0; i < arr.length; i++){
            int minIndexElement = i;
            for(int j = i + 1; j < arr.length; j++){
                if(arr[j] < arr[minIndexElement]){
                    minIndexElement = j;
                }
            }
            if(minIndexElement != i) {
                int temp = arr[minIndexElement];
                arr[minIndexElement] = arr[i];
                arr[i] = temp;
            }
        }
    }

    public void insertionSort(){
        for(int i = 1; i < arr.length; i++){
            int key = arr[i];
            int j = i - 1;
            while(arr[j] > key && j > 0){
                arr[j + 1] = arr[j];
                j --;
            }
            arr[j] = key;
        }
    }

    public void mergeSort(int low, int high){
        int mid;
        if(low < high){
            mid = low + (high - low) / 2;
            mergeSort(low, mid);
            mergeSort(mid + 1, high);
            merge(low, mid, high);
        }
    }

    private void merge(int low, int mid, int high){
        int [] a = new int[high + 1];
        int i = low;
        int j = mid+1;
        int k = low;

        while(i <= mid && j <= high){
            if(arr[i] < arr[j]){
                a[k] = arr[i];
                k++;
                i++;
            }
            else{
                a[k] = arr[j];
                k++;
                j++;
            }
        }

        while(i <= mid){
            a[k] = arr[i];
            k++;
            i++;
        }

        while(j <= high){
            a[k] = arr[j];
            k++;
            j++;
        }

        for(int w = low; w <=high; w++){
            arr[w] = a[w];
        }

    }


    public void display(){
        for(int i = 0; i < arr.length; i++){
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }

    
}

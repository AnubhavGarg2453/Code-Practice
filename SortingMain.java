package Random_Practice;

public class SortingMain {
    
    public static int random(){
        int ran = (int) (Math.random() * (100 - 0 + 1)) + 1;
        return ran;
    }

    public static void main(String[] args) {
        Sorting s = new Sorting();
        
        int [] arr = new int [10];
        for(int i = 0; i < arr.length; i++){
            arr[i] = random();
        }

        s.setArray(arr);
        System.out.println("Before Sorting...");
        s.display();
//        s.bubbleSort();
//        s.selectionSort();
//        s.insertionSort();
        s.mergeSort(0,arr.length - 1);
        System.out.println("After Sorting...");
        s.display();
    }
}

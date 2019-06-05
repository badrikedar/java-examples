class QuickSort {

  private int partition(int arr[], int begin, int end) {
    int pivot = arr[end];
    int i = (begin-1);
 
    for (int j = begin; j < end; j++) {
        if (arr[j] <= pivot) {
            i++;
 
            int swapTemp = arr[i];
            arr[i] = arr[j];
            arr[j] = swapTemp;
        }
    }
 
    int swapTemp = arr[i+1];
    arr[i+1] = arr[end];
    arr[end] = swapTemp;
 
    return i+1;
  }



   public void quickSort(int arr[], int begin, int end) {
    if (begin < end) {
        int partitionIndex = partition(arr, begin, end);
 
        quickSort(arr, begin, partitionIndex-1);
        quickSort(arr, partitionIndex+1, end);
    }
  }

 
  public static void main(String [] args){

  int a,  b, c, t;
  a = 2;
  b = 3;
  c = 9;

  int n = 10; 
  int i, x[] ;
  x = new int[n];

  t = 2;
  for (i = 0; i < n ; i++) {
    t =  (a * t + b ) % c ; 
    System.out.printf("%d\n",t);
  } 


 }




}

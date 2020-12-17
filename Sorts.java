public class Sorts{
  public static void bubbleSort(int[] data){
      for(int i = data.length-1; i >= 0; i--){
        for(int j = 0; j < i; j++){
          if(data[j] > data[j+1]){
            int temp = data[j+1];
            data[j+1] = data[j];
            data[j] = temp;
          }
        }
      }
    }

  public static void selectionSort(int[] data){
    for(int i = 0; i < data.length; i++){
      int small = data[i];
      int temp = small;
      for(int j = i; j < data.length-1; j++){
        if(small > data[j+1]){
          small = data[j+1];
          data[j+1] = temp;
        }
      }
      data[i] = small;
    }
  }

  public static void insertionSort(int[] data){
    
  }

}

public class Sorts{
  public static void bubbleSort(int[] data){
      for(int i = 0; i < data.length-1; i++){
        for(int j = 0; j < data.length-i-1; j++){
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
      int ti = i;
      for(int j = i+1; j < data.length; j++){
        if(data[ti] > data[j]){
          ti = j;
        }
      }
      int temp = data[ti];
      data[ti] = data[i];
      data[i] = temp;
    }
  }

  public static void insertionSort(int[] data){
    for(int i = 1; i < data.length; i++){
      int temp = data[i];
      int j = i - 1;
      while ((j >= 0) && (temp < data[j])){
        data[j+1] = data[j];
        j = j - 1;
      }
      data[j + 1] = temp;
    }
  }

}

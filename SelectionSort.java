public class SelectionSort{
  public static void main(String[] args){
    int[] numbers = {4,5,9,1,3,8,2};


    for(int i = 0; i < 6; i++){
      int indexMin = i;

      for(int k = i + 1; k < 7; k++){
        if(numbers[k] < numbers[indexMin]){
          indexMin = k;
        }
      }

      int temporaryNum = numbers[i];
      numbers[i] = numbers[indexMin];
      numbers[indexMin] = temporaryNum;
    }

    for(int m = 0; m < 7; m++){
      System.out.println(numbers[m]);
    }
  }
}

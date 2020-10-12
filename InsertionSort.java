public class InsertionSort{
  public static void main(String[] args){
    int[] numbers = {3,6,5,1,4,2};

    for(int i = 1; i < 6; i++){
      int temporaryNum = numbers[i];
      int k = i;
      while(k > 0 && numbers[k-1] > temporaryNum){
        numbers[k] = numbers[k-1];
        k--;
      }
      numbers[k] = temporaryNum;
    }

    for(int j = 0; j < 6; j++){
      System.out.println(numbers[j]);
    }
  }
}

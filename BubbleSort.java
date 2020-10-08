public class BubbleSort{
  public static void main(String[] args){
    int[] numbers = {3,6,5,1,4,2};

    for(int j = 0; j < 5;  j++){
      for(int i = 5; i > j; i--){
        if(numbers[i-1] > numbers[i]){

        //格納された数を入れ替える作業
        int tenporaryNum = numbers[i-1];
        numbers[i-1] = numbers[i];
        numbers[i] = tenporaryNum;
      }
    }
  }

  for(int k = 0; k < 6; k++){
      System.out.println(numbers[k]);
    }
  }
}

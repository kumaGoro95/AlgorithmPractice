public class QuickSort{
  public static void main(String[] args){
    int[] numbers = {7,9,5,11,1,4,6,3,2,0,10,8}; //12
    int i;
    int k;
    int left = 0;
    int right = 11;
    i = left+1;
    k = right-1;

    SortExecute(numbers,i,k, left, right);
    System.out.println(i);

  for(int j = 0; j < 12; j++){
    System.out.println(numbers[j]);
  }
}

  public static int[] SortExecute(int numbers[], int i, int k, int left, int right){
    int temporaryNum;
    while(i < k){
      while(numbers[i] < numbers[left] && i < right){
        i++;
      }
      while(numbers[k] >= numbers[left] && k > left){
        k--;
      }
      if(i < k){
        temporaryNum = numbers[i];
        numbers[i] = numbers[k];
        numbers[k] = temporaryNum;
      }
    }
    temporaryNum = numbers[left];
    numbers[left] = numbers[k];
    numbers[k] = temporaryNum;

    return numbers;
  }
}

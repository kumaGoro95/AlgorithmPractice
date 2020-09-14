public class HashSearch{
  public static void main(String [] args){
    int[] numbers = {11,9,45,7,32,45,26};
    int[] storeArr = new int[13];
    store(numbers, storeArr);
    for(int i = 0; i < 13; i++){
    System.out.println(storeArr[i]);
  }
}


  public static int[] store(int[] numbers, int[] storeArr){
    for(int i = 0; i < 7; i++){
      int k = numbers[i] % 13;
      System.out.println("*"+i);
      System.out.println(k);
      while(storeArr[k] != 0){
        k = (k+1) % 13;
        System.out.println(k);
      }
        storeArr[k] = numbers[i];
    }
    return storeArr;
  }
}

import java.util.Scanner;

public class HashSearch{
  public static void main(String [] args){
    int[] numbers = {11,9,45,7,32,45,26};
    int[] storedArr = store(numbers);
    search(storedArr);
    System.out.println("stored numbers are below.");
    for(int i = 0; i < 13; i++){
    System.out.println(storedArr[i]);
    }
}


  public static int[] store(int[] numbers){
    int[] emptyArr = new int[13];
    for(int i = 0; i < 7; i++){
      int k = numbers[i] % 13;
      while(emptyArr[k] != 0){
        k = (k+1) % 13;
      }
        emptyArr[k] = numbers[i];
    }
    return emptyArr;
  }

  public static void search(int[] storedArr){
    System.out.println("Please input a number that you want to search.");
    Scanner scan = new Scanner(System.in);
    int number = scan.nextInt();
    int k = number % 13;
    while(storedArr[k] != 0){
      if(storedArr[k] == number){
        System.out.println("The "+number+"'s index key: "+k);
        break;
      }else{
        k = (k+1) % 13;
      }
    }
    if(storedArr[k] == 0){
      System.out.println(number+" is not in this data.");
    }
  }
}

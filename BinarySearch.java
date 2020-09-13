public class BinarySearch{
  public static void main(String [] args){
    int[] numbers = {6,7,13,15,17,22,25,32,35,37,40,43,45,48};
    int targetnum = 25;
    int tail = 13;
    int head = 0;
    execute(numbers, targetnum, tail, head);
  }

  public static void execute(int[] numbers, int targetnum, int tail, int head){
    int result = -1;
    while(head <= tail){
      int center = (head + tail) /2;
      if (numbers[center] == targetnum){
        System.out.println("index number is "+center);
        result = 0;
        break;
      }else if(numbers[center] < targetnum){
        head = center+1;
      }else{
        tail = center-1;
      }
    }
    if(result == -1){
      System.out.println("Not found");
    }
  }
}

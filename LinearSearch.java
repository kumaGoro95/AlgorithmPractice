public class LinearSearch{
  public static void main(String [] args){
    int[] numbers = {4,5,9,1,3,8,7,2,6};
    int targetnum = 6;
    int result = searchExecute(numbers, targetnum);

    if(result != -1){
      System.out.println(targetnum +"'s index key ="+result);
    }else{
      System.out.println("Not found");
    }
  }

  public static int searchExecute(int[] numbers, int targetnum){
    int result = 0;
    int nonumber = -1;
    for(int i = 0; i < numbers.length; i++){
      if(numbers[i] == targetnum){
        result = i;
        return result;  //ヒットすればindexkeyを返す
      }
    }
    return nonumber;  //ヒットしなければ-1を返す
  }
}

//values are required
public class Main{

  public static void main(String[] args){
    for(int i=0;i<n;i++){
      for(int j=i;j<n;j++){
        if(array[i]>array[j]){
          int temp = array[i];
          array[i] = array[j];
          array[j] = temp;
        }
      }
    }
  }
}

import java.util.Scanner;

/**
 * Created by iyasuwatts on 10/17/17.
 */
public class MathWizard {
    
  
    public static void main(String[] args){
    Scanner userNum = new Scanner(System.in);
    int number;
    do{
        System.out.print("Please enter a number: ");
        number = userNum.nextInt();
        int sum = 0;
        if(number != 0){
        for(int i = 1; i <= number; i++){
            sum += i;
            }
           System.out.println(sum);
           sum = 0;
      }
    }while(number != 0);
        
  }
}

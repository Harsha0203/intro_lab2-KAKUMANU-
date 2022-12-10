import java.util.Scanner;

public class LabProgram {
   
   public static int fibonacci(int n) {
      if (n==1 && n==0) {
		return n;
	}
	if (n<0) {
		return -1;
	}
	else if(n==0)
	{
	   return 0;
	}
 
    int previousNum = 0, currentNum = 1;
    for (int i = 0; i < n - 1; i++)
    {
        int newFib = previousNum + currentNum;
        previousNum = currentNum;
        currentNum = newFib;
    }
 
    return currentNum;       
   }
   
   public static void main(String[] args) {
      Scanner scnr = new Scanner(System.in);
      int startNum;
      
      startNum = scnr.nextInt();
      System.out.println("fibonacci(" + startNum + ") is " + fibonacci(startNum));
   }
}

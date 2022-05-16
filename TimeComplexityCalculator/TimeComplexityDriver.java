import java.util.Scanner;

class TimeComplexityDriver { //TimeComplexityDriver Class

  public static void main(String[] args) 
  {
   Scanner S = new Scanner(System.in);
    System.out.println("Enter an Integer: ");

    String str = S.nextLine();
    int N = Integer.parseInt(str);
    
    TimeComplexity Time = new TimeComplexity();
    int ConstN = Time.constantTime(N);
    double LogN = TimeComplexity.logTime(N);
    int LinearN = TimeComplexity.linearTime(N);
    double NLogN = TimeComplexity.linearLogTime(N);
    double QuadN = TimeComplexity.quadraticTime(N);
    double CubeN = TimeComplexity.cubicTime(N);
    double ExpN = TimeComplexity.exponentialTime(N);
    int FactorialN = TimeComplexity.factorialTime(N);
    double NtoN = TimeComplexity.nToTheNthTime(N); 
    
    System.out.println("This result is using the Constant Time Complexity: " + ConstN + ".");
    System.out.println("This result is using the Log Time Complexity: " + LogN + ".");
    System.out.println("This result is using the Linear Time Complexity: " + LinearN + ".");
    System.out.println("This result is using the Linear Log Time Complexity: " + NLogN + ".");
    System.out.println("This result is using the Quadratic Time Complexity: " + QuadN + ".");
    System.out.println("This result is using the Cubic Time Complexity: " + CubeN + ".");
    System.out.println("This result is using the Exponential Time Complexity: " + ExpN + ".");
    System.out.println("This result is using the Factorial Time Complexity: " + FactorialN + ".");
    System.out.println("This result is using the N to the Nth Time Complexity: " + NtoN + ".");
  }
}
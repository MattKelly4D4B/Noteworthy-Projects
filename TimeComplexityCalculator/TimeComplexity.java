public class TimeComplexity //TimeComplexity Class
{
  
   public static int constantTime(int N)
   {
     int constN = N;
     return constN;
   }
  
   public static double logTime(int N)
   {
       double LogN = Math.log(N);
       return LogN;     
   }
   
   public static int linearTime(int N)
   {
      int LinearN = 2 * N + 3;
      return LinearN;
   }
   
   public static double linearLogTime(int N)  
   {
      double NLogN = Math.log(N) * N ;
      return NLogN;
   }
   
      public static double quadraticTime(int N)
   {
      double QuadN = Math.pow(N, 2);
      return QuadN;
   }
   
      public static double cubicTime(int N)  
   {
      double CubeN = Math.pow(N, 3);
      return CubeN;
   }
   
      public static double exponentialTime(int N)
   {
      double ExpN = Math.pow(2, N);
      return ExpN;
   }
   
         public static int factorialTime(int N) 
   {
      int FactorialN = 0;
      for(int i = N; i > 0; i--)
      {
         FactorialN = FactorialN + i;
      }
      
      return FactorialN;
   }
   
         public static double nToTheNthTime(int N) 
   {
      double NtoN = Math.pow(N, N);
      return NtoN;
   }
}


class demo
{
   public static void main(String[] args)
   {
      int number;
      int sum = 0;
      
      number = 10;
      if(number < 5)
      System.out.println("Number is too small");
      else
      System.out.println("Number is just right");
      
      for (int i = 0; i < number; i++)
      {
         sum = sum + i;
      } //end for
      System.out.println("Sum = "+ sum);

   }
}
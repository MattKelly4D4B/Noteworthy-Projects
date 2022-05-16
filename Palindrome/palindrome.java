import javax.swing.JOptionPane;
import java.util.Scanner;

public class palindrome
{
  public static void main(String[] args)
  {
      String Input = JOptionPane.showInputDialog("Enter a word to find out if it is a palindrome: ");
      String TxtString = "";
      int Length = Input.length() - 1;
      
      
      for (int i = 0; i <= Length/2 ; i++)
      {
         if (Input.charAt(i) != Input.charAt(Length - i))
         {
            TxtString = "The word is not a palindrome";
            break;
         }
         else
         {
            TxtString = "The word is a palindrome";
         }
      }
      
      System.out.println(TxtString);
     
  }//END MAIN
}//END CLASS   
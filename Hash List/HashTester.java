import java.util.Scanner;

class HashTester
{

// -----------------------
public static void main(String[] args)
{
Scanner keyboard = new Scanner(System.in);
int nbrOfLocations = 10;
HashList list = new HashList(nbrOfLocations);
String phrase;
String result;

do
   {
   System.out.println();
   System.out.print("Enter a phrase: ");
   phrase = keyboard.nextLine();
   if (phrase.equals("QUIT"))
      break;
   result = list.put(phrase);
   System.out.println(result);
   } // End while
while (true);

System.out.println();

System.out.println("END OF PROGRAM");
} // End main


} // End class

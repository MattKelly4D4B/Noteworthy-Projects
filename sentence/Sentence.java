import java.util.Random;
import java.util.Scanner;

class Sentence
{
   private final int MAX_SIZE = 7;

   // private String subjectMarker;    I didn't understand how these 
   // private String adjective;         were supposed to be used...
   // private String subject;
   // private String adverb;
   // private String verb;
   // private String directObjectMarker;
   // private String directObject;
   
   private String[] sentenceTable;
   
   private Random rand = new Random();
   
   //---------------------------------------------------------
   public Sentence(String phrase)
   {
   sentenceTable = new String[MAX_SIZE];
   
   parse(phrase);
   } //End Constructor
   
//---------------------------------------------------------
public void parse(String phrase)
{
   int prevSpaceIndex = 0;
   int spaceIndex = 0;
   int tableIndex = 0;
   String oneWord = "";
   char currentChar;

   for (int i=spaceIndex; i < phrase.length(); i ++)
   {
      if (phrase.charAt(i) == ' ')
      {
         spaceIndex = i;
         for (int j = prevSpaceIndex; j < spaceIndex; j ++)
         {
         
         currentChar = phrase.charAt(j);
         oneWord = oneWord + Character.toString(currentChar);
         
         }//end for
                  
         sentenceTable[tableIndex] = oneWord;
         oneWord = "";
         prevSpaceIndex = spaceIndex+1;
         tableIndex++;
      }//end if
      
   }//end for
   
   oneWord = "";
   
   for (int j = spaceIndex+1 ; j < phrase.length(); j ++)
   {
      currentChar = phrase.charAt(j);
      oneWord = oneWord + Character.toString(currentChar);       
   }//end for
   
   sentenceTable[MAX_SIZE-1] = oneWord;

} //End Method

//-------------------------------------------------------
public String makeString()
{
   String phrase = ""; 
   for(int i=0;i < sentenceTable.length; i++)
   {
      phrase = phrase + sentenceTable[i] + " ";
   }//end for

   return phrase;
   
}// End Method

//-----------------------------------------------------
public void shuffle()
{
   String temp = "";

   for(int i = 0; i < MAX_SIZE; i++)
   {
      int j = rand.nextInt(MAX_SIZE);
      temp = sentenceTable[i];
      sentenceTable[i] = sentenceTable[j];
      sentenceTable[j] = temp;
   }//end for

} //End Method


}//end class

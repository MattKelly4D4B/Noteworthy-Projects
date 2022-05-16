class HashList
{
private String[] list;
private int listSize;

// -------------------------------
HashList(int listSize)
{
list = new String[listSize];
this.listSize = listSize;
for (int i = 0; i < listSize; i++)
   list[i] = null; 
} // End constructor

// *** MAKE NO CHANGES ABOVE THIS LINE ***

// --------------------------------
public String put(String phrase)
{
   int hashIndex = hashPhrase(phrase);

   if(list[hashIndex] == null)
   {
      list[hashIndex] = phrase;
      return "[" + phrase + "] has been stored in the list";
   }
   
   else
   {
      return "That list location already contains [" + list[hashIndex] + "]";
   }




} // End put


// ----------------------------
private int hashPhrase(String phrase)
{
int Sum = 0;

for (int i = 0; i < phrase.length(); i++)
{
   Sum = Sum + phrase.charAt(i);
}

return Sum % listSize;
} // End hashPhrase

} // End class

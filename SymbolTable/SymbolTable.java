import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

class SymbolTable
{
   
   public static void main(String[] args) throws FileNotFoundException
   {
      
      File code = new File("demo.java");
      Scanner input = new Scanner(code);
      ArrayList<String> outputList = new ArrayList<String>();
      ArrayList<String> sortedOutputList = new ArrayList<String>();

      ArrayList<Integer> lineNumberList = new ArrayList<Integer>();

      
      String reserved[] = {"abstract","assert","boolean","break","byte", //reserved words in java
      "case","catch","char","class","const","continue","default","double",
      "do","else","enum","extends","false","final","finally","float","for",
      "goto","if","implements","import","instanceof","int","interface","long",
      "native","new","null","package","private","protected","public","return",
      "short","static","strictfp", "string","super","switch","synchronized","this",
      "throw","throws","transient","true","try","void","volatile","while"};  
      
      String symbols[] = {"=","<",">","<=",">=","!=","+","-","/","*","&","[","]","(",")","{",
      "}","++","--"};


      String currentWord = "";
      String currentLine = "";

      int lineNumber = 0;
      
      boolean reserveMatch = false;
      boolean numberMatch = false;
      boolean symbolMatch = false;
      boolean deleteWords = false;
      
      while (input.hasNextLine())
      {
         lineNumber++;
         currentLine = input.nextLine();
         currentLine = currentLine.trim();
         String[] words = currentLine.split("[' ' ();]+");
        
        
        
         //System.out.println(currentLine);              
         
         for (int i=0; i < words.length; i++) 
         {
         
           if (words[i].length() > 0) //***************** Comments
           {
               if (words[i].startsWith("//"))
               {
                  break;
               }
           }
             if(words[i].equals(""))       //************ Blank Lines
             {
                continue;     
             }
           //System.out.println(words[i]);     
           // outputList.add(words[i]);
         
            if(deleteWords == true) //***********************Quoted Strings
            {
             if (words[i].length() > 0)
             {
               if (words[i].charAt(words[i].length()-1)=='\"')
               {
                  deleteWords = false;
               }
             
             continue;
             }
           }  
            
            if (words[i].length() > 0)
             {
               if (words[i].charAt(0) == '\"')
               {
                  deleteWords = true;
                  continue;
               }
               
             }
               
            for (int j = 0; j < reserved.length; j++)//****************Catch reserved words
            {
               reserveMatch = false;
               numberMatch = false;
               if (words[i].equals(reserved[j]))
               {
                  reserveMatch = true;
                  //System.out.println("MATCH!");
                  break;
               }//end if
            }//end for 
            
            try //***********************************************************Catch Numbers 
            {
              Integer.parseInt(words[i]);
              numberMatch = true;

            } 
            catch(Exception e)
           {
               
           }            
            
            for (int k = 0; k < symbols.length; k++)//***********************Catch symbols
            {
               symbolMatch = false;
               if (words[i].equals(symbols[k]))
               {
                  symbolMatch = true;
                  //System.out.println("MATCH!");
                  break;
               }//end if
            }//end for 
            
            

            if(reserveMatch == false && numberMatch == false && symbolMatch == false)
            {
               if (!outputList.contains(words[i]))
               {
                  outputList.add(words[i]);
                  lineNumberList.add(lineNumber);
               }               
                           
            }

         }//end for

                     
      }//end while
            
            
         System.out.println("List of each identifier (unsorted): " + outputList);
         Collections.sort(outputList, String.CASE_INSENSITIVE_ORDER);
         System.out.println("Line number of first occurance (unsorted): " + lineNumberList); //I couldn't figure out how to get the line numbers to work. So i left it as this.
         System.out.println("Sorted list of each identifier: " + outputList);
         
         
//////////////Attempts to get the line numbers working///////////////////////////////////////////////////////////////////
//         
//          int count=0;
//                         
//           for(int y = 0; y < outputList.size(); y++)
//           {
// //             String listWord;
// //             String testWord;
//              Scanner input2 = new Scanner(code);
//              
// // 
// //             listWord = outputList.get(y);
// // 
//              while (input2.hasNextLine())
//              {
// //                lineNumber++;
// // 
//              currentLine = input2.nextLine();
//              currentLine = currentLine.trim();
//              String[] words = currentLine.split("[' ' ();]+");
// 
//              count++;
//              
// //                
//                 String outputLine = "";
//                 
//                 for (int x = 0; x < words.length; x++)
//                 {
//                   
//                    if (outputList.get(y).equals(words[x]))
//                    {
//                        outputLine = count + ", ";
//                    }
//                    
//                  
//                   System.out.println(outputLine);
//                 }  
//              
//              }
//                            input2.close();
// 
//          
//          }        
                        
        }
        }
         

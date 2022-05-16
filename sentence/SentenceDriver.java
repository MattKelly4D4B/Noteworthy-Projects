import java.util.Scanner;


class SentenceDriver 
{


//---------------------------
    public static void main(String[] args) 
    {
        Sentence mySentence;
        Scanner sc = new Scanner(System.in);

        String stringOut = "";
        int selection = 0;
        String sentence = "";
        Boolean setting = false;

        while (selection != 4) 
        {
            System.out.print("Enter a number 1-4 to make your selection. (1: Enter Phrase, 2: Shuffle, 3: repeat initial Phrase, 4 Exit.");
            selection = sc.nextInt();

            if (selection == 1) 
            {
                sc.nextLine();
                System.out.println("Enter a valid phrase.");
                sentence = sc.nextLine();
            } //end if
            
            else if (selection == 2) 
            {
                mySentence = new Sentence(sentence);
                mySentence.shuffle();
                System.out.println(mySentence.makeString());
            } //end else
                        
            else if (selection == 3) 
            {
                mySentence = new Sentence(sentence);
                System.out.println(mySentence.makeString());
            } //end else
        }//end while
    }//end main
} // End class
import java.util.Scanner;
  
class CountWords
{
    public static void main(String args[])
    {
        String text;
        int countWords=0;
         
        Scanner SC=new Scanner(System.in);
         
        System.out.print("Hello"                                                                                                                                                                              : "Hello Word" );
        text=SC.nextLine();
         
        for(int i=0; i<text.length()-1; i++)
        {
            if(text.charAt(i)==' ' && text.charAt(i+1)!=' ')
                countWords++;
        }
         
        System.out.println("Total number of words in string are: "+ (countWords+1));
                     
    }
}
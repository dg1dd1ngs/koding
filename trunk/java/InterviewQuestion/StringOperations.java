//ReverseAString - takes a given string and reverses the characters of that string..
// "abcd efg" -> "gfe dcba"

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class StringOperations
{
  static int lastMenuNumber = 0;
  BufferedReader myInputReader = new BufferedReader( new InputStreamReader( System.in ));
 
  public void SimpleStringReversal()
  {
    String givenString = null;
    try{
         System.out.println("Please enter the string to be reversed ");
         givenString = new String( myInputReader.readLine());
       }catch( Exception e ){ e.printStackTrace();  }
  
    int stringLength = givenString.length();
    char givenStringChars[] = new char[stringLength];
    
    for(int i = 0; i< stringLength; i++)
    {
      givenStringChars[i] = givenString.charAt(i);
    }

    // form a temporary string to hold the new chars in reverse order
    char tempCharString[] = new char[stringLength];
    for(int j = 0; j<stringLength ; j++)
    {
      tempCharString[j] = givenStringChars[stringLength-1-j];
    }

    System.out.println("Reversed String = " + new String (tempCharString) + "\n\n" );

  }//end StringReversal constructor()


  public void showMenu()
  {
    String myMenu = new String(" Supported Operations\n"
                             + " 1. String Reversal\n"
                             + " 2. Quit\n"
                              );
    lastMenuNumber = 2;
    System.out.println(myMenu);

  }//end showMenu()

  public boolean performOperation(int operationNumber )
  {
     System.out.println( "Operation Number : " +operationNumber );
     switch( operationNumber )
     {
          case 1: //String Reversal
                  this.SimpleStringReversal();
                  break;

          case 2: break;

          default: System.out.println(" Please enter correct option" ); break;



    
     }

     if( ( operationNumber == lastMenuNumber ) || ( operationNumber > lastMenuNumber ))
     {
       System.out.println("Exiting");
       return false;
     }

   return true;

  }//end performOperation

  public static void main( String args[] )
  {
   
    StringOperations stringObject = new StringOperations();    
    BufferedReader myInputReader = new BufferedReader( new InputStreamReader ( System.in ));

    int userOption = 0;
    boolean serviceRequested = true ;
    
    try {
          while( serviceRequested )
          {
            stringObject.showMenu();
            System.out.println("Please enter operation number from the menu ");
            userOption = Integer.parseInt(myInputReader.readLine());
            serviceRequested = stringObject.performOperation( userOption );
           }//end while
        }catch( Exception e ){ e.printStackTrace(); }
  
  }//emd main

}//end class

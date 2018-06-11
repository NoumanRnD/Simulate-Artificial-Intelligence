package artificialintelligenceanimal;
import artificialintelligenceanimal.colorado.nodes.BinaryTreeNode;
import java.util.Scanner;
 
public class MAIN
{
  private static Scanner stdin = new Scanner(System.in);   
         final static String ROOT_QUESTION = "Does it have legs?";   
      final static  String LEFT_QUESTION = "Is it a cat?";   
      final  static String RIGHT_QUESTION = "Is it a snake?";   
      final  static String ANIMAL1 = "Cat";   
      final  static String ANIMAL2 = "snake";   
      final  static String ANIMAL3 = "snake";   
      final static  String ANIMAL4 = "EARTHWORM";   
      
   public static void main(String[ ] args)   
   {   
      BinaryTreeNode<String> root;   
   
      training_Instruction( );   
      root = beginning( );   
      do   
         LearningStart.play(root);   
      while (SysStatement("Continue?"));   
   
   }   
    public static boolean SysStatement(String prompt)   
   {   
      String answer;   
       
      System.out.print(prompt + " [Y or N]: ");   
      answer = stdin.nextLine( ).toUpperCase( );   
      while (!answer.startsWith("Y") && !answer.startsWith("N"))   
      {   
     System.out.print("Invalid response. Please type Y or N: ");   
     answer = stdin.nextLine( ).toUpperCase( );   
      }   
   
      return answer.startsWith("Y");   
   }   
   
      
      
   public static void training_Instruction( )   
   {   
      System.out.println("Think of an animal and I will guess it.");    
       
   }   
      
   
      
 
    
   public static BinaryTreeNode<String> beginning( )      
   {   
      BinaryTreeNode<String> root;   
      BinaryTreeNode<String> child;   
   
     
       
      root = new BinaryTreeNode<String>(ROOT_QUESTION, null, null);   
   
         
      child = new BinaryTreeNode<String>(LEFT_QUESTION, null, null);   
      child.setLeft(new BinaryTreeNode<String>(ANIMAL1, null, null));   
      child.setRight(new BinaryTreeNode<String>(ANIMAL2, null, null));   
      root.setLeft(child);   
   
         
      child = new BinaryTreeNode<String>(RIGHT_QUESTION, null, null);   
      child.setLeft(new BinaryTreeNode<String>(ANIMAL3, null, null));   
      child.setRight(new BinaryTreeNode<String>(ANIMAL4, null, null));   
      root.setRight(child);   
   
      return root;   
   }   
    
    
      
   public static void learn(BinaryTreeNode<String> current)   
     
   {   
      String guessAnimal;      
      String correctAnimal;    
      String newQuestion;            
         
      guessAnimal = current.getData( );   
      System.out.println("I give up. What is the name of animal? ");   
      correctAnimal = stdin.nextLine( );   
      System.out.println("Please type a yes/no question that will distinguish a");   
      System.out.println(correctAnimal + " from a " + guessAnimal + ".");   
      newQuestion = stdin.nextLine( );   
         
      current.setData(newQuestion);   
      System.out.println("As a " + correctAnimal + ", " + newQuestion);   
      if (SysStatement("Please answer"))   
      {   
         current.setLeft(new BinaryTreeNode<String>(correctAnimal, null, null));   
         current.setRight(new BinaryTreeNode<String>(guessAnimal, null, null));   
      }   
      else   
      {   
         current.setLeft(new BinaryTreeNode<String>(guessAnimal, null, null));   
         current.setRight(new BinaryTreeNode<String>(correctAnimal, null, null));   
      }   
      
     System.out.println("\n");   
           
   }   
}





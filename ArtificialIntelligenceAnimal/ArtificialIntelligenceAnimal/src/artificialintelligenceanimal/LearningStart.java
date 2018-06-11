/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package artificialintelligenceanimal;

import static artificialintelligenceanimal.MAIN.learn;
import static artificialintelligenceanimal.MAIN.SysStatement;

/**
 *
 * @author linux
 */
public   class LearningStart {
       
      public static void play(artificialintelligenceanimal.colorado.nodes.BinaryTreeNode<String> current)   
   {   
      while (!current.isLeaf( ))   
      {   
         if (SysStatement(current.getData( )))   
            current = current.getLeft( );   
         else   
            current = current.getRight( );   
      }   
   
      System.out.print("My guess is " + current.getData( ) + ". ");   
      if (!SysStatement("Am I right [continue]?"))   
         learn(current);   
      else   
      {   
         
         System.out.println("I win!?");   
         
      }   
   }   
      
   
}

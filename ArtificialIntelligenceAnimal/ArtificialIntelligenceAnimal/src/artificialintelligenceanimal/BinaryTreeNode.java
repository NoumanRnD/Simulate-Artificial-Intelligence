 

package artificialintelligenceanimal.colorado.nodes;


public class BinaryTreeNode<E>
{

   private E data;
   private BinaryTreeNode<E> left, right;   

   
   public BinaryTreeNode(E initialData, BinaryTreeNode<E> initialLeft, BinaryTreeNode<E> initialRight)
   {
      data = initialData;
      left = initialLeft;
      right = initialRight;
   }       
   
   
 
   public E getData( )   
   {
      return data;
   }
   
   
 
   public BinaryTreeNode<E> getLeft( )
   {
      return left;                                               
   } 
   
   
 
   public E getLeftmostData( )
   {
      if (left == null)
         return data;
      else
         return left.getLeftmostData( );
   }
      

   public BinaryTreeNode<E> getRight( )
   {
      return right;                                               
   } 


 
   public E getRightmostData( )
   {
      if (left == null)
         return data;
      else
         return left.getRightmostData( );
   }
   
   

   public void inorderPrint( )
   {
      if (left != null)
         left.inorderPrint( );
      System.out.println(data);
      if (right != null)
         right.inorderPrint( );
   }  


   public boolean isLeaf( )
   {
      return (left == null) && (right == null);                                               
   } 


 
   public void preorderPrint( )
   {
      System.out.println(data);
      if (left != null)
         left.preorderPrint( );
      if (right != null)
         right.preorderPrint( );
   } 
   
      

   public void postorderPrint( )
   {
      if (left != null)
         left.postorderPrint( );
      if (right != null)
         right.postorderPrint( );
      System.out.println(data);
   }   


  
   public void print(int depth)
   {
      int i;
   
      // Print the indentation and the data from the current node:
      for (i = 1; i <= depth; i++)
         System.out.print("    ");
      System.out.println(data);

      // Print the left subtree (or a dash if there is a right child and no left child)   
      if (left != null)
         left.print(depth+1);
      else if (right != null)
      {
         for (i = 1; i <= depth+1; i++)
            System.out.print("    ");
         System.out.println("--");
      }

      // Print the right subtree (or a dash if there is a left child and no left child)  
      if (right != null)
         right.print(depth+1);
      else if (left != null)
      {
         for (i = 1; i <= depth+1; i++)
            System.out.print("    ");
         System.out.println("--");
      }
   }
   

   public BinaryTreeNode<E> removeLeftmost( )
   {
      if (left == null)
         return right;
      else
      {
         left = left.removeLeftmost( );
         return this;
      }
   }


   public BinaryTreeNode<E> removeRightmost( )
   {
      if (right == null)
         return left;
      else
      {
         right = right.removeRightmost( );
         return this;
      }
   }
       

   public void setData(E newData)   
   {
      data = newData;
   }                                                               
   
   

   public void setLeft(BinaryTreeNode<E> newLeft)
   {                    
      left = newLeft;
   }
    

   public void setRight(BinaryTreeNode<E> newRight)
   {                    
      right = newRight;
   }  
    
    

   public static <E> BinaryTreeNode<E> treeCopy(BinaryTreeNode<E> source)
   {
        BinaryTreeNode<E> leftCopy;
        BinaryTreeNode<E> rightCopy;

      if (source == null)
         return null;
      else
      {
         leftCopy = treeCopy(source.left);
         rightCopy = treeCopy(source.right);
         return new BinaryTreeNode<E>(source.data, leftCopy, rightCopy);
      }
   }
   

   public static <E> long treeSize(BinaryTreeNode<E> root)
   {
      if (root == null)
         return 0;
      else
         return 1 + treeSize(root.left) + treeSize(root.right);
   }   

}
           

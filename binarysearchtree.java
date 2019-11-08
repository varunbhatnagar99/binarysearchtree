import java.util.*;
public class Trees 
{
    Node root;
    class Node
    {
        int data;
        Node left,right;
        Node (int value)
        {
            data=value;
            left=right=null;
        }
    }
    void insert(int data)
    {
        root=insertR(root,data);
    }
   Node insertR(Node root,int data)
   {
       if(root==null)
       {
           root=new Node(data);
           return root;
       }
       if(data<root.data)
       {
           root.left=insertR(root.left,data);
       }
       else if(data>root.data)
       {
           root.right=insertR(root.right,data);
       }
       return root;
   }
   void postorder()
   {
       postorderR(root);
   }
   
   void postorderR(Node root)
   {
       if(root!=null)
       {
           postorderR(root.left);
             postorderR(root.right);
           System.out.println(root.data);
         
       }
   }
    void inorder()
   {
       inorderR(root);
   }
   
   void inorderR(Node root)
   {
       if(root!=null)
       {
           inorderR(root.left);
           System.out.println(root.data);
             inorderR(root.right);
           
         
       }
   }
    void preorder()
   {
       preorderR(root);
   }
   
   void preorderR(Node root)
   {
       if(root!=null)
       {
            System.out.println(root.data);
           preorderR(root.left);
             preorderR(root.right);
          
         
       }
   }
   public static void main(String args[])
   {
       Trees tree=new Trees();
          tree.insert(50); 
        tree.insert(30); 
        tree.insert(20); 
        tree.insert(40); 
        tree.insert(70); 
        tree.insert(60); 
        tree.insert(80); 
        System.out.println("PostOrder Traversals:");
        tree.postorder();
         System.out.println("PreOrder Traversals:");
        tree.preorder();
         System.out.println("InOrder Traversals:");
         tree.inorder();
   }
    
}


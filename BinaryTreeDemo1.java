class Node{
    Node left;
    int data;
    Node right;
    Node( int gd)
    {
        left = right = null;
        data = gd;
    }
}
class BinaryTree
{
   Node root;
   BinaryTree( ){
    root =null;
   }
   void inorderDisplay( Node curr)
   {
    if( curr != null)
    {
        inorderDisplay(curr.left);
        System.out.print(curr.data+" ");
        inorderDisplay(curr.right);
    }
    else return;
   }
   void preorderDisplay( Node curr)
   {
    if( curr != null)
    {
        System.out.print(curr.data+" ");

        preorderDisplay(curr.left);
        preorderDisplay(curr.right);
    }
    else return;
   }
   void postorderDisplay( Node curr)
   {
    if( curr != null)
    {
        postorderDisplay(curr.left);
        postorderDisplay(curr.right);
                System.out.print(curr.data+" ");

    }
    else return;
   }
}

public class BinaryTreeDemo1{
    static boolean isSymmetricTree( Node t1, Node t2)
    {
        if( t1 == null && t2 == null)
          return true;
        boolean res = isSymmetricTree(t1.left , t2.left);
        if( res)
        {
            if( t1.data != t2.data) return false;
         res =  isSymmetricTree(t1.right,t2.right);
        }  
                 return res;

    }
    public static void main(String[] arg)
    {
          BinaryTree bt = new BinaryTree();
          Node newNode = new Node(10);
          bt.root = newNode;
          newNode = new Node(20);
          bt.root.left = newNode;
          newNode = new Node(30);
          bt.root.right = newNode;
          bt.root.right.right = new Node(40);
          bt.root.right.left = new Node(50);
          BinaryTree bt1 = new BinaryTree();
          newNode = new Node(10);
          bt1.root = newNode;
          newNode = new Node(20);
          bt1.root.left = newNode;
          newNode = new Node(30);
          bt1.root.right = newNode;
          bt1.root.right.right = new Node(40);
          bt1.root.right.left = new Node(50);
          System.out.println(isSymmetricTree(bt.root,bt1.root));
    }
}   
/*
 *  10 -> left 20
 * 10 -> right 30
 * 30 -> 40
 * 30 -> left =50
 * 
 */
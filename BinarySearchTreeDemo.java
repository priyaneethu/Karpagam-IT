class Node{
    Node left;
    int data;
    Node right;
    Node( int gd)
    {
        data = gd;
        left = right = null;
    }
}
class BinarySearchTree
{
    Node root;
    BinarySearchTree( )
    {
        root = null;
    }
    void add( int gd)
    {
         Node newNode = new Node(gd);
         if( root ==null)
            root = newNode;
         else{
            Node safe =null,curr;
            for( curr = root; curr !=null ; safe = curr , 
                                curr = curr.data < newNode.data? curr.right:curr.left );
            if(safe.data < newNode.data)
               safe.right = newNode;
            else safe.left = newNode;   
         }   

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
   void remove( int gd )
   {
       Node curr,safe=null;
       for( curr = root; curr!= null && curr.data != gd; safe = curr , curr= curr.data< gd? curr.right: curr.left);
       if( curr.left == null && curr.right==null)//no child leaf node
       {
           if(safe.data > curr.data)
              safe.left = null;
           else
              safe. right= null;    
       }  

   }
}

public class BinarySearchTreeDemo{
   public static void main(String[] arg)
   {
       BinarySearchTree  bst = new BinarySearchTree();
       bst.add(40);
       bst.add(20);
       bst.add(10);
       bst.add(60);
       bst.add(56);
       bst.add(100);
       bst.add(150);
       bst.add(85);
       bst.inorderDisplay(bst.root);
       bst.remove(150);
       System.out.println();
       bst.inorderDisplay(bst.root);
   }
} 
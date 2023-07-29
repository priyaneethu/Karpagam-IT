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
         
       else if( curr.left == null || curr.right==null)
       {
            if( curr == root){
                 if( curr.left != null)
                    root = curr.left;
                 else
                    root = curr.right;   
            }
            else{
            if( curr.left !=null)
            {
                if(safe.data < curr.data)
                   safe.right = curr.left;
                else
                    safe.left = curr.left;   
            }
            else{
                if(safe.data < curr.data)
                    safe.right = curr.right;
                else
                   safe.left = curr.right;    
            }
        }
       }
       else{
           Node tptr;
              for( tptr= curr.right; tptr.left != null; tptr=tptr.left);
              tptr.left = curr.left;
              if(curr==root)
              {
                  root = curr.right;
              }
              else{
              if( safe.data > curr.data)
                  safe.left = curr.right;
              else
                 safe.right = curr.right;    
           }   
       }

   }
}

public class BinarySearchTreeDemo{
   public static void main(String[] arg)
   {
       BinarySearchTree  bst = new BinarySearchTree();
       int []input = {40,20,60,10,30,50,70,5,3,35,33,32};
       for( int i: input)
          bst.add(i);   
       bst.inorderDisplay(bst.root);
       bst.remove(40);
       System.out.println();
       bst.inorderDisplay(bst.root);
       System.out.println(bst.root.data);
   }
} 
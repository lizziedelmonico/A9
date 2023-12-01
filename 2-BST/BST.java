/**
 * Implements binary search trees.
 *
 * @author Lizzie DelMonico
 * 
 */
public class BST<E extends Comparable<E>> extends BinaryTree<Comparable<E>> implements BST_Ops<E> {
    /**
     * Constructor for the class that implements the data from the parent class
     * @param data  The data of a node
     */
    public BST(E data) {
            super(data);
    }

    /**
     * Constructor for the class that implements the data from the parent class
     * @param data  The data of a node
     * @param left  The left child of a node
     * @param right   The right child of a node
     */
    public BST(E data, BST<E> left, BST<E> right){
        super(data, left, right);
    }

    /**
     *  Returns the node of the given element, or null if not found
     *
     *  @param data The element to search
     *  @return the node of the given element, or null if not found
     */
    public BST<E> lookup(BinaryTree<Comparable<E>> binaryTree, E data){
        BST<E> node = new BST<E>(data);

        if(binaryTree == null){
            node = null;
        }
        else{
            if(binaryTree.getData().compareTo(data) < 0){
                lookup(binaryTree.getLeft(), data);
            }
            if(binaryTree.getData().compareTo(data) > 0){
                lookup(binaryTree.getRight(), data);
            }
            if(binaryTree.getData().equals(data)){
                node = (BST<E>) binaryTree;
            }
        }
        return node;
        
        
    }

    /**
     *  Inserts a new node into the tree
     *
     *  @param data The element to insert
     */
    public void insert(BST<E> binaryTree, E data){
        BinaryTree<E> node = new BinaryTree<E>(data);

        if(super.getData().compareTo(data) < 0){
            if(super.getLeft() == null){
                super.setLeft((BinaryTree<Comparable<E>>) node);
            }
            else{
                insert((BST<E>) binaryTree.getLeft(), data);
            }
        }
        else{
            if(super.getRight() == null){
                super.setRight((BinaryTree<Comparable<E>>) node);
            }
            else{
                insert((BST<E>) binaryTree.getRight(), data);
            }
        }
    }

    /**
     *  Deletes the specified element from the tree
     *  Returns the modified tree because the root node 
     *  may have changed
     *  
     *  @param evictee The element to delete
     *  @return tree as modified
     */
    public BST<E> deleteWithCopyLeft(E evictee){
        BST<E> node = new BST<E>(evictee);
        Comparable<E> data = node.getData();
        BinaryTree<Comparable<E>> right = node.getRight();
        BinaryTree<Comparable<E>> left = node.getLeft();
        
        if(node.isLeaf()){
            node = null;
        }
        else{
            if(node.getRight() != null){
                data = successor(node);
                right = deleteWithCopyLeft(evictee);
            }else{
                data = predecessor(node);
                left = deleteWithCopyLeft(evictee);
            }
        }

    }

    /**
     * Finds the node to replace another node if it gets deleted
     * @param root  The node being looked at
     * @return  The node's successor that will replace it if the original gets deleted
     */
    private Comparable<E> successor(BinaryTree<Comparable<E>> root){
        root = root.getRight();
        while(root.getLeft() != null){
            root = root.getLeft();
        }
        return root.getData();
    }

    /**
     * Finds the node to replace another node if none of the child nodes are applicable
     * @param root  The ndoe being looked at
     * @return  The node's predecessor that will replace the original if it gets deleted
     */
    private Comparable<E> predecessor(BinaryTree<Comparable<E>> root){
        root = root.getLeft();
        while(root.getRight() != null){
            root = root.getRight();
        }
        return root.getData();
    }

    /**
     *  Apply left rotation
     *  Returns the modified tree because the root node 
     *  may have changed
     *
     *  @return tree as modified
     */
    public BST<E> rotateLeft(){

    }

    /**
     *  Apply right rotation
     *  Returns the modified tree because the root node 
     *  may have changed
     *
     *  @return tree as modified
     */
    public BST<E> rotateRight(){
        
    }
}

    
    
        
    

    
    
          
    

    
    
        
              
              
    

    
    
          
    

    
    
        
            
        
                
                    
        
    

    
    
          
    

    
    
          
    

    
    
        
    

    
    
        
    

    
    
        
    

    
    
        
    

    
    
        
        
            
        
          
        
            
        
        
    

    
      
     
      
     
    
        
            
                
            
                
            
        
            
                
            
                
            
        
            
        
    

    
      
     
      
     
    
        
            
                
            
                
            
        
            
                
            
                
            
        
             
        
    

    
      
      
      
      
     
    
        
        
              
                
            
                
            
        
              
                
            
                
            
        
            
              
                 
              
                 
            
                
                  
                    
                
                    
                    
                      
                        
                        
                    
                     
                    
                
            
        
        
    

    
      
     
    
         
        
          
            
          
            
        
            
             
                
                
            
                
                  
                    
                
                
                
                
                
            
        
         
         
         
         
        
    

    
      
      
      
     
    
        
        
        
        
            
            
                
            
                
            
        
         
            
        
            
        
            
        
            
        
        
    

    
      
     
    
        
        
        
        
        
        
        
    

    
      
     
    
        
        
        
        
        
        
        
    
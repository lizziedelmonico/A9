import java.util.*;

/**
 *  Implements a heap data structure, using ArrayList for storage.
 *
 *  @author Nicholas R. Howe
 *  @version CSC 112, 20 November 2006
 */
public class Heap<E extends Comparable<E>> {
    /** Elements of the heap are stored in a ArrayList */
    private ArrayList<E> storage;

    /** Default constructor creates an empty heap */
    public Heap() {
        storage = new ArrayList<E>();
    }

    /** @return  heap size */
    public int size() {
        return storage.size();
    }

    /** @return largest element in heap */
    public E peekTop() {
        return storage.get(0);
    }

    /** @return index of parent */
    private static int parent(int pos) {
        //FILL IN
        return -1;
    }

    /** @return index of left child */
    private static int leftChild(int pos) {
        //FILL IN
        return -1;
    }

    /** @return index of right child */
    private static int rightChild(int pos) {
        //FILL IN
        return -1;
    }

    /** @return T/F does left child exist in tree? */
    private boolean hasLeftChild(int pos) {
        return (leftChild(pos)<size());
    }

    /** @return T/F does right child exist in tree? */
    private boolean hasRightChild(int pos) {
        return (rightChild(pos)<size());
    }

    /** 
     *  Swaps an element upwards
     * @param pos  Position of element to swap upwards
     */
    private void swapWithParent(int pos) {
        E tmp = storage.get(parent(pos));
        storage.set(parent(pos),storage.get(pos));
        storage.set(pos,tmp);
    }

    /** 
     *  Swaps an element downwards to the right
     * @param pos  Position of element to swap 
     */
    private void swapWithRightChild(int pos) {
        E tmp = storage.get(rightChild(pos));
        storage.set(rightChild(pos),storage.get(pos));
        storage.set(pos,tmp);
    }

    /** 
     *  Swaps an element downwards to the left
     * @param pos  Position of element to swap 
     */
    private void swapWithLeftChild(int pos) {
        E tmp = storage.get(leftChild(pos));
        storage.set(leftChild(pos),storage.get(pos));
        storage.set(pos,tmp);
    }

    /**
     *  Compares to elements in the heap
     *  @return  true iff the first is bigger than the second
     */
    private boolean isBigger(int pos1, int pos2) {
        //Comparable c1 = storage.get(pos1);
        //Comparable c2 = storage.get(pos2);
        //return c1.compareTo(c2) > 0;
        return storage.get(pos1).compareTo(storage.get(pos2)) > 0;
    }

    /** 
     *  Bubbles an item down toward the larger of its two children, if any.
     *  It starts at the root (position 0), and follows the item as it sinks.
     *  At each point it should perform several comparisons to determine
     *  what swap is necessary.
     *
     *  First, if the current item has a right child, and that right
     *  child is larger than the current item and its left child, 
     *  then swap the current item with its right child.
     *
     *  Otherwise, if the current item has a left child, and that left
     *  child is larger than the current item, 
     *  then swap the current item with its left child.
     *
     *  Otherwise, don't swap anything.  You are done.
     *
     *  If the current position is swapped with either child, continue
     *  the process with the child position.  
     */
    private void bubbleDown() {
        int pos = 0;
        boolean done = false;
        while (!done) {
            // FILL IN
            // You should use the isBigger, leftChild, and rightChild methods.
	    // also hasLeftChild and hasRightChild.
        }
    }

    /** 
     *  Pops largest element off heap and returns it.
     *
     *  The last element in the heap is copied to the root, 
     *  and removed from its position at the end.  Then it is bubbbled down.
     *  Finally, return the value of the original root
     *
     *  @return the former root element
     */
    public E popTop() {
        // FILL IN
        return null;
    }

    /**
     *  Bubbles an item up until it reaches equilibrium.
     *
     *  As long as the current item is greater than its parent, swap upwards.
     *
     *  @param pos  The position to work with
     */
    private void bubbleUp(int pos) {
        // FILL IN
        // You should use the isBigger, parent, and swapWithParent methods.
    }

    /**
     *  Inserts a new item and re-heapifies
     *
     *  Add the item at the end of the heap, and bubble it up.
     *
     *  @param item  The item to insert
     */
    public void insert(E item) {
        // FILL IN
    }

    /**
     *  Sort an array list in place
     *  @param array list to sort
     */
    public static <T extends Comparable<T>> void heapSort(ArrayList<T> v) {
        // FILL IN
    }

    /** Prints heap for debugging */
    public void print() {
        int j = 1, k = 0;
        System.out.println("Heap contents:");
        for (E item : storage) {
            System.out.print(item+" ");
            k++;
            if (k >= j) {
                j = j << 1;
                k = 0;
                System.out.println("");
            }
        }
        System.out.println("");
    }
}
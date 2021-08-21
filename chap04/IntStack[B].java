package chap04;

public class IntStack {
  private int max;
  private int ptr;
  private int[] stk;
  
  public class EmptyIntStackException extends RuntimeException {
    public EmptyIntStackException() { } 
  } 
  
  public class OverflowIntStackException extends RuntimeException {
    public OverflowIntStackException() { } 
  }
  
  public Intstack(int capacity) {
    ptr = 0;
    max = capacity;
    try {
      stk = new int[max];
    } catch (OutOfMemoryError e) {
      max = 0;
    }
  }
  
  public int push(int x) throws PverflowIntStackException {
    if (ptr >= max)
      throw new OverflowIntStackException();
    return stk[ptr++] = x;
  } 

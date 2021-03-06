package chap04;

public class IntStack {
  private int max;
  private int ptr;
  private int[] stk;
  
  public static EmptyIntStackException extends RuntimeException {
    public EmptyIntStackException() { }
  }
  
  public class OverflowIntStackException extends RuntimeException {
    public OverflowIntStackException() { } 
  }
  
  public IntStack (int capacity) {
    ptr = 0;
    max = capacity;
    try {
      stk = new int[max];
    } catch (OutOfMemoryError e) {
      max = 0;
    }
  }

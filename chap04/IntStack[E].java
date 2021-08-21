public int indexOf(int x){
  for (int i=ptr-1;i>=0;i--)
    if (stk[i] == x)
      return i;
  return -1;
}

public void clear() {
  ptr = 0;
} 

public int capacity() {
  return max;
}

public int size() {
  return ptr;
}

public boolean isEmpty() {
  return ptr<=0;
}

public boolean isFull() {
  return ptr >= max;
}

public void dump() {
  if (ptr <= 0) 
    System.out.println("스택이 비어 있습니다.");
  else {
    for (int i=0;i<ptr;i++)
      System.out.print(stk[i] + " ");
    System.out.println();
  }
}
}

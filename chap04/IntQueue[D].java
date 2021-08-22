// 큐에서 데이터를 피크 (프런트 데이터를 들여다봄)
public int peek() throws EmptyIntQueueException {
  if (num <= 0)
    throw new EmptyIntQueueException();
  return que[front];
}

// 큐에서 x를 검색하며 인덱스(찾지 못하면 -1)를 반환
public int indexOf(int x) {
  for (int i=0;i<num;i++) {
    int idx = (i+front) % max;
    if (que[idx] == x)
      return idx;
  }
  return -1;
}

public void clear() {
  num = front = rear = 0;
}

public int capacity() {
  return max;
}

public int size() {
  return num;
}

public boolean isEmpty() {
  return num <= 0;
}

public boolean ifFull() {
  return num >= max;
}

public void dump() {
  if (num <= 0)
    System.out.println("큐가 비어 있습니다.");
  else {
    for (int i=0;i<num;i++) 
      System.out.print(que[(i+front)%max] + " ");
    System.out.println();
  }
}
}

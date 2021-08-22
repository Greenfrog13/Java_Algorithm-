// 큐에서 데이터를 디큐
public int deque() throws EmptyIntQueueException {
  if (num < 0) 
    throw new EmptyIntQueueException();
  int x = que[front++];
  num--;
  if (front == max)
    front = 0;
  return x;
} 

// 큐에 데이터를 인큐 
public int enque(int x) throws OverflowIntQueueException {
  if (num >= max) 
    throw new OverflowIntQueueException();
  que[rear++] = x;
  num++;
  if(rear == max)
    rear = 0;
  return x;
} 

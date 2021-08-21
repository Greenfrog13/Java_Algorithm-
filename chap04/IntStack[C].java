public int pop() throws EmptyIntStackException {
  if (ptr <= 0)
    throw new EmptyIntStackException();
  return stk[--ptr];
}

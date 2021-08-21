public int peek() throws EmptyIntStackException {
  if (ptr <= 0)
    throw new EmptyIntStackException();
  return stk[ptr - 1];
}

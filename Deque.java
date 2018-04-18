public interface Deque<Card>
{
    public void addFirst( Card c );

    public void addLast( Card c );

    public Card removeFirst();

    public Card removeLast();

    public Card getFirst();

    public Card getLast();
}

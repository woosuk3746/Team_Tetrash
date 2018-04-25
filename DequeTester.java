//Team PurpleFrog (Maryann Foley, Clara Mohri, Jackie Li), credit to Team WhiteFlag (George Liang, Alan Wang)

public class DequeTester{
    public static void main(String[]args){
    QQKachoo<String> t = new QQKachoo<String>();
    System.out.println("Is the deque empty? " + t.isEmpty()); //Expecting true;
    //System.out.println(t.removeFirstOccurrence("polly")); //Will throw exception
//Expecting 0
    //Both methods below will throw exceptions
    //t.removeLast();
    //t.removeFirst();
    System.out.println("--------END-------");
    t.addFirst("bob");
    System.out.println("bob");
    t.addFirst("tom");
    System.out.println("tom");
    t.addFirst("jerry");
    System.out.println("jerry");
    System.out.println("-------Front-------");

    System.out.println("Checking First: " + t.getFirst());
    System.out.println("Checking Last: " + t.getLast());
    System.out.println("First occurence of bob was removed");

    System.out.println("Checking Last: " + t.getLast());//Expecting tom
    t.addLast("timmy");
    System.out.println("timmy was added to the end of the deque");
    System.out.println("Checking Last: " +  t.getLast());//Expecting timmy
    System.out.println("Removed: " + t.removeFirst());//Expecting jerry
    System.out.println("First element in deque was removed");
 
    System.out.println("Removed: " + t.removeLast());//Expecting timmy

    }
}
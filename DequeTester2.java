public class DequeTester2{

    public static void main(String[] args){
	Deque<String> q = new QQKachoo<String>();
	q.addFirst("M");
	q.addLast("N");
	q.addFirst("L");
	q.addLast("O");
	q.addLast("P");
	q.addFirst("K");
	q.addFirst("J");
	q.addFirst("I");
	q.addLast("Q");
	q.addLast("R");
	q.addFirst("H");
	q.addLast("S");
	q.addFirst("G");
	q.addFirst("F");
	q.addLast("T");
	q.addFirst("E");
	q.addFirst("D");
	q.addLast("U");
	q.addFirst("C");
	q.addLast("V");
	q.addFirst("B");
	q.addLast("W");
	q.addFirst("A");
	q.addLast("X");
	q.addLast("Y");
	q.addLast("Z");
	System.out.println(q.getFirst());//A
	System.out.println(q.getLast());//Z
	System.out.println(q.removeFirst());//A
	System.out.println(q.removeFirst());//B
	System.out.println(q.removeFirst());//C
	System.out.println(q.removeFirst());//D
	System.out.println(q.removeFirst());//E
	System.out.println(q.removeFirst());//F
	System.out.println(q.removeFirst());//G
	System.out.println(q.removeFirst());//H
	System.out.println(q.removeLast());//Z
	System.out.println(q.removeLast());//Y
	System.out.println(q.removeLast());//X
	System.out.println(q.removeLast());//W
	System.out.println(q.removeLast());//V
	System.out.println(q.removeLast());//U
	System.out.println(q.removeLast());//T
    }
}

					   

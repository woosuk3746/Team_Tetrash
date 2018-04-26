//Team Tetrash -- Soojin Choi, Adrian Kloskowski, Woosuk Lee
//APCS2 pd8
//L2 --  All Hands on Deque!
//2018-4-20 F
public class QQKachoo<D> implements Deque<D>
{
    //inst vars
    private int _size;
    private DLLNode<D>  _first;
    private DLLNode<D> _last;

    //constructor
    public QQKachoo(){
	_size = 0;
	_first = _last = null;
    }

    //methods
    //Adds newVal to the front of the Deque.
    public void addFirst( D newVal ){
	if(isEmpty()){ // Case when the Deque is empty.
	    _first = new DLLNode<D>( newVal, null, null);
	    _last = _first;
	}
	else{ //All other cases adds the newVal to the front.
	    _first.setPrev( new DLLNode<D>( newVal, null, _first ) );
	    _first = _first.getPrev(); //_front will point to the node containing newVal
	}
	_size++; //increments size by 1

}

    //Adds newVal to the end of the Deque.
    public void addLast( D newVal ){
	if(isEmpty()){ //Case when the Deque is empty
	    _first = new DLLNode<D>( newVal, null, null);
	    _last = _first;
	}
	else{ //Adds newVal to the back.
	    _last.setNext( new DLLNode<D>( newVal, _last, null ) );
	    _last = _last.getNext(); //_last will point to the node containing newVal.
	}
	_size++; //increments size by 1.
}

    //removes the value at the front of the Deque
    public D removeFirst(){
	D retVal = _first.getCargo(); //stores the value removed to return.
	_first.getNext().setPrev(null);
	_first = _first.getNext();
  _size--; //decrements size by 1
	return retVal;
    }

    //removes the value at the end of the Deque
    public D removeLast(){
	D retVal = _last.getCargo(); //stores the value removed to return.
	_last.getPrev().setNext(null); //Moves the pointer away from the node being removed.
	_last = _last.getPrev();
  _size--; //decrements size by 1
	return retVal;
    }

    //Gets the value at the front of the Deque
    public D getFirst(){
	return _first.getCargo();
    }

    //Gets the value at the end of the Deque
    public D getLast(){
	return _last.getCargo();
    }

    //return the size of the Deque
    public int size(){
      return _size;
    }

    //returns whether or not the Deque is empty.
    public boolean isEmpty(){ return _size==0; }

    public static void p(Object o) { System.out.println(o);}

    public static void main(String[] args ){
	Deque<String> q = new QQKachoo<String>();
	q.addFirst("me");
  p(q.size());

	q.addFirst("no");
  p(q.size());

	q.addLast("you");
  p(q.size());

	p(q.getFirst()); //no
	p(q.getLast()); //you

	q.removeFirst();
  p(q.size());
	p(q.getFirst()); //me
    }
}

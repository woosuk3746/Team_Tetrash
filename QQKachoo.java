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
    public void addFirst( D thing ){
	if(isEmpty()){
	    _first = new DLLNode<D>( thing, null, null);
	    _last = _first;
	}
	else{
	    _first.setPrev( new DLLNode<D>( thing, null, _first ) );
	    _first = _first.getPrev();
	}
	_size++;
	
    }

    public void addLast( D thing ){
	if(isEmpty()){
	    _first = new DLLNode<D>( thing, null, null);
	    _last = _first;
	}
	else{
	    _last.setNext( new DLLNode<D>( thing, _last, null ) );
	    _last = _last.getNext();
	}
	_size++;
    }

    public D removeFirst(){
	D thisD = _first.getCargo();
	_first.getNext().setPrev(null);
	_first = _first.getNext();
	return thisD;
    }

    public D removeLast(){
	D thisD = _last.getCargo();
	_last.getPrev().setNext(null);
	_last = _last.getPrev();
	return thisD;
    }

    public D getFirst(){
	return _first.getCargo();
    }

    public D getLast(){
	return _last.getCargo();
    }

    public boolean isEmpty(){ return _size==0; }

    public static void p(Object o) { System.out.println(o);}

    public static void main(String[] args ){
	Deque<String> q = new QQKachoo<String>();
	q.addFirst("me");
	q.addFirst("no");
	q.addLast("you");
	
	p(q.getFirst()); //no	
	p(q.getLast()); //you

	q.removeFirst();
	p(q.getFirst()); //me
    }
}

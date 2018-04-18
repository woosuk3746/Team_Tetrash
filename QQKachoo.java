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
    public QQKachoo<D>(){
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
	    _first = _first.getPrev;
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
	    _last = _last.getNext;
	}
	_size++;
    }

    public D removeFirst(){
	D thisD = _first.getValue();
	_first.getNext().setPrev(null);
	_first = _first.getNext();
	return thisD;
    }

    public D removeLast(){
	D thisD = _last.getValue();
	_last.getPrev().setNext(null);
	_last = _last.getPrev();
	return thisD;
    }

    public D getFirst(){
	return _first.getValue();
    }

    public D getLast(){
	return _last.getValue();
    }

    public boolean isEmpty(){ return _size==0; }
}

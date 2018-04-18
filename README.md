# Team_Tetrash - Soojin Choi, Adrian Kloskowski, Woosuk Lee
## Deque

### To-Do List & Development Plan
1. Make to-do list.
2. Create UML digaram of Deque interface.
3. Discuss implementation of interface.
4. Develop using paired programming.

### Methods:

In a deque, data can be accessed from one of two ends - first or last. For each end, the data can be interacted with by adding, removing, or getting. This creates a total of six necessary functions:

* addFirst
* addLast
* removeFirst
* removeLast
* getFirst
* getLast

Additionally, we implemented an isEmpty function as a helper for the other functions, but it is not necessary for the interface.

### Structure

Our implementation of Deque uses a DLL-like structure, using DLLNode itself to contain data. The double-sided nature of DLLNodes closely parallels the mirrorlike implementation of Deque we sought, and it was an instant match. Arrays and ArrayLists' unidirectional nature would be a hassle to work around, so DLLNodes were the much simpler and more obvious option.

In each of the DLLNodes, "next" points towards the "last" node, and "prev" points towards the "first" node. The implementation of the methods were essentially replicated from our previous implementations of LinkedList and LLQueue.

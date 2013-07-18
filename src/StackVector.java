import java.util.Vector;


public class StackVector<E> implements Stack<E>{

	private Vector<E> data;
	
	public StackVector(){
		data = new Vector<E>();
	}
	
	@Override
	public void push(E item) {
		// TODO Auto-generated method stub
		data.add(item);
	}

	@Override
	public E pop() {
		// TODO Auto-generated method stub
		return data.remove(size()-1);
	}

	@Override
	public E peek() {
		// TODO Auto-generated method stub
		return data.get(size()-1);
	}

	@Override
	public boolean empty() {
		// TODO Auto-generated method stub
		return data.isEmpty();
	}

	@Override
	public int size() {
		// TODO Auto-generated method stub
		return data.size();
	}


}

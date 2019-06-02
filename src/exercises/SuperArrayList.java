package exercises;

import java.util.ArrayList;

public class SuperArrayList extends ArrayList<Object> {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Object pop() {
		if (isEmpty()) {
			return null;
		} else {
			Object o = get(size() - 1);
			remove(o);
			return (o);
		}
	}

	public void print() {
		for (Object o : this) {
			System.out.print(o + " ");
		}
	}
	
	public Object insert(int index, Object item) {
		this.add(index, item);
		return this;
	}

}

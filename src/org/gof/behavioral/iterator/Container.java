package org.gof.behavioral.iterator;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class Container<E> implements Iterable<E> {

	private List<E> list;

	public Container() {
		list = new ArrayList<>();
	}

	public boolean add(E e) {
		return list.add(e);
	}

	public boolean remove(Object obj) {
		return list.remove(obj);
	}

	@Override
	public Iterator<E> iterator() {
		return list.iterator();
	}

}

package org.gof.behavioral.visitor;

import java.util.ArrayList;
import java.util.List;

public class CompoundShape implements Shape, Element {

	public int id;
	public List<Element> children;

	public CompoundShape(int id) {
		this.id = id;
		children = new ArrayList<>();
	}

	@Override
	public void move(int x, int y) {
		// move shape
	}

	@Override
	public void draw() {
		// draw shape
	}

	@Override
	public String accept(Visitor visitor) {
		return visitor.visitCompoundGraphic(this);
	}

	public void add(Element shape) {
		children.add(shape);
	}

	public int getId() {
		return id;
	}

}

package org.gof.behavioral;

import org.gof.behavioral.visitor.Circle;
import org.gof.behavioral.visitor.CompoundShape;
import org.gof.behavioral.visitor.Dot;
import org.gof.behavioral.visitor.Element;
import org.gof.behavioral.visitor.Rectangle;
import org.gof.behavioral.visitor.XMLExportVisitor;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class TestVistor {

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@AfterAll
	static void tearDownAfterClass() throws Exception {
	}

	@BeforeEach
	void setUp() throws Exception {
	}

	@AfterEach
	void tearDown() throws Exception {
	}

	@Test
	void test() {
		Dot dot = new Dot(1, 10, 55);
		Circle circle = new Circle(2, 23, 15, 10);
		Rectangle rectangle = new Rectangle(3, 10, 17, 20, 30);

		CompoundShape compoundShape = new CompoundShape(4);
		compoundShape.add(dot);
		compoundShape.add(circle);
		compoundShape.add(rectangle);

		CompoundShape c = new CompoundShape(5);
		c.add(dot);
		compoundShape.add(c);

		export(circle, compoundShape);
	}

	private void export(Element... elements) {
		XMLExportVisitor exportVisitor = new XMLExportVisitor();
		System.out.println(exportVisitor.export(elements));
	}

}

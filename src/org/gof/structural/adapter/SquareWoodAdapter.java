package org.gof.structural.adapter;

public class SquareWoodAdapter extends RoundWood {

	private SquareWood wood;

	public SquareWoodAdapter(SquareWood wood) {
		this.wood = wood;
	}

	@Override
	public double getRadius() {
		return wood.getWidth() / Math.sqrt(2);
	}

}

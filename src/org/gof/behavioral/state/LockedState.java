package org.gof.behavioral.state;

public class LockedState extends BaseState {

	LockedState(Player player) {
		super(player);
		player.setReadying(false);
	}

	@Override
	public String lock() {
		return "Already Locked...";
	}

	@Override
	public String unlock() {
		player.changeState(new ReadyState(player));
		return "Locked -> Readying";
	}

	@Override
	public String next() {
		return "Locked...";
	}

	@Override
	public String previous() {
		return "Locked...";
	}

}

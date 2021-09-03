package org.gof.behavioral.state;

public class ReadyState extends BaseState {

	public ReadyState(Player player) {
		super(player);
	}

	@Override
	public String lock() {
		player.changeState(new LockedState(player));
		return "Locked <- Readying";
	}

	@Override
	public String unlock() {
		player.changeState(new PlayingState(player));
		return player.startPlayback();
	}

	@Override
	public String next() {
		return "Readying...";
	}

	@Override
	public String previous() {
		return "Readying...";
	}

}

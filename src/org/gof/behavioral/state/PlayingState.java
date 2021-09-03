package org.gof.behavioral.state;

public class PlayingState extends BaseState {

	PlayingState(Player player) {
		super(player);
	}

	@Override
	public String lock() {
		player.changeState(new ReadyState(player));
		player.setCurrentTrackAfterStop();
		return "Readying <- Playing";
	}

	@Override
	public String unlock() {
		return "Already Played...";
	}

	@Override
	public String next() {
		return player.nextTrack();
	}

	@Override
	public String previous() {
		return player.previousTrack();
	}

}

package org.gof.behavioral.state;

import java.util.ArrayList;
import java.util.List;

public class Player {

	private State state;
	private boolean readying;
	private List<String> playlist = new ArrayList<>();
	private int currentTrack = 0;

	public Player() {
		this.state = new ReadyState(this);
		setReadying(true);
		for (int i = 1; i <= 12; i++) {
			playlist.add("Track " + i);
		}
	}

	public void changeState(State state) {
		this.state = state;
	}

	public State getState() {
		return state;
	}

	public void setReadying(boolean readying) {
		this.readying = readying;
	}

	public boolean isReadying() {
		return readying;
	}

	public String startPlayback() {
		return "Playing " + playlist.get(currentTrack);
	}

	public String nextTrack() {
		currentTrack++;
		if (currentTrack > playlist.size() - 1) {
			currentTrack = 0;
		}
		return "Playing " + playlist.get(currentTrack);
	}

	public String previousTrack() {
		currentTrack--;
		if (currentTrack < 0) {
			currentTrack = playlist.size() - 1;
		}
		return "Playing " + playlist.get(currentTrack);
	}

	public void setCurrentTrackAfterStop() {
		this.currentTrack = 0;
	}

}

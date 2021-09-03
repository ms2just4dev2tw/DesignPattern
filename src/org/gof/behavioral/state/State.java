package org.gof.behavioral.state;

public interface State {

	String lock();

	String unlock();

	String next();

	String previous();

}

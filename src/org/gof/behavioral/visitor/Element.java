package org.gof.behavioral.visitor;

/**
 * 接受访问者的接口
 * 
 * @author TungWang
 */
public interface Element {

	String accept(Visitor visitor);

}

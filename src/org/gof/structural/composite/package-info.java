/**
 * <h3>组合模式</h3>
 * 使用组合模式可以将复杂对象组合成由简单对象组成的树状结构
 * <p>
 * 在树的叶子层是一些简单的对象，而对于树内部的对象是一个包含多个简单对象和多个组合对象的对象
 * 
 * @see java.awt.Container#add(Component) （几乎广泛存在于 Swing 组件中）
 * @see javax.faces.component.UIComponent#getChildren() （几乎广泛存在于 JSF UI 组件中）
 */
package org.gof.structural.composite;

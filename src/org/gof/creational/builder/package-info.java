/**
 * <h3>生成器模式</h3>
 * 适用场景：<p>
 * 1，对于构造函数的参数多达十多个参数的对象 <p>
 * 2，希望使用代码创建不同形式的产品 <p>
 * 3，分步骤建造复杂对象
 * <p>
 * 
 * @see java.lang.StringBuilder#append() StringBuilder（ 非同步 ）
 * @see java.lang.StringBuffer#append() StringBuffer（ 同步 ）
 * @see java.nio.ByteBuffer#put() ByteBuffer（还有 Char­Buffer,Short­Buffer,Int­Buffer,Long­Buffer,Float­Buffer 和 Double­Buffer）
 * @see javax.swing.GroupLayout.Group#addComponent()
 * @see java.lang.Appendable的所有实现
 */
package org.gof.creational.builder;

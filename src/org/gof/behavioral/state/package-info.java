/**
 * <h3>状态模式</h3>
 * 在一个对象的内部状态变化时改变其行为，使其看上去就像改变了自身所属的类一样。
 * <p>
 * 在Java中，基于 switch 语句的大型状态机可以考虑转换成一个状态对象。
 * 
 * @see org.gof.behavioral.strategy 策略使得对象相互之间完全独立，它们不知道其他对象的存在
 * @see javax.faces.lifecycle.LifeCycle#execute() 行为依赖于当前 JSF 生命周期的阶段(状态)
 */
package org.gof.behavioral.state;

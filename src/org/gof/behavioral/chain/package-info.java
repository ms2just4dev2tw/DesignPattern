/**
 * <h3>Chain of Responsibility 责任链模式</h3>
 * 将请求沿着处理者链进行发送。每个处理者均可对请求进行处理，或将其传递给链上的下个处理者。
 * 
 * <h3>与其他模式的关系</h3>
 * {@link org.gof.behavioral.command 单向链接的命令模式}
 * <p>
 * {@link org.gof.behavioral.mediator 消除直接链接的中介者模式}
 * <p>
 * {@link org.gof.behavioral.observer 可动态插拔链接的观察者模式}
 * 
 * @see javax.servlet.Filter#doFilter()
 * @see java.util.logging.Logger#log() 
 */
package org.gof.behavioral.chain;

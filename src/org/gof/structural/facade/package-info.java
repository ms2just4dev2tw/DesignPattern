/**
 * <h3>外观模式</h3>
 * 为程序库、 框架或其他复杂类提供一个简单的接口
 * <h3>与其他模式的区别</h3>
 * 1，适配器通常只封装一个对象， 外观通常会作用于整个对象子系统上
 * <p>
 * 2，外观和中介者模式的职责类似，它们都尝试在大量紧密耦合的类中组织起合作。
 * <ul>
 * 		<li>外观为子系统中的所有对象定义了一个简单接口， 但是它不提供任何新功能。
 * 			子系统本身不会意识到外观的存在。 子系统中的对象可以直接进行交流。</li>
 * 		<li>中介者将系统中组件的沟通行为中心化。 各组件只知道中介者， 无法直接相互交流。</li>
 * </ul>
 * <p>
 * 3，代理与其服务对象遵循同一接口， 使得自己和服务对象可以互换， 在这一点上它与外观不同。
 * 
 * @see javax.faces.context.FacesContext FacesContext在底层使用了
 * Life­Cycle、View­Handler 和 Navigation­Handler 这几个类，但绝大多数客户端不知道
 * @see javax.faces.context.ExternalContext ExternalContext在内部使用了
 * Servlet­Context、Http­Session、Http­Servlet­Request、Http­Servlet­Response和其他一些类
 */
package org.gof.structural.facade;

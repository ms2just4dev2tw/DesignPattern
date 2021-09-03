package org.gof.creational.builder;

import java.util.Date;

/**
 * 使用Builder模式分步组成具有不同属性的对象
 * <p>
 * 相较于重载构造函数它更加灵活
 * <p>
 * 对比JavaBean它更加简单
 * <p>
 * @author TungWang
 */
public class Person {

	private final String name; // 名字，required
	private final String sex; // 性别，required
	private final Date date; // 日期，required

	private final int height; // 身高，optional
	private final int weight; // 体重，optional
	private final String edu; // 教育程度，optional
	private final String role; // 角色，optional
	private final String addr; // 家庭地址，optional
	private final String email; // 邮件地址，optional
	private final String nickName; // 外号，optional

	// 私有构造器，因此Person对象的创建必须依赖于Builder
	private Person(Builder builder) {
		this.name = builder.name;
		this.sex = builder.sex;
		this.date = builder.date;
		this.email = builder.email;
		this.height = builder.height;
		this.edu = builder.edu;
		this.nickName = builder.nickName;
		this.weight = builder.weight;
		this.addr = builder.addr;
		this.role = builder.role;
	}

	public static class Builder {
		private final String name; // required，使用final修饰
		private final String sex; // required，使用final修饰
		private final Date date; // required，使用final修饰

		private int height; // 身高，optional
		private int weight; // 体重，optional
		private String edu; // 教育程度，optional
		private String role; // 角色，optional
		private String addr; // 家庭地址，optional
		private String email; // 邮件地址，optional
		private String nickName; // 外号，optional

		public Builder(String name, String sex, Date date) {
			this.name = name;
			this.sex = sex;
			this.date = date;
		}

		// 返回Builder对象本身，链式调用
		public Builder email(String email) {
			this.email = email;
			return this;
		}

		// 返回Builder对象本身，链式调用
		public Builder height(int height) {
			this.height = height;
			return this;
		}

		// 返回Builder对象本身，链式调用
		public Builder edu(String edu) {
			this.edu = edu;
			return this;
		}

		// 返回Builder对象本身，链式调用
		public Builder role(String role) {
			this.role = role;
			return this;
		}

		// 返回Builder对象本身，链式调用
		public Builder nickName(String nickName) {
			this.nickName = nickName;
			return this;
		}

		// 返回Builder对象本身，链式调用
		public Builder weight(int weight) {
			this.weight = weight;
			return this;
		}

		// 返回Builder对象本身，链式调用
		public Builder addr(String addr) {
			this.addr = addr;
			return this;
		}

		// 通过Builder构建所需Person对象，并且每次都产生新的Person对象
		public Person build() {
			return new Person(this);
		}
	}

	@Override
	public String toString() {
		StringBuffer sb = new StringBuffer("Person{name=\'" + name + "\' , sex=\'" + sex + "\'' , date=" + date);

		if (email != null)
			sb.append(", email= \'" + email + "\'");
		else if (height > 0)
			sb.append(", height= \'" + height + "\'");
		else if (edu != null)
			sb.append(", edu= \'" + edu + "\'");
		else if (role != null)
			sb.append(", role= \'" + role + "\'");
		else if (weight > 0)
			sb.append(", weight= \'" + weight + "\'");
		else if (addr != null)
			sb.append(", addr= \'" + addr + "\'");
		else if (nickName != null)
			sb.append(", nickName= \'" + nickName + "\'");

		sb.append("}");

		return sb.toString();
	}

}

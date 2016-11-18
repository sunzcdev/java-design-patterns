package com.iluwatar;

import com.iluwatar.Hero.HeroBuilder;

/**
 * 
 * This is the Builder pattern variation as described by Joshua Bloch in
 * Effective Java 2nd Edition.
 * 
 * We want to build Hero objects, but its construction is complex because of the
 * many parameters needed. To aid the user we introduce HeroBuilder class.
 * HeroBuilder takes the minimum parameters to build Hero object in its
 * constructor. After that additional configuration for the Hero object can be
 * done using the fluent HeroBuilder interface. When configuration is ready the
 * build method is called to receive the final Hero object.
 *
 * 构建者模式是一种对象初始化过程复杂的封装。如果一种对象的初始化参数过多，参数的变化也比较多可以考虑构建者模式。
 * 很典型的应用场景就是如果你的类有很多个参数，或者你的类的构造方法很多，可以使用它。
 * 这个设计模式的结构比较简单，静态内部类作为构建者类，然后被构建者的构造方法只需要一个构建者参数。
 * 然后初始化的过程从构建者对象中获取。因此，被构建者的构造方法无需公开。
 * 构建者类是被构建者对外开放的接口。因此，这个接口的设计尽量的人性化，简单易懂。最后使用一个build来构造出目标对象。
 *
 * 
 */
public class App {

	public static void main(String[] args) {

		Hero mage = new HeroBuilder(Profession.MAGE, "Riobard")
				.withHairColor(HairColor.BLACK).withWeapon(Weapon.DAGGER)
				.build();
		System.out.println(mage);

		Hero warrior = new HeroBuilder(Profession.WARRIOR, "Amberjill")
				.withHairColor(HairColor.BLOND)
				.withHairType(HairType.LONG_CURLY).withArmor(Armor.CHAIN_MAIL)
				.withWeapon(Weapon.SWORD).build();
		System.out.println(warrior);

		Hero thief = new HeroBuilder(Profession.THIEF, "Desmond")
				.withHairType(HairType.BALD).withWeapon(Weapon.BOW).build();
		System.out.println(thief);

	}
}

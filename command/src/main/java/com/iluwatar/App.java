package com.iluwatar;

/**
 * 
 * In Command pattern actions are objects that can be executed and undone. 
 * 
 * In this example the commands are the spells cast by the wizard on the goblin.
 * 在命令模式中，行为是一类可以被执行和撤销的对象。变化的方向是行为，而执行人是不变的。
 * 在应用中，如果变化的部分都是动词可以考虑使用命令设计模式。将变化的动作封装为对象动态调用是命令设计模式的精髓。
 */
public class App {

	public static void main(String[] args) {
		Wizard wizard = new Wizard();
		Goblin goblin = new Goblin();

		goblin.printStatus();

		wizard.castSpell(new ShrinkSpell(), goblin);
		goblin.printStatus();

		wizard.castSpell(new InvisibilitySpell(), goblin);
		goblin.printStatus();
		wizard.undoLastSpell();
		goblin.printStatus();
	}
}

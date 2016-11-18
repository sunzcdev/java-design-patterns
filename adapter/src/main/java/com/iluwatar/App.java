package com.iluwatar;

/**
 * 
 * There are two variations of the Adapter pattern: The class adapter implements
 * the adaptee's interface whereas the object adapter uses composition to
 * contain the adaptee in the adapter object. This example uses the object
 * adapter approach.
 * 
 * The Adapter (GnomeEngineer) converts the interface of the target class
 * (GoblinGlider) into a suitable one expected by the client
 * (GnomeEngineeringManager).
 *
 * 适配器模式是为了实现两个不兼容的接口的兼容的模式。因此，当使用适配器的时候或许就是接口设计不合理的原因。。
 * 这个原因有很多，比如双方在这几功能模块的时候互相之间并没有合作，或者自己的设计思想没有照顾到以后的变化。也或者是
 * 双方就不属于统一体系架构下的东西。
 * 另外适配器也可以实现功能的多样化，在设计模块的时候无需过度考虑兼容性问题，使用适配器可以很好的解决设计与应用的问题。
 * 一个适配器同时拥有一方的接口，同时也是另一方接口的实现类。
 *
 * 
 */
public class App {

	public static void main(String[] args) {
		GnomeEngineeringManager manager = new GnomeEngineeringManager();
		manager.operateDevice();
	}
}

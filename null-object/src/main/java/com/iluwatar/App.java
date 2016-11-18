package com.iluwatar;

/**
 * Null Object pattern replaces null values with neutral objects.
 * Many times this simplifies algorithms since no extra null checks
 * are needed.
 * <p>
 * In this example we build a binary tree where the nodes are either
 * normal or Null Objects. No null values are used in the tree making
 * the traversal easy.
 *
 * 空设计模式主要是应对频繁的非空判断。
 * 他的做法是将Null也视为一个对象，只不过这个对象的每个方法都是空的，方法的返回值也都是默认的。
 * 这样在被调用的时候就不需要做非空判断，如果这个对象是空对象，则会执行空方法而不是报空指针。
 * 一下的例子演示了在遍历一棵树的时候，由于需要不断的判断左右是否为空，因此将空也作为一个节点。
 * 这样就避免了在遍历的时候判空。
 */
public class App {
    public static void main(String[] args) {
/**
 *           1
 *      11       12
 * 111               122
 */
        Node root = new NodeImpl("1",
                new NodeImpl("11",
                        new NodeImpl("111",
                                new NullNode(),
                                new NullNode()),
                        new NullNode()),
                new NodeImpl("12",
                        new NullNode(),
                        new NodeImpl("122",
                                new NullNode(),
                                new NullNode())));

        root.walk();
    }
}

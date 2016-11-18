package com.iluwatar;

/**
 * Chain of Responsibility organizes request handlers (RequestHandler) into a
 * chain where each handler has a chance to act on the request on its turn. In
 * this example the king (OrcKing) makes requests and the military orcs
 * (OrcCommander, OrcOfficer, OrcSoldier) form the handler chain.
 * 职责链模式重点在于职责，其组织结构是链式结构，使用者构建职责链条。
 * 原始的模式其实一长条的if else判断或者是switch case语句。本模式其实是将if else繁杂的判断分离出来形成单个的判断。
 * 模式的构成主要是一个抽象的职责类。这个类包含一个下级链条的引用及本级处理请求的方法。在这个方法里判断
 * 是否自己处理，或者留给下一级来处理。
 * 客户端使用的时候来创建链条结构。
 * <p>
 * 可以用做一个过滤器，不过话说一长条的if else本来就是一个过滤器。
 */
public class App {

    public static void main(String[] args) {

        OrcKing king = new OrcKing();
        king.makeRequest(RequestType.DEFEND_CASTLE);
        king.makeRequest(RequestType.TORTURE_PRISONER);
        king.makeRequest(RequestType.COLLECT_TAX);


    }

    public static void switchPattern(RequestType type) {
        switch (type) {
            case DEFEND_CASTLE:
                //直接处理不交给下一级
                break;
            case TORTURE_PRISONER:
                break;
            case COLLECT_TAX:
                break;
        }
    }

    public static void simplePattern(RequestType type) {
        if (type == RequestType.DEFEND_CASTLE) {

        } else if (type == RequestType.TORTURE_PRISONER) {

        } else if (type == RequestType.COLLECT_TAX) {

        }
    }
}

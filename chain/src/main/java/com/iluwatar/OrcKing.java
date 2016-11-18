package com.iluwatar;

/**
 * Makes requests that are handled by the chain.
 */
public class OrcKing {

    RequestHandler chain;

    public OrcKing() {
        buildChain();
    }

    private void buildChain() {
        //创建职责链结构，从左到右依次处理请求。最后一级的下一级别是空的。
        chain = new OrcCommander(new OrcOfficer(new OrcSoldier(null)));
    }

    public void makeRequest(RequestType req) {
        chain.handleRequest(req);
    }

}

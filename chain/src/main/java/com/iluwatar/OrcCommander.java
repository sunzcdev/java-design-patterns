package com.iluwatar;

public class OrcCommander extends RequestHandler {

    public OrcCommander(RequestHandler handler) {
        super(handler);
    }

    @Override
    public void handleRequest(Request req) {
        //在这里处理上一级下发下来的请求，如果符合自己的责任则处理
        if (req.getRequestType().equals(RequestType.DEFEND_CASTLE)) {
            printHandling(req);
        } else {
            //如果不符合，则留给下一级处理
            super.handleRequest(req);
        }
    }

    @Override
    public String toString() {
        return "Orc commander";
    }
}

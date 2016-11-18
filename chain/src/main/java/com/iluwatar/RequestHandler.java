package com.iluwatar;

public abstract class RequestHandler {

    /**
     * 下一级的引用
     */
    private RequestHandler next;

    public RequestHandler(RequestHandler next) {
        this.next = next;
    }

    /**
     * 处理请求的默认方法，默认本级不处理，由下一级处理。
     *
     * @param req
     */
    public void handleRequest(RequestType req) {
        if (next != null) {
            next.handleRequest(req);
        }
    }

    protected void printHandling(RequestType req) {
        System.out.println(this + " handling request \"" + req.toString() + "\"");
    }

    @Override
    public abstract String toString();
}

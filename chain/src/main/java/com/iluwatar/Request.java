package com.iluwatar;

public class Request {

    private RequestType requestType;

    public Request(RequestType requestType) {
        this.setRequestType(requestType);
    }

    public RequestType getRequestType() {
        return requestType;
    }

    public void setRequestType(RequestType requestType) {
        this.requestType = requestType;
    }

    @Override
    public String toString() {
        return requestType.toString();
    }
}

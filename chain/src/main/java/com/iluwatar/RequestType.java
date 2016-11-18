package com.iluwatar;

public enum RequestType {

    DEFEND_CASTLE("defend castle"), TORTURE_PRISONER("torture prisoner"), COLLECT_TAX("collect tax");
    String name;

    RequestType(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }
}

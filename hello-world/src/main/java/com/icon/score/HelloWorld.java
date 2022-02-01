package com.icon.score;

import score.Context;
import score.annotation.External;
import score.annotation.Payable;

public class HelloWorld {
    private final String name;

    public HelloWorld(String name) {
        this.name = name;
    }

    @External(readonly=true)
    public String name() {
        return name;
    }

    @External(readonly=true)
    public String getGreeting() {
        String msg = "Hello " + name + "!";
        Context.println(msg);
        return msg;
    }

    @Payable
    public void fallback() {
        // just receive incoming funds
    }
}

package com.example.api;

import io.micronaut.core.annotation.Introspected;

@Introspected
final public class Info {
    public String nodeId;
    public String instanceId;
    public int blockHeight;

    @Override
    public String toString() {
        return "Question{" +
                "nodeId=" + nodeId + '\'' +
                ", instanceId=" + instanceId + '\'' +
                ", blockHeight=" + blockHeight +
                '}';
    }
}
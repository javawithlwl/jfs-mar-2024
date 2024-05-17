package com.careerit.jfs.cj.basics.enumex;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

public enum Status {
    ACTIVE("8ee62eeb-79e1-42ae-9845-f7b14fd19d1e"),
    INACTIVE("9f0423f9-3c4c-4693-835e-59b20182a573"),
    DELETED("7ccba2b0-d740-47d4-a16a-740c9ca784db");

    private String id;

    private Status(String id) {
        this.id = id;
    }

    public String getId() {
        return id;
    }
    private static final Map<UUID,Status> valueMap = new HashMap<>();

    static{
        for(Status status: Status.values()) {
            valueMap.put(UUID.fromString(status.getId()), status);
        }
    }

    public static Status fromId(UUID id) {
        return valueMap.get(id);
    }

    public static Status fromId(String id) {
        return fromId(UUID.fromString(id));
    }
}

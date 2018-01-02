package com.rumofuture.nemo.util.generator;

import java.util.UUID;

public class Generator {

    public static String getUUID() {
        return UUID.randomUUID().toString().replace("-", "");
    }

    public static String getToken() {
        return UUID.randomUUID().toString().replace("-", "");
    }
}

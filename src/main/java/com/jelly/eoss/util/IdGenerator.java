package com.jelly.eoss.util;

import org.apache.commons.lang3.StringUtils;

import java.util.UUID;

public class IdGenerator {
    public static String id(){
        String uuid = UUID.randomUUID().toString();
        String id = StringUtils.replace(uuid, "-", "");
        return id;
    }

    public static void main(String[] args) {
        System.out.println(id());
    }
}

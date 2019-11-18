package com.program.task1.service;

public enum Status {

    MANAGER, PROGRAMMER;

    public static String manager() {
        return MANAGER.name();
    }

    public static String programmer() {
        return PROGRAMMER.name();
    }

}

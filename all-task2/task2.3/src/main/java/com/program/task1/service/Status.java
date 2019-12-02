package com.program.task1.service;

public enum Status {

    PROGRAMMER, MANAGER;

    public static String programmer() {
        return PROGRAMMER.name();
    }

    public static String manager() {
        return MANAGER.name();
    }

}

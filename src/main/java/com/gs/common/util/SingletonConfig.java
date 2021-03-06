package com.gs.common.util;

/**
 * Created by WangGenshen on 7/20/15.
 */
public class SingletonConfig extends Config {

    private static SingletonConfig config;

    private SingletonConfig() {

    }

    public static SingletonConfig getInstance() {
        synchronized (SingletonConfig.class) {
            if (config == null) {
                System.out.println("First time to get a SingletonConfig instance, and only once!");
                config = new SingletonConfig();
            }
        }
        return config;
    }

}

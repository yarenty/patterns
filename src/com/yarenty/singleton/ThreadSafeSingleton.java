package com.yarenty.singleton;

/**
 * This is Bill Pugh singleton implementation - doesnt need symchronization or double locking.
 * Still can create 2 instances by reflection.
 * <p/>
 * Created by yarenty on 24/02/2015.
 */
public class ThreadSafeSingleton {


    private ThreadSafeSingleton() {
    }

    public static ThreadSafeSingleton getInstance() {
        return SingletonHelper.INSTANCE;
    }

    public void showMe() {
        System.out.println("Thread safe hello ;-)");
    }

    private static class SingletonHelper {
        private static final ThreadSafeSingleton INSTANCE = new ThreadSafeSingleton();
    }
}

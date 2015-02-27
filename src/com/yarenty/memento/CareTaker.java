package com.yarenty.memento;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by yarenty on 10/02/2015.
 */
public class CareTaker {

    private final List<Memento> mementoList = new ArrayList<Memento>();

    public void add(final Memento state) {
        mementoList.add(state);
    }

    public Memento get(final int index) {
        return mementoList.get(index);
    }
}

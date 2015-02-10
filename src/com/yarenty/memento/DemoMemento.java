package com.yarenty.memento;

/**
 * Created by yarenty on 10/02/2015.
 */
public class DemoMemento {

    public static void main(String[] args) {


        System.out.println("\n\n **MEMENTO PATTERN*** \n Memento pattern is used to restore state of an object" +
                " to a previous state." +
                " \n" +
                " Behavioral pattern.\n" +
                " Memento pattern uses 3 actor classes:\n" +
                " > Memento contains state of an object to be restored.\n" +
                " > Originator creates and stores states in Memento objects.\n" +
                " > Caretaker object is responsible to restore object state from Memento." +
                " \n\n" );

        Originator originator = new Originator();
        CareTaker careTaker = new CareTaker();

        originator.setState("State #1");
        originator.setState("State #2");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #3");
        careTaker.add(originator.saveStateToMemento());

        originator.setState("State #4");
        System.out.println("Current state::"+originator.getState());

        originator.getStateFromMemento(careTaker.get(0));
        System.out.println("First saved state::" + originator.getState());

        originator.getStateFromMemento(careTaker.get(1));
        System.out.println("Second saved state::" + originator.getState());

    }


}

package com.yarenty.step_builder;

/**
 * Created by yarenty on 24/02/2015.
 */
public class DemoStepBuilder {

    public static void main(String[] args) {

        System.out.println("\n\n *** STEP BUILDER PATTERN***\n Basically no possibility to avoid necessary steps.\n" +
                " Creational pattern.\n" +
                " \n\n");

        new ClassicBuilder("local configuration with classic builder").onLocalHost().build();
        new ClassicBuilder("remote configuration with classic builder").onRemoteHost("127.0.0.1").credentials("user", "pass").build();

        new ClassicBuilder("error configuration with classic builder - no host").build();
        new ClassicBuilder("error remote configuration with classic builder - no credentials").onRemoteHost("127.0.0.1")
                .build();


        // there is  no possibility to avoid specify step isf you want to BUILD!!
        StepBuilder.newBuilder().name("step builder local").onLocalhost().build();

        StepBuilder.newBuilder().name("step builder remote").onRemoteHost("127.0.0.2").credentials("user","pass").build();



    }
}

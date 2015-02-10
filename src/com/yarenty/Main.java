package com.yarenty;

import com.yarenty.chainofresponsibility.DemoChain;
import com.yarenty.command.DemoCommandPattern;
import com.yarenty.factory.DemoFactory;
import com.yarenty.flyweight.DemoFlyweight;
import com.yarenty.interpreter.DemoInterpreterPattern;
import com.yarenty.iterator.DemoIteratorPattern;
import com.yarenty.mediator.DemoMediator;
import com.yarenty.memento.DemoMemento;
import com.yarenty.proxy.DemoProxy;

public class Main {

    public static void main(String[] args) {


        DemoFactory.main(args);

        DemoFlyweight.main(args);
        DemoProxy.main(args);
        DemoChain.main(args);
        DemoCommandPattern.main(args);
        DemoInterpreterPattern.main(args);
        DemoIteratorPattern.main(args);
        DemoMediator.main(args);
        DemoMemento.main(args);

    }
}

package com.yarenty;

import com.yarenty.bussines_delegate.DemoBusinessDelegate;
import com.yarenty.chainofresponsibility.DemoChain;
import com.yarenty.command.DemoCommandPattern;
import com.yarenty.factory.DemoFactory;
import com.yarenty.flyweight.DemoFlyweight;
import com.yarenty.interpreter.DemoInterpreterPattern;
import com.yarenty.iterator.DemoIteratorPattern;
import com.yarenty.mediator.DemoMediator;
import com.yarenty.memento.DemoMemento;
import com.yarenty.mvc.DemoMVC;
import com.yarenty.nullobject.DemoNullPattern;
import com.yarenty.observer.DemoObserver;
import com.yarenty.proxy.DemoProxy;
import com.yarenty.state.DemoState;
import com.yarenty.strategy.DemoStrategy;
import com.yarenty.template.DemoTemplate;
import com.yarenty.visitor.DemoVisitor;

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
        DemoObserver.main(args);
        DemoState.main(args);
        DemoNullPattern.main(args);
        DemoStrategy.main(args);
        DemoTemplate.main(args);
        DemoVisitor.main(args);
        DemoMVC.main(args);
        DemoBusinessDelegate.main(args);

    }
}

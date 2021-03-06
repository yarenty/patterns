package com.yarenty;

import com.yarenty.abstractfactory.DemoAbstractFactory;
import com.yarenty.bridge.DemoBridge;
import com.yarenty.builder.DemoBuilder;
import com.yarenty.bussines_delegate.DemoBusinessDelegate;
import com.yarenty.chainofresponsibility.DemoChain;
import com.yarenty.command.DemoCommandPattern;
import com.yarenty.composite.DemoComposite;
import com.yarenty.composite_entity.DemoCompositeEntity;
import com.yarenty.dao.DemoDAO;
import com.yarenty.decorator.DemoDecorator;
import com.yarenty.facade.DemoFacade;
import com.yarenty.factory.DemoFactory;
import com.yarenty.filter.DemoFilter;
import com.yarenty.flyweight.DemoFlyweight;
import com.yarenty.front_controller.DemoFrontController;
import com.yarenty.intercepting_filter.DemoInterceptingFilter;
import com.yarenty.interpreter.DemoInterpreterPattern;
import com.yarenty.iterator.DemoIteratorPattern;
import com.yarenty.mediator.DemoMediator;
import com.yarenty.memento.DemoMemento;
import com.yarenty.mvc.DemoMVC;
import com.yarenty.nullobject.DemoNullPattern;
import com.yarenty.observer.DemoObserver;
import com.yarenty.proxy.DemoProxy;
import com.yarenty.service_locator.DemoServiceLocator;
import com.yarenty.singleton.DemoSingleton;
import com.yarenty.state.DemoState;
import com.yarenty.step_builder.DemoStepBuilder;
import com.yarenty.strategy.DemoStrategy;
import com.yarenty.template.DemoTemplate;
import com.yarenty.transfer_object.DemoTransferObject;
import com.yarenty.visitor.DemoVisitor;

/**
 * This is set of examples how ane when to use patterns.
 *
 * @author yarenty
 */
public class Main {

    public static void main(final String[] args) {


        DemoFactory.main(args);
        DemoAbstractFactory.main(args);
        DemoSingleton.main(args);
        DemoBuilder.main(args);
        DemoStepBuilder.main(args);
        DemoBridge.main(args);
        DemoFilter.main(args);
        DemoComposite.main(args);
        DemoDecorator.main(args);
        DemoFacade.main(args);
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
        DemoCompositeEntity.main(args);
        DemoDAO.main(args);
        DemoFrontController.main(args);
        DemoInterceptingFilter.main(args);
        DemoServiceLocator.main(args);
        DemoTransferObject.main(args);


    }
}

package com.yarenty;

import com.yarenty.chainofresponsibility.DemoChain;
import com.yarenty.factory.DemoFactory;
import com.yarenty.flyweight.DemoFlyweight;
import com.yarenty.proxy.DemoProxy;

public class Main {

    public static void main(String[] args) {


        DemoFactory.main(args);

        DemoFlyweight.main(args);
        DemoProxy.main(args);
        DemoChain.main(args);


    }
}

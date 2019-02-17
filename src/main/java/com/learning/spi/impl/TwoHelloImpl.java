package com.learning.spi.impl;

import com.learning.spi.IHello;

public class TwoHelloImpl implements IHello {
    @Override
    public void hello() {
        System.out.println("TwoHelloImpl");
    }
}

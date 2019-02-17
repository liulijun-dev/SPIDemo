package com.learning.spi.impl;

import com.learning.spi.IHello;

public class OneHelloImpl implements IHello {
    @Override
    public void hello() {
        System.out.println("OneHelloImpl");
    }
}

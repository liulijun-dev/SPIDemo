package com.learning.spi.main;

import com.learning.spi.IHello;

import java.util.ServiceLoader;

public class Main {

    public static void main(String[] args) {
        ServiceLoader<IHello> loader = ServiceLoader.load(IHello.class);
        loader.forEach(it->it.hello());
    }
}

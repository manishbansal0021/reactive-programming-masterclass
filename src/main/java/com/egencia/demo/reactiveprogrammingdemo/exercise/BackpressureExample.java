package com.egencia.demo.reactiveprogrammingdemo.exercise;

import org.reactivestreams.Subscription;
import reactor.core.publisher.BaseSubscriber;

import java.io.IOException;

public class BackpressureExample {

    public static void main(String[] args) throws IOException {


        ReactiveSources.stringNumbersFlux()
                .subscribe( new MySubscriber<>() );


        System.out.println("Press a key to end");
        System.in.read();

    }

}

class MySubscriber<T> extends BaseSubscriber<T>{

    protected void hookOnSubscribe(Subscription subscription) {
        System.out.println("Subscribed happend");
        request(1);
    }

    protected void hookOnNext(T value) {
        System.out.println("Received "+ value);
        request(1);
    }

}

package com.egencia.demo.reactiveprogrammingdemo.exercise;

import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.io.IOException;
import java.time.Duration;
import java.util.List;
import java.util.Random;

public class Operators {

    public static void main(String[] args) throws IOException {


//        Thread.currentThread().getId();/
//        System.out.println(Thread.currentThread().getId() +" "+Thread.currentThread().getName() );

        // Map
//        ReactiveSources.stringNumbersFlux()
//                        .map(String::toUpperCase)
//                                .subscribe(num ->{
//                                    System.out.println(num);
//                                    System.out.println(Thread.currentThread().getId() +" "+Thread.currentThread().getName() );
//                                });

        // Filter
//        ReactiveSources.stringNumbersFlux()
//                        .filter(s -> s.length()>3)
//                                .subscribe(System.out::println);

        // FlatMap
//        ReactiveSources.stringNumbersFlux()
//                        .flatMap(s -> Flux.just(s.split("")))
//                        .subscribe(System.out::println);

        // defaultIfEmpty
//        ReactiveSources.stringNumbersFlux()
//                        .filter(s -> s.length()>6)
//                .defaultIfEmpty("Default")
//                .subscribe(System.out::println);

        // switchIfEmpty
//        ReactiveSources.stringNumbersFlux()
//                        .filter(s -> s.length()>6)
//                .switchIfEmpty(Flux.just("Test1", "Test2"))
//                .subscribe(System.out::println);

        // concat
        var fruits = Flux.just("Mango", "Orange");
        var veggies = Flux.just("Tomato", "Lemon");
        var fruit2 = Flux.just("Potato", "Beans");

//        Flux.concat(fruits, veggies)
//                .subscribe(System.out::println);


//        fruits.concatWith(veggies)
//                .subscribe(System.out::println);
//
//        var fruit = Mono.just("Mango");
//        var fruit2 = Mono.just("Orange");
//
//        fruit.concatWith(fruit2)
//                .subscribe(System.out::println);

        // zipWith

//        fruits.zipWith(veggies)
//                .subscribe(System.out::println);

        // zip
//            Flux.zip(fruits, veggies, fruit2)
//                            .map(tuple -> tuple.getT1() + tuple.getT2() + tuple.getT3());


        // DoOn

//        ReactiveSources.stringNumbersFlux()
//                        .doOnNext(item -> System.out.println("item ->"+ item))
//                                .doOnSubscribe(subscription -> System.out.println("Subscription -> " + subscription.toString()))
//                                        .doOnComplete(()-> System.out.println("Completed"))
//                                                .subscribe(System.out::println);



        System.out.println("Press a key to end");
        System.in.read();


    }

}

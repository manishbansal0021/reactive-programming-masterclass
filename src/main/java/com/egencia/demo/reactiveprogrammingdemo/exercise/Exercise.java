package com.egencia.demo.reactiveprogrammingdemo.exercise;

import java.io.IOException;
import java.time.Duration;

public class Exercise {

    public static void main(String[] args) throws IOException {


        // Q1: Print all numbers and users in the ReactiveSources.intNumbersFlux stream

//        ReactiveSources.intNumbersFlux().log().subscribe(System.out::println);
//        ReactiveSources.userFlux().subscribe(System.out::println);


        // Q2: Get all numbers in ReactiveSources.intNumbersFlux stream into a list and print the list and its size

//        var list = ReactiveSources.intNumbersFlux().toStream().toList();
//        System.out.println(list + " " + list.size());


        // Q3: Subscribe to a flux using the error and completion hooks

//            ReactiveSources.intNumbersFlux().subscribe(
//            System.out::println,
//            (e) -> System.out.println(e.getMessage()),
//            () -> System.out.println("Complete.!"));


        // Q4: Get value from Mono into a String variable and give up after 5 seconds

//        String foo = ReactiveSources.unresponsiveMono().block(Duration.ofSeconds(5));


        // Q5: Print values from intNumbersFluxWithException and print a message when error happens

//            ReactiveSources.intNumbersFluxWithException()
//                    .subscribe(System.out::println,
//                            err -> System.out.println("Error happend"));

//            ReactiveSources.intNumbersFluxWithException()
//                    .doOnError(e -> System.out.println("Error!! "+ e.getMessage()))
//                            .subscribe(System.out::println);

        // Q6: Print values from intNumbersFluxWithException and continue on errors

//            ReactiveSources.intNumbersFluxWithException()
//                    .onErrorContinue( (e, item) -> System.out.println("Error!! "+ e.getMessage()) )
//                    .subscribe(System.out::println);


        // Q7: Print values from intNumbersFluxWithException and when error happens, replace with fallback sequence of -1 and -2

//                    ReactiveSources.intNumbersFluxWithException()
//                    .onErrorResume( err -> Flux.just(-1, -2) )
//                    .subscribe(System.out::println);


        // Q8: Print whether the flux ended with an error or on complete

//                    ReactiveSources.intNumbersFluxWithException()
//                    .onErrorContinue( (e, item) -> System.out.println("Error!! "+ e.getMessage()) )
//                            .doFinally(signalType -> {
//                                if(signalType == SignalType.ON_COMPLETE){
//                                    System.out.println("Completed");
//                                }
//                                else if(signalType == SignalType.ON_ERROR){
//                                    System.out.println("Error");
//                                }
//                            })
//                    .subscribe(System.out::println);


        // Q9: Transform a sequence of sums of adjacent two numbers

//        ReactiveSources.intNumbersFlux().buffer(2).map(list -> list.get(0)+ list.get(1))
//                        .subscribe(System.out::println);

        System.out.println("Press a key to end");
        System.in.read();
    }

}

package com.oxx.chap3.lambda;

import java.time.Duration;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;
import java.util.function.Predicate;

public class demo {

    private void testTime(){
        Duration duration = Duration.ofMinutes(3);
        Duration.f
    }


    public static void main(String[] args){
        Function<String, Integer> strToInt = Integer::parseInt;
        BiPredicate<List<String>, String> contains = List::contains;

        Predicate<String> isNotEmpty = String::isEmpty;

    }
}

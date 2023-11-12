package com.opennuri.studymodernjava.chapter7;

import java.util.stream.Stream;

public class ParallelStreams {

    public static long iterativeSum(long n) {
        long result = 0;
        for (long i = 0;  i <= n; i++) {
            result += i;
        }
        return result;
    }

    public static long sequentialSum(long n) {
        return Stream.iterate(1L, i -> i + 1).limit(n)
                .reduce(Long::sum).orElse(0L);
    }
}

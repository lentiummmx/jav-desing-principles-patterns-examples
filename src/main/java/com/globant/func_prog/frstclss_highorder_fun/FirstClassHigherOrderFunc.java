package com.globant.func_prog.frstclss_highorder_fun;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FirstClassHigherOrderFunc {
    public List<Integer> orderWithoutLambada(List<Integer> numbers) {
        Collections.sort(numbers, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        return numbers;
    }

    public List<Integer> orderWithLambada(List<Integer> numbers) {
        Collections.sort(numbers, (o1, o2) -> o1.compareTo(o2));
        return numbers;
    }
}

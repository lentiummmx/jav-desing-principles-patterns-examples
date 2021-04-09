package com.globant.func_prog.pure_func;

import java.util.List;
import java.util.stream.Collectors;

public class PureFunctions {

    public static Integer sum(List<Integer> numbers) {
        return numbers.stream().collect(Collectors.summingInt(Integer::intValue));
        //return numbers.stream().mapToInt(Integer::intValue).sum();
    }

}

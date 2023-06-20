package com.epam.mjc;

import java.util.ArrayList;
import java.util.List;

public class InterfaceCreator {

    public Operation<Integer> divideBy(Integer divider) {
        return x->{
            List<Integer> answ = new ArrayList<>();
            for (Integer i: x
                 ) {
                answ.add(i/3);
            }
            return answ;
        };
    }
}

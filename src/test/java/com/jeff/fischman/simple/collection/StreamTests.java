package com.jeff.fischman.simple.collection;

import org.junit.Assert;
import org.junit.Test;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class StreamTests {
    @Test
    public void testBasic() {
        Assert.assertTrue(true);
    }

    @Test
    public void printList() {
        List<Integer> list = create();
        list.forEach(System.out::println);
    }

    private List<Integer>  create() {
        List<Integer> res = IntStream.range(0, 10).boxed().collect(Collectors.toList());
        return res;
    }
}

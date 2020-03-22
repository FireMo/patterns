package com.streamTest;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

@Data
@AllArgsConstructor
public class Dog {
    private String name;
    private Integer price;

    public static void main(String[] args) {
        //将集合中的元素按照价格降序排序，如果价格相同则按照名字升序排序

        List<Dog> dogs = new ArrayList<>();
        dogs.add(new Dog("bob", 100));
        dogs.add(new Dog("woody", 100));
        dogs.add(new Dog("ali", 50));
        dogs.add(new Dog("tom", 100));

        dogs.stream().sorted(Comparator
                .comparing(Dog::getPrice) //先按照价格升序
                .reversed() //再倒序
                .thenComparing(Dog::getName) //最后按照name升序
        ).forEach(System.out::println);
    }
}

package com.demo.juc;

import java.util.Arrays;
import java.util.List;
import java.util.function.Supplier;

/**
 * @author jack.l
 * @date 2021/8/20 10:10 上午
 * Description
 */
public class Car {
    //Supplier是jdk1.8的接口，这里和lamda一起使用了
    public static Car create(final Supplier<Car> supplier) {
        return supplier.get();
    }

    public static void collide(final Car car) {
        System.out.println("Collided " + car.toString());
    }

    public void follow(final Car another) {
        System.out.println("Following the " + another.toString());
    }

    public void repair(Car car) {
        System.out.println("Repaired " + this.toString());
    }

    public static void main(String[] args) {
        final Car car = Car.create( Car::new );
        final List< Car > cars = Arrays.asList( car );
        cars.forEach( Car::collide );
        //cars.forEach( Car::repair );
    }
}

package com.example.design.create.factory;

/**
 * @author yk
 * @date 2020/9/4 14:21
 */
// 简单工厂，抽象工厂，建造者  基本都差不多 这样 变种而已
public class Test {
    public static void main(String[] args) {
        Car car=getCar(CarType.DABEN);
        car.run();
    }

    private static Car getCar(CarType carType) {
        switch (carType){
            case BAOMA:
                return new BaoMaCar();
            case DABEN:
                return new BenCar();
        }
        return null;
    }

}

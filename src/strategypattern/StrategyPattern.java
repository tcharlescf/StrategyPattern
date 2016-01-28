/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package strategypattern;

/**
 *
 * @author Charles
 */
public class StrategyPattern {

    public static void main(String[] args) {
        Duck mallardDuck = new MallardDuck();
        mallardDuck.display();
        mallardDuck.performFly();
        System.out.println("---------------------");
        mallardDuck.setFlyBehavior(new FlyNoWay());
        mallardDuck.performFly();
    }
    
}

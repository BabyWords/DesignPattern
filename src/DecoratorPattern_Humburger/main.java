package DecoratorPattern_Humburger;

import DecoratorPattern_Humburger.compoment.Beverage;
import DecoratorPattern_Humburger.compoment.Espresso;
import DecoratorPattern_Humburger.decorator.Mocha;
import DecoratorPattern_Humburger.decorator.Whip;

/**
 * @author 吴俊文
 * @Description
 * @Date create in:2017/11/28 10:30
 * @e-mail wujunwen@snxun.com
 */
public class main {
    public static  void main(String args[]){
        Beverage beverage=new Espresso();
        System.out.println(beverage.getDescription()+beverage.cost());
        beverage=new Mocha(beverage);
        beverage=new Whip(beverage);
        System.out.println(beverage.getDescription()+beverage.cost());


    }
}

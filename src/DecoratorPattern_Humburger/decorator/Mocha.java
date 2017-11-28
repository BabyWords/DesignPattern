package DecoratorPattern_Humburger.decorator;

import DecoratorPattern_Humburger.compoment.Beverage;

/**
 * @author 吴俊文
 * @Description
 * @Date create in:2017/11/28 10:02
 * @e-mail wujunwen@snxun.com
 */
public class Mocha extends  CondimentDecorator {
    Beverage beverage;
    @Override
    public String getDescription() {
        return beverage.getDescription()+",Mocha";
    }

    @Override
    public double cost() {
        return 0.20+beverage.cost();
    }

    public Mocha(Beverage beverage) {
        this.beverage=beverage;
    }
}

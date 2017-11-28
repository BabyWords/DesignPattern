package DecoratorPattern_Humburger.decorator;

import DecoratorPattern_Humburger.compoment.Beverage;

/**
 * @author 吴俊文
 * @Description
 * @Date create in:2017/11/28 10:17
 * @e-mail wujunwen@snxun.com
 */
public class Whip extends CondimentDecorator {
    Beverage beverage;
    public Whip(Beverage beverage) {
        this.beverage=beverage;
    }

    @Override
    public String getDescription() {
        return beverage.getDescription()+",Whip";
    }

    @Override
    public double cost() {
        return beverage.cost()+.36;
    }
}

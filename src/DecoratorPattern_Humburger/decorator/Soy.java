package DecoratorPattern_Humburger.decorator;

import DecoratorPattern_Humburger.compoment.Beverage;

/**
 * @author 吴俊文
 * @Description
 * @Date create in:2017/11/28 10:06
 * @e-mail wujunwen@snxun.com
 */
public class Soy extends CondimentDecorator{
    Beverage beverage;
    @Override
    public String getDescription() {
        return beverage.getDescription()+",Soy";
    }

    @Override
    public double cost() {
        return 0.50+beverage.cost();
    }

    public Soy(Beverage beverage) {
        this.beverage=beverage;
    }
}

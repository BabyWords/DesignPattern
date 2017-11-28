package DecoratorPattern_Humburger.decorator;

import DecoratorPattern_Humburger.compoment.Beverage;

/**
 * @author 吴俊文
 * @Description
 * @Date create in:2017/11/28 9:56
 * @e-mail wujunwen@snxun.com
 */
public abstract class CondimentDecorator extends Beverage{
    @Override
    public abstract String getDescription();
}

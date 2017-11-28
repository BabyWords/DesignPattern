package DecoratorPattern_Humburger.compoment;

/**
 * @author 吴俊文
 * @Description
 * @Date create in:2017/11/28 9:59
 * @e-mail wujunwen@snxun.com
 */
public class HouseBlend extends Beverage{
    public HouseBlend() {
        description="HouseBlend coffee";
    }

    @Override
    public double cost() {
        return 0.89;
    }
}

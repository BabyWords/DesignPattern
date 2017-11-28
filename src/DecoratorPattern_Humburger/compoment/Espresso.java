package DecoratorPattern_Humburger.compoment;

/**
 * @author 吴俊文
 * @Description
 * @Date create in:2017/11/28 9:58
 * @e-mail wujunwen@snxun.com
 */
public class Espresso extends  Beverage{
    public Espresso() {
        description="Espresso";
    }

    @Override
    public double cost() {
        return 1.99;
    }
}

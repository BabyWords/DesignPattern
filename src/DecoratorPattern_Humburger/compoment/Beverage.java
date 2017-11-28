package DecoratorPattern_Humburger.compoment;

/**
 * @author 吴俊文
 * @Description
 * @Date create in:2017/11/28 9:53
 * @e-mail wujunwen@snxun.com
 */
public abstract class Beverage {
    String description ="Unknow beverage";
    public String getDescription(){
        return description;
    }
    public abstract double cost();
}

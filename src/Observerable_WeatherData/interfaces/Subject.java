package Observerable_WeatherData.interfaces;

/**
 * @author 吴俊文
 * @Description
 * @Date create in:2017/11/27 13:47
 * @e-mail wujunwen@snxun.com
 */
public interface Subject {
    public void registerObserver(Observer o);

    public void removeObserver(Observer o);

    public void notifyObservers();
}

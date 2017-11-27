package Observerable_WeatherData.concretobserver;

import Observerable_WeatherData.interfaces.Observer;
import Observerable_WeatherData.interfaces.Subject;


/**
 * @author 吴俊文
 * @Description
 * @Date create in:2017/11/27 13:46
 * @e-mail wujunwen@snxun.com
 */
public class ConcreteObserver implements  Observer{
    private float temperature;
    private final Subject subject;

    public ConcreteObserver(final Subject subject)
    {
        this.subject = subject;
        this.subject.registerObserver(this);
    }

    public float getTemperature()
    {
        return temperature;
    }

    public void setTemperature(final float temperature)
    {
        this.temperature = temperature;
    }

    @Override
    public void update(final float temperature)
    {
        this.temperature = temperature;
        display();
    }

    public void display(){
        System.out.println("tempereture:"+temperature);
    }
}

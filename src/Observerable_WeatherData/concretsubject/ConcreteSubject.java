package Observerable_WeatherData.concretsubject;

import Observerable_WeatherData.interfaces.Observer;
import Observerable_WeatherData.interfaces.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * @author 吴俊文
 * @Description
 * @Date create in:2017/11/27 13:49
 * @e-mail wujunwen@snxun.com
 */
public class ConcreteSubject implements Subject {

    private final List<Observer> observers;
    private float temperature;

    public float getTemperature()
    {
        return temperature;
    }

    private void temperatureChanged()
    {
        this.notifyObservers();
    }

    public void setTemperature(final float temperature)
    {
        this.temperature = temperature;
        this.temperatureChanged();
    }

    public ConcreteSubject()
    {
        observers = new ArrayList<Observer>();
    }

    @Override
    public void registerObserver(final Observer o)
    {
        observers.add(o);
    }

    @Override
    public void removeObserver(final Observer o)
    {
        if (observers.indexOf(o) >= 0)
        {
            observers.remove(o);
        }
    }

    @Override
    public void notifyObservers()
    {
        for (final Observer o : observers)
        {
            o.update(temperature);
        }
    }
}

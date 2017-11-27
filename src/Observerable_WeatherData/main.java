package Observerable_WeatherData;

import Observerable_WeatherData.concretobserver.ConcreteObserver;
import Observerable_WeatherData.concretsubject.ConcreteSubject;

/**
 * @author 吴俊文
 * @Description
 * @Date create in:2017/11/27 13:53
 * @e-mail wujunwen@snxun.com
 */
public class main {
    public static  void main(String args[]){
        ConcreteSubject concreteSubject=new ConcreteSubject();
        ConcreteObserver concreteObserver=new ConcreteObserver(concreteSubject);
        concreteSubject.setTemperature(200);
        concreteSubject.setTemperature(211);
    }
}

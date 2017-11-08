package DuckProblem_Stragety.Pojo;

import DuckProblem_Stragety.Interface.FlyBehavior;
import DuckProblem_Stragety.Interface.QuackBehavior;

public abstract class Duck {
    FlyBehavior flyBehavior;
    QuackBehavior quackBehavior;
    public void fly(){
        flyBehavior.fly();
    };
    public void quack(){
quackBehavior.quack();
    }
}

package DuckProblem_Stragety.MyStrategy_Learning.Behavior;

import DuckProblem_Stragety.MyStrategy_Learning.Interface.MovieStragety;

/**
 * @author 吴俊文
 * @Description
 * @Date create in:2017/11/6 11:05
 * @e-mail wujunwen@snxun.com
 */
public class CartoonFilm implements MovieStragety {
    @Override
    public void watchmovie() {
        System.out.println("看动物城");
    }
}

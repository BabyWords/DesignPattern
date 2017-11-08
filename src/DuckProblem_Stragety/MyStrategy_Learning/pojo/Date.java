package DuckProblem_Stragety.MyStrategy_Learning.pojo;

import DuckProblem_Stragety.MyStrategy_Learning.Behavior.ChineseFood;
import DuckProblem_Stragety.MyStrategy_Learning.Interface.DinnerStragety;
import DuckProblem_Stragety.MyStrategy_Learning.Interface.HotelStragety;
import DuckProblem_Stragety.MyStrategy_Learning.Interface.MovieStragety;

/**
 * @author 吴俊文
 * @Description
 * @Date create in:2017/11/6 11:06
 * @e-mail wujunwen@snxun.com
 */
public abstract class Date {
    DinnerStragety dinnerStragety;
    HotelStragety hotelStragety;
    MovieStragety movieStragety;

    public void havedinner() {
        dinnerStragety.havedinner();
    }

    public void gohotel() {
        hotelStragety.gohotel();
    }

    public void watchmovie() {
        movieStragety.watchmovie();
    }
}

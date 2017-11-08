package DuckProblem_Stragety.MyStrategy_Learning.pojo;

import DuckProblem_Stragety.MyStrategy_Learning.Behavior.CartoonFilm;
import DuckProblem_Stragety.MyStrategy_Learning.Behavior.ChineseFood;
import DuckProblem_Stragety.MyStrategy_Learning.Behavior.Hantinghotel;
import DuckProblem_Stragety.MyStrategy_Learning.Behavior.SubaHotel;
import DuckProblem_Stragety.MyStrategy_Learning.Interface.MovieStragety;

/**
 * @author 吴俊文
 * @Description
 * @Date create in:2017/11/6 11:08
 * @e-mail wujunwen@snxun.com
 */
public class Mydate extends Date{

    public Mydate() {
        dinnerStragety=new ChineseFood();
        movieStragety=new CartoonFilm();
        hotelStragety=new Hantinghotel();
    }
}

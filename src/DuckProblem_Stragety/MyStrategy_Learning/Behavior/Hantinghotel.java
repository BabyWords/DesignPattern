package DuckProblem_Stragety.MyStrategy_Learning.Behavior;

import DuckProblem_Stragety.MyStrategy_Learning.Interface.HotelStragety;

/**
 * @author 吴俊文
 * @Description
 * @Date create in:2017/11/6 11:16
 * @e-mail wujunwen@snxun.com
 */
public class Hantinghotel implements HotelStragety {
    @Override
    public void gohotel() {
        System.out.println("去汉庭吧！");
    }
}

package DuckProblem_Stragety.MyStrategy_Learning.Behavior;

import DuckProblem_Stragety.MyStrategy_Learning.Interface.DinnerStragety;

/**
 * @author 吴俊文
 * @Description
 * @Date create in:2017/11/6 10:38
 * @e-mail wujunwen@snxun.com
 */
public class ChineseFood implements DinnerStragety{
    @Override
    public void havedinner() {
        System.out.println("吃中餐");
    }
}

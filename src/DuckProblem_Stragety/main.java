package DuckProblem_Stragety;

import DuckProblem_Stragety.MyStrategy_Learning.Behavior.ChineseFood;
import DuckProblem_Stragety.MyStrategy_Learning.Behavior.Hantinghotel;
import DuckProblem_Stragety.MyStrategy_Learning.Behavior.SubaHotel;
import DuckProblem_Stragety.MyStrategy_Learning.pojo.Date;
import DuckProblem_Stragety.MyStrategy_Learning.pojo.Mydate;
import DuckProblem_Stragety.Pojo.Duck;
import DuckProblem_Stragety.Pojo.GreenDuck;

public class main {
    public static void main(String args[]) {
        Date mydate = new Mydate();
        mydate.setHotelStragety(new Hantinghotel());
        mydate.havedinner();
        mydate.watchmovie();
        mydate.gohotel();
    }
}

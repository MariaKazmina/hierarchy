package class_up;

public class Bosses implements Damage {

    final int damage_boss = 60;
    int power = 2000;


    public int getDamage()//узнать константный урон
    {
        return damage_boss;
    }

    public void damage(int damage)//получение урона
    {
        if(power>0)
        {
            power = power - damage;
        }

    }


    public  void doDamage(int health_enemy) //нанесение урона
    {
        if(health_enemy>0)
        {
            health_enemy -= damage_boss;

        }
    }



    public int mega(int health_enemy)//мега-атака, возвращает значение HP-противника
    {
        if(power<=1000)
        {
            health_enemy -= 200;
        }
        return health_enemy;

    }
    public void healing() //лечение
    {
        while(power<=2000)
        {
            power += 50;
        }
    }


}

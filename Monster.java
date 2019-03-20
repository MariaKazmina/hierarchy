package class_up;

public class Monster implements Damage {


    final  int damage_of_monster = 40; //константный урон
    int power = 1500;

    public int getDamage()//узнать константный урон
    {
        return damage_of_monster;
    }

    public void damage(int damage)//получение урона
    {
        if(power>0)
        {
            power = power - damage;
        }

    }
    public void healing() //лечение
    {
        while(power<=500)
        {
            power += 20;
        }
    }

    public  void doDamage(int health_enemy) //нанесение урона
    {
        if(health_enemy>0)
        {
            health_enemy -= damage_of_monster;

        }
    }

    public int mega(int health_enemy)//мега-атака, возвращает значение HP-противника
    {
        if(power<=500)
        {
            health_enemy -= 100;
        }
        return health_enemy;
    }

}

package class_up;

public class Warriors_animal implements Damage {




    final  int damage_of_animal = 7; //константный урон
    int power = 500;

    public int getDamage()//узнать константный урон
    {
        return damage_of_animal;
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
            power += 10;
        }
    }

    public  void doDamage(int health_enemy) //нанесение урона
    {
        if(health_enemy>0)
        {
            health_enemy -= damage_of_animal;

        }
    }
    public int mega(int health_enemy)//мега-атака, возвращает значение HP-противника
    {
        if(power<=200)
        {
            health_enemy -= 30;
        }
        return health_enemy;
    }

}

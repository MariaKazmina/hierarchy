package class_up;

public class Warrior extends Human implements Damage {

    final  int damage_of_warrior = 15; //константный урон

    public int getDamage()//узнать константный урон
    {
       return damage_of_warrior;
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
        while(power<=1000)
        {
            power += 10;
        }
    }

    public  void doDamage(int health_enemy) //нанесение урона
    {
        if(health_enemy>0)
        {
            health_enemy -= damage_of_warrior;

        }
    }
    public int mega(int health_enemy)//мега-атака, возвращает значение HP-противника
    {
        if(power<=300)
        {
            health_enemy -= 50;
        }
        return health_enemy;
    }




}

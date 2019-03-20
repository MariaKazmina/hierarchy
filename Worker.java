package class_up;

public class Worker extends Human implements Damage{


    final  int damage_of_worker = 10; //константный урон

    public int getDamage()//узнать константный урон
    {
        return damage_of_worker;
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
            health_enemy -= damage_of_worker;

        }
    }

}

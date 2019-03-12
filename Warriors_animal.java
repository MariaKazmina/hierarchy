package class_up;

public class Warriors_animal implements Damage {




    final  int damage_of_animal = 7; //константный урон
    int power = 500;

    public int get_damage()//узнать константный урон
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

    public  void do_damage(int health_enemy) //нанесение урона
    {
        if(health_enemy>0)
        {
            health_enemy -= damage_of_animal;

        }
    }

}

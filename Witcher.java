package class_up;

public class  Witcher extends Human {

    final  int damage_of_witcher = 25;
    int magic_power = 1000;
    boolean super_pow;

    public int get_damage()//узнать константный урон
    {
        return damage_of_witcher;
    }
    public void superpower_set() //является ведьмой
    {
        this.super_pow = true;
    }

    public void mag_damage(int damage) //получение урона
    {
        this.magic_power = this.magic_power-damage;

    }
    public void magic_spell(int health_enemy) //нанесение урона
    {
        if(magic_power>0)
        {
            health_enemy = health_enemy - 10;
            magic_power = magic_power - 10;

        }
        else System.out.println("Youre magic power end");

    }
    public void healing() //лечение
    {
        while(magic_power<=1000)
        {
            magic_power += 20;
        }
    }

    public int Mega(int health_enemy)//мега-атака, возвращает значение HP-противника
    {
        if(power<=500)
        {
            health_enemy -= 80;
        }
        return health_enemy;
    }



}

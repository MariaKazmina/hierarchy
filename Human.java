package class_up;

public abstract class Human
{
    private int age;
    private char sex;
    private String job;
    private  boolean superpowers;
    private long power;

    public int get_age()
    {
        return age;
    }
    public void set_age(int Age)
    {
        this.age = Age;
    }
    public char get_sex()
    {
        return sex;
    }
    public void set_sex(char S)
    {
        this.sex = S;
    }
    public String get_job()
    {
        return job;
    }
    public void set_job(String J)
    {
        this.job = J;
    }

    public  boolean is_superpow()
    {
        return superpowers;
    }
    public  void set_superpow(boolean SP)
    {
        this.superpowers = SP;
    }
    public long get_power()
    {
        return power;
    }
    public void set_power(long P)
    {
        this.power = P;
    }



}

package Modelo;


public class Fatorial extends absPropriedades implements intMetodos
{

    public Fatorial(Integer num)
    {
        super(num);
        this.executar();
    }

    @Override
    public void executar()
    {
        int base = this.num;
        for (int i = 1; i < base; i++)
        {
            num *=i;
        }
    }
}

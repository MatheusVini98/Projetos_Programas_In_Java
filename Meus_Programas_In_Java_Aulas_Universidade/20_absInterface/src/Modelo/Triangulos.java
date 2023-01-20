package Modelo;

public class Triangulos extends absPropriedades
{   
    private String resposta;
            
    public Triangulos(Double l1, Double l2, Double l3)
    {
        super(l1, l2, l3);
    }
    
    @Override
    public void executar()
    { 
        if (this.l1.equals(this.l2) && this.l2.equals(this.l3   ))
            this.resposta = "Equilátero";
        else
            if (!this.l1.equals(this.l2) &&
                    !this.l2.equals(this.l3) &&
                    !this.l1.equals(this.l3))
                this.resposta = "Escaleno";
            else
                this.resposta = "Isosceles";
    }

    @Override
    public String toString()
    {
        return resposta ;
    }

    
    
}

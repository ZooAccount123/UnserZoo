import java.util.ArrayList;


public class Zoo
{
    private ArrayList<Tier> tiere;

    public Zoo()
    {
        tiere = new ArrayList<Tier>();
    }

    public void tierHinzufuegen(Tier t) {
        tiere.add(t);
    }
    
    public void alleTiereGebenLautVonSich() {
        for (Tier t: tiere) {
            System.out.println(t.nameGeben()+": "+t.lautGeben());
        }
    }
}

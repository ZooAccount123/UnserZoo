public abstract class Tier
{
    private String name;

    public Tier(String nameNeu)
    {
        name = nameNeu;
    }

    public String nameGeben() {
        return name;
    }
    
    public abstract String lautGeben();
}

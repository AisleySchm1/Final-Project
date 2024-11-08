package finalproject;

public class Weapon 
{
	private String name;
    private String explanation;
    private int damage;

    public Weapon(String n, String e, int d)
      {
        name = n;
        explanation = e;
        damage = d;
      }

      public String getName()
      {
        return name;
      }

      public void setName(String n)
      {
        name = n;
      }

    public String getExplanation()
    {
      return explanation;
    }

    public void setExplanation(String e)
    {
      explanation = e;
    }

       public int getDamage()
      {
       return damage; 
      }
      public void setDamage(int d)
      {
        damage = d;
       }
}

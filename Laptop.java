
public class Laptop
{
    private String hersteller;
    private int kosten;
    private boolean neu;
 
    public String getHersteller()
    {
        return hersteller;
    }
    
    public int getKosten()
    {
        return kosten;
    }
    
    public boolean getNeu()
    {
        return neu;
    }
    
        public void setHersteller(String neuHersteller)
    {
        hersteller = neuHersteller;
    }
    
            public void setHersteller(int neuKosten)
    {
        kosten = neuKosten;
    }
    
            public void setHersteller(boolean neuNeu)
    {
        neu = neuNeu;
    }
}
//Griffin Heatlet
public class PopcornOrders
{
    private String variety;
    private int numOrdered;

    public PopcornOrders(String v, int n)
    {
        variety = v;
        numOrdered = n;
    }

    public String getVariety()
    {
        return variety;
    }

    public int getNumOedered()
    {
        return numOrdered;
    }
}
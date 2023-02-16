//Griffin Heatlet
import java.util.*;
public class MasterList 
{
    private ArrayList<PopcornOrders> orders;

    public MasterList()
    {
        orders = new ArrayList<PopcornOrders>();
    }

    public void addOrder(PopcornOrders order)
    {
        orders.add(order);
    }

    public int getTotalOrders()
    {
        int total = 0;
        for(PopcornOrders pop : orders)
        {
            total += (pop.getNumOedered());
        }
        return total;
    }

    public int removeVariety(String v)
    {
        int counter = 0;
        for(int i = 0; i < orders.size(); i++)
        {
            if(orders.get(i).getVariety().equals(v))
            {
                orders.remove(i);
                i--;
                counter ++;
            }
        }
        return counter;
    }

    public String toString()
    {
        String result = "";
        for(PopcornOrders pop : orders)
        {
            result += ("\n" + pop.getVariety());
        }
        if(orders.size() == 0)
        {
            result = "There are no orders in yet";
        }
        return result;
    }
}

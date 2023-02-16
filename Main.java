public class Main 
{
    public static void main(String[]args)
    {
        System.out.println("popcorn2023");
        MasterList popcorn2023 = new MasterList();
        popcorn2023.addOrder(new PopcornOrders("Jalapeno Cheese", 1));
        popcorn2023.addOrder(new PopcornOrders("Butter Microwave", 3));
        popcorn2023.addOrder(new PopcornOrders("Butter Microwave", 2));
        popcorn2023.addOrder(new PopcornOrders("Caramel With Sea Salt", 2));
        popcorn2023.addOrder(new PopcornOrders("Caramel With Sea Salt", 5));
        popcorn2023.addOrder(new PopcornOrders("Kettle Corn", 4));
        System.out.println(popcorn2023.toString());
        System.out.println();
        System.out.println("Total orders: " + popcorn2023.getTotalOrders());
        System.out.println("Removed Butter Microwave: " + popcorn2023.removeVariety("Butter Microwave"));
        System.out.println("Removed Sea Salt Splash: " + popcorn2023.removeVariety("Sea Salt Splash"));
        System.out.println("Removed Kettle Corn: " + popcorn2023.removeVariety("Kettle Corn"));
        System.out.println();
        System.out.println(popcorn2023.toString());

        System.out.println("\npopcorn2024");
        MasterList popcorn2024 = new MasterList();
        System.out.println("Total orders: " + popcorn2024.getTotalOrders());
        System.out.println("Removed Butter Microwave: " + popcorn2024.removeVariety("Butter Microwave"));
        System.out.println("Removed Sea Salt Splash: " + popcorn2024.removeVariety("Sea Salt Splash"));
        System.out.println("Removed Kettle Corn: " + popcorn2024.removeVariety("Kettle Corn"));
        System.out.println(popcorn2024.toString());
    }
}

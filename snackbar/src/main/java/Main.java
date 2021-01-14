public class Main
{

    public static void main(String[] args)
    {
        spendingCustomers();


    }

    private static void spendingCustomers()
    {
        Customer April = new Customer("April",61.31);
        Customer Joey = new Customer("Joey",107.92);
        Customer Tim = new Customer("Tim",44.67);
        Customer Dan = new Customer("Dan",27.11);


        VendingMachine Food = new VendingMachine("Food");
        VendingMachine Drink = new VendingMachine("Drink");


        Snack Chips = new Snack("Chips",10,1.00,Food.getId());
        Snack Candy = new Snack("Candy",16,1.50,Food.getId());
        Snack Popcorn = new Snack("Popcorn",20,2.00,Food.getId());

        Snack Water = new Snack("Water",20,2.00,Drink.getId());
        Snack Soda = new Snack("Soda",24,1.50,Drink.getId());

        Food.vendor(Dan,Water,2);
        Food.vendor(April,Soda,2);
        Food.vendor(Joey,Popcorn,4);
        Food.vendor(Tim,Soda,3);
        April.addCash(5);
        System.out.println(April.getCashTotal());
        Food.vendor(Tim,Candy,5);
        Candy.addQuantity(5);
        System.out.println(Candy.getQuantity());
        Food.vendor(Tim,Chips,6);


    }

}
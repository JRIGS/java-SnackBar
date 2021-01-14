public class VendingMachine

    {
    private static int maxId = 0;
    private int id;
    private String name;
    public VendingMachine(String name)

    {
        maxId++;
        this.id = maxId;
        this.name = name;

    }

    public static void vendor(Customer customer,Snack snack, int quantity)
    {
        customer.buySnack(quantity*snack.getCost());
        snack.setQuantity(snack.getQuantity() - quantity);
        System.out.println(customer.getName() + " balance: " + customer.getCashTotal());
        System.out.println("New quantity " +snack.getName()+" "+ snack.getQuantity());
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public String getName()
    {
        return name;
    }

    public void setName(String name)
    {
        this.name = name;

    }

}
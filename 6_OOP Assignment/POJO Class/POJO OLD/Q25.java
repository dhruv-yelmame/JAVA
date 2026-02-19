/*Q25. Suppose consider we are working on billing Application and we have following types of classes 
1. Product with field id,name and price and it is POJO class 
2. Customer with field id, name address,email , contact and it is POJO class
3. Shop with following methods 
void storeProducts(Customer c,Product …p): this method can accept infinite product list
void calBill(): this method can calculate bill with grand total and your output should be 
*/


class Product
{
    private int id;
    private String name;
    private int price;


    Product(int id, String name, int price)
    {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    int getId()
	{ 
		return id; 
	}
    String getName() 
	{
		return name; 
	}
    int getPrice()
	{
		return price; 
	}
}


class Customer
{
    private int id;
    private String name;
    private String address;
    private String email;
    private String contact;

    Customer(int id, String name, String address, String email, String contact)
    {
        this.id = id;
        this.name = name;
        this.address = address;
        this.email = email;
        this.contact = contact;
    }

    int getId()
	{
		return id; 
	}
    String getName() 
	{
		return name; 
	}
    String getAddress() 
	{
		return address; 
	}
    String getEmail() 
	{ 
		return email; 
	}
    String getContact()
	{ 
		return contact; 
	}
}


class Shop
{
    private Customer customer;
    private Product[] products;

    void storeProducts(Customer c, Product ...p)
    {
        this.customer = c;
        this.products = p;
    }

    void calBill()
    {
        double total = 0;

        System.out.println("------- CUSTOMER BILL -------");
        System.out.println("Customer ID   : " + customer.getId());
        System.out.println("Customer Name : " + customer.getName());
        System.out.println("Email         : " + customer.getEmail());
        System.out.println("Contact       : " + customer.getContact());
        System.out.println("--------------------------------");
        System.out.println("Items Purchased:");
        System.out.println("--------------------------------");

        for (int i = 0; i < products.length; i++)
        {
            Product p = products[i];
            System.out.println(p.getId() + "  " + p.getName() + "  Rs." + p.getPrice());
            total += p.getPrice();
        }

        System.out.println("--------------------------------");
        System.out.println("Grand Total : Rs." + total);
        System.out.println("--------------------------------");
    }
}

public class Q25
{
    public static void main(String x[])
    {
        Customer c = new Customer(101, "Dhruv", "Pune", "dhruv5@.com", "8010865586");

        Product p1 = new Product(1, "Laptop", 50000);
        Product p2 = new Product(2, "Mouse", 500);
        Product p3 = new Product(3, "Keyboard", 1000);

        Shop shop = new Shop();
        shop.storeProducts(c, p1, p2, p3);
        shop.calBill();
    }
}
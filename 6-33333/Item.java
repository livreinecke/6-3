
public class Item

{

    public String name;

    public double price;

    public int quantity;


    // -------------------------------------------------------

    //  Create a new item with the given attributes.

    // -------------------------------------------------------

    public Item (String itemName, double itemPrice, int numPurchased)

    {

        name = itemName;

        price = itemPrice;

        quantity = numPurchased;

    }


    // -------------------------------------------------------

    //   Return a string with the information about the item

    // -------------------------------------------------------

    public String toString ()

    {

        //Your code goes here
        String result =  "The name is " + name;
        result += "The price is " + price;
        result += "The number of purchases is " + quantity;
        return result;
        
    }


    } 


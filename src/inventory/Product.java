package inventory;

public class Product {
      private int itemNumber;// unique value for identification
      private String name;    //name of the product
      private int qtdInStock; //quantity in stock
      private double price; //price of the product
      
      //construct method
      public Product() {}
      
      public Product(int number, String name, int qtd, double price)
      {
    	  this.itemNumber = number;
    	  this.name = name;
    	  this.qtdInStock = qtd;
    	  this.price = price;
    	  
      }

	public int getItemNumber() {
		return itemNumber;
	}

	public void setItemNumber(int itemNumber) {
		this.itemNumber = itemNumber;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getQtdInStock() {
		return qtdInStock;
	}

	public void setQtdInStock(int qtdInStock) {
		this.qtdInStock = qtdInStock;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
    
    public String toString()
    {
    	return "\nItem Number: " + this.itemNumber
    			+"\nName: "+ this.name
    			+"\nQantity In Stock " + this.qtdInStock
    			+"\nprice " +this.price;
    			
    }
}

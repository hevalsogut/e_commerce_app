
package ECommerceApplication;

public class Product {
    private String name;
    private String color;
    private String category;
    private int stockQuantity;
    private double weight;
    private String description;
    
    public Product(String name,String color,String category,
                int stockQuantity,double weight,String description){
        this.name = name;
        this.color = color;
        this.category = category;
        this.stockQuantity = stockQuantity;
        this.weight = weight;
        this.description = description;
    }
   public void StockControl(int purchasedQuantity) {
        if (stockQuantity >= purchasedQuantity) {
        } else {
            System.out.println("Insufficient stock for " + name + "."+ "The order has not recieved");
        }
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getCategory() {
        return category;
    }
    public void setCatagory(String category) {
        this.category = category;
    }

    public int getStock() {
        return stockQuantity;
    }

    public void setStock(int stock) {
        this.stockQuantity = stock;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    
}

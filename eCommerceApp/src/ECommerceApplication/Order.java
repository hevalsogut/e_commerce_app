
package ECommerceApplication;

public class Order {
    private User orderingUser;
    private Product orderedProduct;
    private CreditCard creditCard;
    private int purchasedQuantity;
    
    public Order(User orderingUser, Product orderedProduct, CreditCard creditCard, int purchasedQuantity) {
        this.orderingUser = orderingUser;
        this.orderedProduct = orderedProduct;
        this.creditCard = creditCard;
        this.purchasedQuantity = purchasedQuantity;
    }
    
    public void processOrder() {
        orderedProduct.StockControl(purchasedQuantity);
        orderingUser.orderProduct(orderedProduct, purchasedQuantity);
    }

    public User getOrderingUser() {
        return orderingUser;
    }

    public void setOrderingUser(User orderingUser) {
        this.orderingUser = orderingUser;
    }

    public Product getOrderedProduct() {
        return orderedProduct;
    }

    public void setOrderedProduct(Product orderedProduct) {
        this.orderedProduct = orderedProduct;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

    public int getPurchasedQuantity() {
        return purchasedQuantity;
    }

    public void setPurchasedQuantity(int purchasedQuantity) {
        this.purchasedQuantity = purchasedQuantity;
    }
}

package ECommerceApplication;

import java.util.ArrayList;

public class User {
    private String username;
    private String name;
    private String surname;
    private String dateOfBirth;
    private String password;
    private String email;
    private String workAddress;
    private String homeAddress;
    private ArrayList<Product> orderedProducts;
    private ArrayList<Product> favouriteProducts;
    private CreditCard creditCard;

    public User(String username, String name,
            String surname, String dateOfBirth,
            String passsword, String email, String workAdress,
            String homeAdress, CreditCard creditCard) {
        this.username = username;
        this.name = name;
        this.surname = surname;
        this.dateOfBirth = dateOfBirth;
        this.password = password;
        this.email = email;
        this.homeAddress = homeAddress;
        this.workAddress = workAddress;
        this.orderedProducts = new ArrayList<>();
        this.favouriteProducts = new ArrayList<>();
        this.creditCard = creditCard;
    }

    public void orderProduct(Product product, int purchasedQuantity) {
        orderedProducts.add(product);
        System.out.println("The" + " " + product.getName() + " , has ordered by" + " " + getName() + " " + "with" + " "
                + creditCard.getCardName());
    }

    public void AddFavouriteProducts(Product product) {
        favouriteProducts.add(product);
        System.out.println("The" + " " + product.getName() + " , has added the favourite list by" + " " + getName());
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public String getDateOfBirth() {
        return dateOfBirth;
    }

    public void setDateOfBirth(String dateOfBirth) {
        this.dateOfBirth = dateOfBirth;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getWorkAddress() {
        return workAddress;
    }

    public void setWorkAddress(String workAddress) {
        this.workAddress = workAddress;
    }

    public String getHomeAddress() {
        return homeAddress;
    }

    public void setHomeAddress(String homeAddress) {
        this.homeAddress = homeAddress;
    }

    public ArrayList<Product> getOrderedProducts() {
        return orderedProducts;
    }

    public void setOrderedProducts(ArrayList<Product> productsOrdered) {
        this.orderedProducts = productsOrdered;
    }

    public ArrayList<Product> getFavouriteProducts() {
        return favouriteProducts;
    }

    public void setFavouriteProducts(ArrayList<Product> favProducts) {
        this.favouriteProducts = favProducts;
    }

    public CreditCard getCreditCard() {
        return creditCard;
    }

    public void setCreditCard(CreditCard creditCard) {
        this.creditCard = creditCard;
    }

}

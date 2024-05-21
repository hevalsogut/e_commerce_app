
package ECommerceApplication;


public class CreditCard {
private String cardName;
private String cardNumber;
private String cardUser;
private String securityCode;
private String expirationDate;   

public CreditCard(String cardNumber,String cardUser,String securityCode,String expirationDate,String cardName){
this.cardNumber = cardNumber;
this.cardUser = cardUser;
this.securityCode = securityCode;
this.expirationDate = expirationDate;
this.cardName=cardName;
} 

    public String getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(String cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getCardUser() {
        return cardUser;
    }

    public void setCardUser(String cardUser) {
        this.cardUser = cardUser;
    }

    
    public String getSecurityCode() {
        return securityCode;
    }

    public void setSecurityCode(String securityCode) {
        this.securityCode = securityCode;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName;
    }

}
package traning.classes.maintask;


public class Customer {
    private int id;
    private String fullName;
    private String address;
    private int cardId;
    private int accountId;

    public Customer(int id, String fullName, String address, int cardId, int accountId) {
        this.id = id;
        this.fullName = fullName;
        this.address = address;
        this.cardId = cardId;
        this.accountId = accountId;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getCardId() {
        return cardId;
    }

    public void setCardId(int cardId) {
        this.cardId = cardId;
    }

    public int getAccountId() {
        return accountId;
    }

    public void setAccountId(int accountId) {
        this.accountId = accountId;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "id=" + id +
                ", fullName='" + fullName + '\'' +
                ", address='" + address + '\'' +
                ", cardId=" + cardId +
                ", accountId=" + accountId +
                '}';
    }
}



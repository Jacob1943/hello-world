package me.helloworld.streamapi;

/**
 * @author Jacob
 * @date 2019/9/27
 */
public class PurchaseRecord {

    private int id;
    private int consumerId;
    private double amount;
    private int type;

    public PurchaseRecord(int id, int consumerId, double amount, int type) {
        this.id = id;
        this.consumerId = consumerId;
        this.amount = amount;
        this.type = type;
    }

    public PurchaseRecord() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getConsumerId() {
        return consumerId;
    }

    public void setConsumerId(int consumerId) {
        this.consumerId = consumerId;
    }

    public double getAmount() {
        return amount;
    }

    public void setAmount(double amount) {
        this.amount = amount;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }
}

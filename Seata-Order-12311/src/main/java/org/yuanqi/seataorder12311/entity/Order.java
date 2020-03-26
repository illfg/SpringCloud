package org.yuanqi.seataorder12311.entity;


public class Order {
    private int id;
    private int user_id;
    private int produce_id;
    private int count;
    private int cash;
    private int state;

    public Order(int id, int user_id, int produce_id, int count, int cash, int state) {
        this.id = id;
        this.user_id = user_id;
        this.produce_id = produce_id;
        this.count = count;
        this.cash = cash;
        this.state = state;
    }

    @Override
    public String toString() {
        return "Order{" +
                "id=" + id +
                ", user_id=" + user_id +
                ", produce_id=" + produce_id +
                ", count=" + count +
                ", cash=" + cash +
                ", state=" + state +
                '}';
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUser_id() {
        return user_id;
    }

    public void setUser_id(int user_id) {
        this.user_id = user_id;
    }

    public int getProduce_id() {
        return produce_id;
    }

    public void setProduce_id(int produce_id) {
        this.produce_id = produce_id;
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }

    public int getCash() {
        return cash;
    }

    public void setCash(int cash) {
        this.cash = cash;
    }

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
    }
}

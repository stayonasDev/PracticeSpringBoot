package stayonasDev.practice.demo.project2.domain;

import java.time.LocalDate;

public class OrderInformation {
    Long memberId;
    String itemName;
    int price;
    LocalDate date;

    public OrderInformation(Long memberId, String itemName, int price, LocalDate date) {
        this.memberId = memberId;
        this.itemName = itemName;
        this.price = price;
        this.date = date;
    }

    public Long getMemberId() {
        return memberId;
    }

    public void setMemberId(Long memberId) {
        this.memberId = memberId;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "OrderInformation{" +
                "memberId=" + memberId +
                ", itemName='" + itemName + '\'' +
                ", price=" + price +
                ", date=" + date +
                '}';
    }
}

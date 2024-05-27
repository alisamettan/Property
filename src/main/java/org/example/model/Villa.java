package org.example.model;

public class Villa extends Ev{

    private boolean hasPool;

    public Villa(String address, Integer roomCount, Integer livingRoomCount, Double price, Double square, boolean hasPool) {
        super(address, roomCount, livingRoomCount, price, square);
        this.hasPool = hasPool;
    }

    public boolean isHasPool() {
        return hasPool;
    }

    public void setHasPool(boolean hasPool) {
        this.hasPool = hasPool;
    }

    @Override
    public String toString() {
        return "Villa{" +

                        "address='" + super.getAddress() + '\'' +
                ", roomCount=" + super.getRoomCount() +
                ", livingRoomCount=" + super.getLivingRoomCount() +
                ", price=" + super.getPrice() +
                ", square=" + super.getSquare() +
                " hasPool=" + hasPool +
                '}';
    }
}

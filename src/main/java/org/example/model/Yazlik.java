package org.example.model;

public class Yazlik extends Ev{

    private boolean isCloseCoast;

    public Yazlik(String address, Integer roomCount, Integer livingRoomCount, Double price, Double square, boolean isCloseCoast) {
        super(address, roomCount, livingRoomCount, price, square);
        this.isCloseCoast = isCloseCoast;
    }

    public boolean isCloseCoast() {
        return isCloseCoast;
    }

    public void setCloseCoast(boolean closeCoast) {
        isCloseCoast = closeCoast;
    }

    @Override
    public String toString() {
        return "Yazlik{" +

                "address='" + super.getAddress() + '\'' +
                ", roomCount=" + super.getRoomCount() +
                ", livingRoomCount=" + super.getLivingRoomCount() +
                ", price=" + super.getPrice() +
                ", square=" + super.getSquare() +
                "  isCloseCoast=" + isCloseCoast +
                '}';
    }
}

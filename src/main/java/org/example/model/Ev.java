package org.example.model;

import java.util.Objects;

public class Ev {
    private String address;
    private Integer roomCount;
    private Integer livingRoomCount;
    private Double price;
    private Double square;

    public Ev(String address, Integer roomCount, Integer livingRoomCount, Double price, Double square) {
        this.address = address;
        this.roomCount = roomCount;
        this.livingRoomCount = livingRoomCount;
        this.price = price;
        this.square = square;
    }


    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Integer getRoomCount() {
        return roomCount;
    }

    public void setRoomCount(Integer roomCount) {
        this.roomCount = roomCount;
    }

    public Integer getLivingRoomCount() {
        return livingRoomCount;
    }

    public void setLivingRoomCount(Integer livingRoomCount) {
        this.livingRoomCount = livingRoomCount;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Double getSquare() {
        return square;
    }

    public void setSquare(Double square) {
        this.square = square;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Ev ev = (Ev) o;
        return Objects.equals(address, ev.address) && Objects.equals(roomCount, ev.roomCount) && Objects.equals(livingRoomCount, ev.livingRoomCount) && Objects.equals(price, ev.price) && Objects.equals(square, ev.square);
    }

    @Override
    public int hashCode() {
        return Objects.hash(address, roomCount, livingRoomCount, price, square);
    }

    @Override
    public String toString() {
        return "Ev{" +
                "address='" + address + '\'' +
                ", roomCount=" + roomCount +
                ", livingRoomCount=" + livingRoomCount +
                ", price=" + price +
                ", square=" + square +
                '}';
    }
}
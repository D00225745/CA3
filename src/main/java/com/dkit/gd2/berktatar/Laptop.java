package com.dkit.gd2.berktatar;

public class Laptop extends Computer
{
    private String screenSize; //measured in inches
    private String batteryLife; //measured in hours

    public Laptop(String type, String manufacturer, String processor, String ramSize, String diskSize, String weight, String assetTag, String purchaseDate, String screenSize, String batteryLife)
    {
        super(type, manufacturer, processor, ramSize, diskSize, weight, assetTag, purchaseDate);
        this.screenSize = screenSize;
        this.batteryLife = batteryLife;
    }

    @Override
    public String toString() {

        return  "Laptop{" +
                "type='" + super.getType() + '\'' +
                ", manufacturer=" + super.getManufacturer() +
                ", processor=" + super.getProcessor() +
                ", ramSize=" + super.getRamSize() +
                ", diskSize=" + super.getDiskSize() +
                ", weight=" + super.getWeight() +
                ", assetTag=" + super.getAssetTag() +
                ", purchaseDate=" + super.getPurchaseDate() +
                " screenSize=" + screenSize +
                ", batteryLife=" + batteryLife +
                '}';
    }
}

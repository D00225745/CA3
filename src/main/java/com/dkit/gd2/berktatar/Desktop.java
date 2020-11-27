package com.dkit.gd2.berktatar;

public class Desktop extends Computer
{
    private boolean monitor;

    public Desktop(String type, String manufacturer, String processor, String ramSize, String diskSize, String weight, String assetTag, String purchaseDate)
    {
        super(type, manufacturer, processor, ramSize, diskSize, weight, assetTag, purchaseDate);
        this.monitor = true;
    }

    @Override
    public String toString() {

        return   "Desktop{" +
                "type='" + super.getType() + '\'' +
                ", manufacturer=" + super.getManufacturer() +
                ", processor=" + super.getProcessor() +
                ", ramSize=" + super.getRamSize() +
                ", diskSize=" + super.getDiskSize() +
                ", weight=" + super.getWeight() +
                ", assetTag=" + super.getAssetTag() +
                ", purchaseDate=" + super.getPurchaseDate() +
                ", monitor=" + monitor +
                '}';
    }
}

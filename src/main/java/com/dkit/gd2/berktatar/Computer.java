package com.dkit.gd2.berktatar;

//base computer class. model attributes and specs that are common to all computers
public class Computer
{
    private String type;
    private String manufacturer;
    private String processor;
    private String ramSize;
    private String diskSize;
    private String weight;
    private String assetTag;
    private String purchaseDate;

    public Computer(String type, String manufacturer, String processor, String ramSize, String diskSize, String weight, String assetTag, String purchaseDate) {
        this.type = type;
        this.manufacturer = manufacturer;
        this.processor = processor;
        this.ramSize = ramSize;
        this.diskSize = diskSize;
        this.weight = weight;
        this.assetTag = assetTag;
        this.purchaseDate = purchaseDate;
    }

    public String getType() {
        return type;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getProcessor() {
        return processor;
    }

    public String getRamSize() {
        return ramSize;
    }

    public String getDiskSize() {
        return diskSize;
    }

    public String getWeight() {
        return weight;
    }

    public String getAssetTag() {
        return assetTag;
    }

    public String getPurchaseDate() {
        return purchaseDate;
    }


    @Override
    public String toString() {
        return "Computer{" +
                "type='" + type + '\'' +
                ", manufacturer=" + manufacturer +
                ", processor=" + processor +
                ", ramSize=" + ramSize +
                ", diskSize=" + diskSize +
                ", weight=" + weight +
                ", assetTag=" + assetTag +
                ", purchaseDate=" + purchaseDate +
                '}';
    }
}

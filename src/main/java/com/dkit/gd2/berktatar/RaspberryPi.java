package com.dkit.gd2.berktatar;

public class RaspberryPi extends Computer
{
    private boolean GPIOpin;
    private boolean SDcard;

    public RaspberryPi(String type, String manufacturer, String processor, String ramSize, String diskSize, String weight, String assetTag, String purchaseDate)
    {
        super(type, manufacturer, processor, ramSize, diskSize, weight, assetTag, purchaseDate);
        this.GPIOpin = true;
        this.SDcard = true;
    }

    @Override
    public String toString() {

        return "RaspberryPi{" +
                "type='" + super.getType() + '\'' +
                ", manufacturer=" + super.getManufacturer() +
                ", processor=" + super.getProcessor() +
                ", ramSize=" + super.getRamSize() +
                ", diskSize=" + super.getDiskSize() +
                ", weight=" + super.getWeight() +
                ", assetTag=" + super.getAssetTag() +
                ", purchaseDate=" + super.getPurchaseDate() +
                " GPIOpin=" + GPIOpin +
                ", SDcard=" + SDcard +
                '}';
    }
}

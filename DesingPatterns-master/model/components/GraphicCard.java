package model.components;

import model.subComponents.Cooler;
import model.subComponents.Memory;
import model.subComponents.Power;

public class GraphicCard extends Component{

    public static final String BRAND_NVIDIA = "NVIDIA";
    public static final String BRAND_AMD = "AMD";

    private Memory memory;
    private Cooler cooler;
    private Power power;

    public GraphicCard() {}

    public GraphicCard(String brand, String model, Memory memory, Cooler cooler, Power power){
        super(brand, model);
        this.memory = memory;
        this.cooler = cooler;
        this.power = power;
    }

    public void setBrand(String brand){
        this.brand = brand;
    }

    public void setModel(String model){
        this.model = model;
    }

    public void setMemory(Memory memory){
        if (this.memory == null){
            this.memory = memory;
        }
    }

    public void setCooler(Cooler cooler) {
        this.cooler = cooler;
    }

    public void setPower(Power power){
        if (this.power == null){
            this.power = power;
        }
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public Memory getMemory() {
        return memory;
    }

    public Cooler getCooler() {
        return cooler;
    }

    public Power getPower() {
        return power;
    }

    public void start(){
        System.out.println("Graphic card on");
    }

    @Override
    public String toString(){
        return getClass().getName() 
               + '@' + Integer.toHexString(hashCode()) 
               + String.format("\nModel: %s\nBrand: %s", model, brand);
    }
}

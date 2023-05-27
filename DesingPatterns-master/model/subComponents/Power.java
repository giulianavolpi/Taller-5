package model.subComponents;

public class Power {

    public static final Integer ONE_PCI = 1;
    public static final Integer TWO_PCI = 2;
    public static final Integer THREE_PCI = 3;

    private final Integer numberOfConnectors;
    private final Integer powerConsumption;

    public Power(Integer numberOfConnectors, Integer powerConsumption) {
            this.numberOfConnectors = numberOfConnectors;
            this.powerConsumption = powerConsumption;
    }

    public Integer getNumberOfConnectors() {
        return numberOfConnectors;
    }

    public Integer getPowerConsumption() {
        return powerConsumption;
    }
}

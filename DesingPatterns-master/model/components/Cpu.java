package model.components;

public class Cpu extends Component {

    public final static String AMD = "AMD";
    public final static String INTEL = "INTEL";
    public final static String INTEL_I7 = "i7";
    public final static String INTEL_I9 = "i9";
    public final static String AMD_5600x = "5600X";
    public final static String AMD_5800x = "5800X";

    private Integer numberOfCores;

    public Cpu(){}
    
    public Cpu(String brand, String model, Integer numberOfCores) {
        super(model, brand);
        this.numberOfCores = numberOfCores;
    }

    public void setNumberOfCores(Integer numberOfCores) {
        this.numberOfCores = numberOfCores;
    }

    public Integer getNumberOfCores() {
        return numberOfCores;
    }

    public void start() {
        System.out.println("CPU on");
    }
}

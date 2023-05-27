package model.subComponents;

public class Memory {

    public static final String TYPE_HYNYX = "HYNYX";
    public static final String TYPE_SAMSUNG = "SAMSUNG";
    public static final String TYPE_DDR4 = "DDR4";
    public static final String TYPE_GDDR5 = "GDDR5";
    public static final Integer SIZE_8GB = 8;
    public static final Integer SIZE_12GB = 12;
    public static final Integer SIZE_16GB = 16;

    private final Integer memorySize;
    private final String manufacturer;
    private final String type;

    public Memory(Integer memorySize, String manufacturer, String type) {
        this.memorySize = memorySize;
        this.manufacturer = manufacturer;
        this.type = type;
    }

    public Integer getMemorySize() {
        return memorySize;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public String getType() {
        return type;
    }
}

package creationalDesingPatterns.builderPattern.directors;

import creationalDesingPatterns.builderPattern.builders.Builder;
import model.components.GraphicCard;
import model.subComponents.Cooler;
import model.subComponents.Memory;
import model.subComponents.Power;

public class Director {
    Builder builder;

    public Director(Builder builder){
        this.builder = builder;
    }

    private void orchestrateBuild(String brand, String model, Memory memory, Power power, Cooler cooler){
        builder.reset();
        builder.setBrand(brand);
        builder.setModel(model);
        builder.setMemory(memory);
        builder.setPower(power);
        builder.setCooler(cooler);
    }

    public void buildRX6800(){
        final String BRAND = GraphicCard.BRAND_AMD; 
        final String MODEL = "RX6800";
        final Integer MEMORY_SIZE = Memory.SIZE_8GB;
        final String MEMORY_TYPE = Memory.TYPE_HYNYX;
        final String MEMORY_GEN = Memory.TYPE_GDDR5;
        final Integer NUMBER_OF_PCI = Power.TWO_PCI;
        final Integer POWER_CONSUMPTION = 250;
        final Integer NUMBER_OF_FANS = Cooler.THREE_FAN;
        final Boolean WATERCOOLED = false;

        final Memory MEMORY = new Memory(MEMORY_SIZE, MEMORY_TYPE, MEMORY_GEN);
        final Power POWER = new Power(NUMBER_OF_PCI, POWER_CONSUMPTION);
        final Cooler COOLER = new Cooler(NUMBER_OF_FANS, WATERCOOLED);

        orchestrateBuild(BRAND, MODEL, MEMORY, POWER, COOLER);
    }

    public void buildRX6900(){
        final String BRAND = GraphicCard.BRAND_AMD;
        final String MODEL = "RX6900";
        final Integer MEMORY_SIZE = Memory.SIZE_16GB;
        final String MEMORY_TYPE = Memory.TYPE_HYNYX;
        final String MEMORY_GEN = Memory.TYPE_GDDR5;
        final Integer NUMBER_OF_PCI = Power.THREE_PCI;
        final Integer POWER_CONSUMITION = 300;
        final Integer NUMBER_OF_FANS = Cooler.THREE_FAN;
        final Boolean WATERCOOLED = true;

        final Memory MEMORY = new Memory(MEMORY_SIZE, MEMORY_TYPE, MEMORY_GEN);
        final Power POWER = new Power(NUMBER_OF_PCI, POWER_CONSUMITION);
        final Cooler COOLER = new Cooler(NUMBER_OF_FANS, WATERCOOLED);

        orchestrateBuild(BRAND, MODEL, MEMORY, POWER, COOLER);
    }

    public void buildRTX3080(){
        final String BRAND = GraphicCard.BRAND_NVIDIA;
        final String MODEL = "RTX3080";
        final Integer MEMORY_SIZE = Memory.SIZE_8GB;
        final String MEMORY_TYPE = Memory.TYPE_SAMSUNG;
        final String MEMORY_GEN = Memory.TYPE_GDDR5;
        final Integer NUMBER_OF_PCI = Power.TWO_PCI;
        final Integer POWER_CONSUMITION = 275;
        final Integer NUMBER_OF_FANS = Cooler.TWO_FAN;
        final Boolean WATERCOOLED = false;

        final Memory MEMORY = new Memory(MEMORY_SIZE, MEMORY_TYPE, MEMORY_GEN);
        final Power POWER = new Power(NUMBER_OF_PCI, POWER_CONSUMITION);
        final Cooler COOLER = new Cooler(NUMBER_OF_FANS, WATERCOOLED);

        orchestrateBuild(BRAND, MODEL, MEMORY, POWER, COOLER);
    }

    public void buildRTX3090(){
        final String BRAND = GraphicCard.BRAND_NVIDIA;
        final String MODEL = "RTX3090";
        final Integer MEMORY_SIZE = Memory.SIZE_16GB;
        final String MEMORY_TYPE = Memory.TYPE_SAMSUNG;
        final String MEMORY_GEN = Memory.TYPE_GDDR5;
        final Integer NUMBER_OF_PCI = Power.THREE_PCI;
        final Integer POWER_CONSUMITION = 375;
        final Integer NUMBER_OF_FANS = Cooler.ZERO_FAN;
        final Boolean WATERCOOLED = true;


        final Memory MEMORY = new Memory(MEMORY_SIZE, MEMORY_TYPE, MEMORY_GEN);
        final Power POWER = new Power(NUMBER_OF_PCI, POWER_CONSUMITION);
        final Cooler COOLER = new Cooler(NUMBER_OF_FANS, WATERCOOLED);

        orchestrateBuild(BRAND, MODEL, MEMORY, POWER, COOLER);
    }
}

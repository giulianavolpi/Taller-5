package creationalDesingPatterns.builderPattern.builders;

import model.subComponents.Cooler;
import model.subComponents.Memory;
import model.subComponents.Power;

public interface Builder {
    void reset();
    void setBrand(String brand);
    void setModel(String model);
    void setMemory(Memory memory);
    void setCooler(Cooler cooler);
    void setPower(Power power);
}

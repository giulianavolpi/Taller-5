package model;

import model.components.Cpu;
import model.components.GraphicCard;

public class Computer {

    private final Cpu cpu;
    private final GraphicCard graphicCard;

    public Computer(Cpu cpu, GraphicCard graphicCard) {
        this.cpu = cpu;
        this.graphicCard = graphicCard;
    }

    public Cpu getCpu() {
        return cpu;
    }

    public GraphicCard getGraphicCard() {
        return graphicCard;
    }
}

package creationalDesingPatterns.builderPattern.builders;

import model.components.GraphicCard;
import model.subComponents.Cooler;
import model.subComponents.Memory;
import model.subComponents.Power;

public class GraphicCardBuilder implements Builder {
    private GraphicCard card;

    public GraphicCardBuilder(){
        this.reset();
    }

    public void reset(){
        this.card = new GraphicCard();
    }

    public void setModel(String model){
        this.card.setModel(model);
    }

    public void setBrand(String brand){
        this.card.setBrand(brand);
    }

    public void setMemory(Memory memory){
        this.card.setMemory(memory);
    }

    public void setCooler(Cooler cooler){
        this.card.setCooler(cooler);
    }

    public void setPower(Power power){
        this.card.setPower(power);
    }

    public GraphicCard getProduct(){
        GraphicCard product = this.card;
        this.reset();
        return product;
    }
}
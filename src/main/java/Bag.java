public class Bag extends Item {
    protected Double weigthLimit = 10.5; //создаём переменную предельный вес
    boolean wholeBag;
    String bagCondition;
    String tearOrnot() {
        if (weigthLimit >= getWeigth()) {
            wholeBag = false;
            bagCondition="Мешок не выдержит";
        }
        else {
            wholeBag = true;
            bagCondition="Мешок выдержит";
        }
        return bagCondition;
    }
    public String getBagCondition() {
        return bagCondition;
    }

    public void setBagCondition(String bagCondition) {
        this.bagCondition = bagCondition;
    }
    }

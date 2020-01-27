public class Run {
    public static void main(String[] args){

        Item item = new Item();
        Box box = new Box();
        Bag bag = new Bag();
        //System.out.println("В коробку помещается: "+ box.getBoxVolume()/item.getVolume()+" кирпичей");

        System.out.println(item.getInfo());
        System.out.println("Коробка может выдержать: "+box.getVolumeBox()/item.getWeigth()+" кирпичей");
        System.out.println(bag.bagCondition);


    }
}

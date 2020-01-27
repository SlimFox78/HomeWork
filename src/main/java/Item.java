public class Item {
    protected String name="Кирпич";
    protected Integer leight=250;
    protected Integer width=120;
    protected Integer heigt=65;
    protected Double weigth=5.5;
    protected Double volume=getVolume();

    String getInfo(){
        return "Этот предмет: "+name+" его вес: "+weigth;
    }

     Double getVolume(){
         return (double)leight*(double)width*(double)heigt;
     }

        public Double getWeigth() {
        return weigth;
    }

    public void setWeigth(Double weigth) {
        this.weigth = weigth;
    }

    public Integer getHeigt() {
        return heigt;
    }

    public void setHeigt(Integer heigt) {
        this.heigt = heigt;
    }

    public Integer getWidth() {
        return width;
    }

    public void setWidth(Integer width) {
        this.width = width;
    }

    public Integer getLeight() {
        return leight;
    }

    public void setLeight(Integer leight) {
        this.leight = leight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setVolume(Double volume) {
        this.volume = volume;
    }
}

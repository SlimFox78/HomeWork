public class Box extends Item {
    protected Integer boxLeigth=2500;
    protected Integer boxWight=1200;
    protected Integer boxHeigth=650;
    protected Double boxVolume=getVolumeBox();
    protected Double maxWeigth=1000D;
    protected boolean emptyBox=true;

    Double getVolumeBox(){
        return (double)boxHeigth*(double)boxWight*(double)boxHeigth;
    }

        public Double getMaxWeigth() {
        return maxWeigth;
    }

    public void setMaxWeigth(Double maxWeigth) {
        this.maxWeigth = maxWeigth;
    }
}

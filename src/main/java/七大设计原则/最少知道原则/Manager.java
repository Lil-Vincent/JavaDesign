package 七大设计原则.最少知道原则;

/**
 * @author Lil
 * @date 2021/11/8 17:06
 */
public class Manager {
    public Cabbage cabbage;

    public Manager(Cabbage cabbage) {
        this.cabbage = cabbage;
    }

    public Manager() {

    }


    public void getSaleRecord() {
        cabbage.saleRecord();
    }
}

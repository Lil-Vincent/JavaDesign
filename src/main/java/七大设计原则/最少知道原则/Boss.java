package 七大设计原则.最少知道原则;

import java.util.PriorityQueue;

/**
 * @author Lil
 * @date 2021/11/8 17:09
 */
public class Boss {
    public void getSaleRecord(Manager manager) {
        manager.getSaleRecord();
    }
}

package com.wh_1215.pattern.state.before;

/**
 * @author WH
 * @version 1.0
 * @date 2022/11/1 17:11
 */
public class Client {
    public static void main(String[] args) {
        Lift lift = new Lift();

        lift.setState(ILift.OPENING_STATE);

        lift.open();
        lift.close();
        lift.run();
        lift.stop();
    }
}

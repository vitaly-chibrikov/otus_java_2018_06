package ru.outs.strategy;

/**
 * @author sergey
 * created on 11.09.18.
 */
public class Demo {
    public static void main(String[] args) {
        Context context = new Context();
        context.setStrategy(new Bus());
        context.applyStrategy();

        context.setStrategy(new Car());
        context.applyStrategy();
    }

}

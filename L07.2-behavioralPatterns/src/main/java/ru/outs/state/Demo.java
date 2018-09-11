package ru.outs.state;

/**
 * @author sergey
 * created on 11.09.18.
 */
public class Demo {
    public static void main(String[] args) {
        BulbContext context = new BulbContext();
        context.performAction();

        context.setState(new OnState());
        context.performAction();

        context.setState(new OffState());
        context.performAction();
    }
}


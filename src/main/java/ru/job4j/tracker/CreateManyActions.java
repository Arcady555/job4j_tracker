package ru.job4j.tracker;

public class CreateManyActions implements UserAction {

    private final Output out;

    public CreateManyActions(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Add new Items";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        out.println("=== Create a new Items ====");
        String name = input.askStr("Enter name: ");
        for (int i = 0; i < 10000; i++) {
            Item item = new Item(name + i);
            tracker.add(item);
            out.println("Добавленная заявка: " + item);
        }
        return true;
    }
}

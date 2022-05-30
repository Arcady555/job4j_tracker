package ru.job4j.tracker;

public class DeleteManyActions implements UserAction {

    private final Output out;

    public DeleteManyActions(Output out) {
        this.out = out;
    }

    @Override
    public String name() {
        return "Delete Items";
    }

    @Override
    public boolean execute(Input input, Store tracker) {
        out.println("=== Delete items ===");
        int id = input.askInt("Enter id: ");
        for (int i = 0; i < 9990; i++) {
            if (tracker.delete(id + i)) {
                out.println("Заявка удалена успешно.");
            } else {
                out.println("Ошибка удаления заявки.");
            }
        }
        return true;
    }
}

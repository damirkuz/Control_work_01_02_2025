package ru.itis.inf400;

public class StageRejected extends Exception {
    public StageRejected(String message) {
        super(message);
    }
    public StageRejected(Stage stage) {
        super("Стадия " + stage.name + " забракована");
    }
}

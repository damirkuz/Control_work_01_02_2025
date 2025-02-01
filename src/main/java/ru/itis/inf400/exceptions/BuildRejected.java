package ru.itis.inf400;

public class BuildRejected extends Exception {
    public BuildRejected(String message) {
        super(message);
    }

    public BuildRejected() {
        super("Стройка отменена");
    }
}

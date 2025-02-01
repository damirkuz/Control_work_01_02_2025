package ru.itis.inf400;

public class IncorrectDate extends RuntimeException {
    public IncorrectDate(String message) {
        super(message);
    }

    public IncorrectDate() {
        super("Некорректная дата");
    }
}

package ru.itis.inf400;

public class StageProject extends Stage {
    private static final String name = "Планирование";
    private static final String description = "Этап планировки";

    public StageProject() {
        super(name, description, 100_000, "01.02.2025", "01.03.2025", StageStatus.PLANNED);
    }

    public StageProject(double price, String dateStart, String dateEnd) {
        super("Планирование", "Этап планировки", price, dateStart, dateEnd, StageStatus.PLANNED);
    }
}

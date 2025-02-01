package ru.itis.inf400;

public class StageFoundation extends Stage {
    private static final String name = "Фундамент";
    private static final String description = "Этап закладки фундамента";
    public StageFoundation() {
        super(name, description, 1_000_000, "01.03.2025", "01.04.2025", StageStatus.PLANNED);
    }

    public StageFoundation(double price, String dateStart, String dateEnd) {
        super(name, description, price, dateStart, dateEnd, StageStatus.PLANNED);
    }
}

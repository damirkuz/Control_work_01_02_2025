package ru.itis.inf400;

import java.util.Random;

public abstract class Stage implements IManageStage {
    protected String name;
    protected String description;
    protected double price;
    protected String dateStart;
    protected String dateEnd;
    protected StageStatus stageStatus;

    public Stage(String name, String description, double price, String dateStart, String dateEnd, StageStatus stageStatus) {
        this.name = name;
        this.description = description;
        this.price = price;
        this.dateStart = dateStart;
        this.dateEnd = dateEnd;
        this.stageStatus = stageStatus;
    }

    public void start() throws StageRejected {
        setStageStatus(StageStatus.IN_PROGRESS);
        Random random = new Random();

        // с 10% шансом бракуем стадию
        if (random.nextInt(1, 10) == 1) {
            stop();
        }
    }

    public void stop() throws StageRejected {
        setStageStatus(StageStatus.REJECTED);
        throw new StageRejected(this);
    }

    public void setStageStatus(StageStatus stageStatus) {
        this.stageStatus = stageStatus;
    }

}

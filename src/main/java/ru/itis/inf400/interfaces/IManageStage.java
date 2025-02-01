package ru.itis.inf400;

public interface IManageStage {
    void start() throws StageRejected;
    void stop() throws StageRejected;
}

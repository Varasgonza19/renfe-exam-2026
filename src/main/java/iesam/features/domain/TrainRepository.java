package iesam.features.domain;

import java.util.ArrayList;

public interface TrainRepository {
    ArrayList<Train> getTrains();
    void saveTrain(Train train);
    void deleteTrain(String id);
    Train getTrainById(String id);
}

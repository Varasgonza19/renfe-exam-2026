package iesam.features.data;

import iesam.features.domain.Train;
import iesam.features.domain.TrainRepository;

import java.util.ArrayList;

public class TrainDataRepository implements TrainRepository {

    private TrainMemLocalDataSource dataSource;

    @Override
    public ArrayList<Train> getTrains() {
        return dataSource.findAll();
    }

    @Override
    public void saveTrain(Train train) {
        dataSource.save(train);

    }

    @Override
    public void deleteTrain(String id) {
        dataSource.delete(id);
    }

    @Override
    public Train getTrainById(String id) {
        return (Train) dataSource.getTrainById(id);
    }
}

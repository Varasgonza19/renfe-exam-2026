package iesam.features.data; //cambiar por la ruta correcta

import iesam.features.domain.Train;

import java.util.ArrayList;
import java.util.Objects;
import java.util.stream.Stream;

public class TrainMemLocalDataSource {

    private TrainMemLocalDataSource instance = null;

    public TrainMemLocalDataSource getInstance(){
        if (instance == null){
            instance = new TrainMemLocalDataSource();
        }
        return instance;
    }

    public TrainMemLocalDataSource(){
        storage.add(new Train("MD5-001","Ave","100€","Barcelona"));
        storage.add(new Train("MD5-002","Train","50€","Madrid"));
        storage.add(new Train("MD5-003","Bullet Train","180€","Londres"));
    }

    private ArrayList<Train> storage = new ArrayList<>();

    public ArrayList<Train> findAll() {
        return storage;
    }

    public void save(Train train) {
        storage.add(train);
    }

    public void delete(String trainId) {
        storage.removeIf(train -> Objects.equals(train.getId(), trainId));
    }

    public Stream<Train> getTrainById(String id){
        return  storage.stream().filter(train -> train.getId().equals(id));
    }
}

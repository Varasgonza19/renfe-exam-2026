package iesam.features.domain;

import java.util.ArrayList;

public class GetTrainUseCase {
    private TrainRepository trainRepository;

    public GetTrainUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    ArrayList<Train> getAlls(){
         return trainRepository.getTrains();
    }
}

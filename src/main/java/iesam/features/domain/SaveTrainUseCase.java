package iesam.features.domain;

public class SaveTrainUseCase {
    private TrainRepository trainRepository;

    public SaveTrainUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    void saveTrain(Train train){
        trainRepository.saveTrain(train);
    }
}

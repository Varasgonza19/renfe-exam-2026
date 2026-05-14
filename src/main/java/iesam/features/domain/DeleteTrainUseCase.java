package iesam.features.domain;

public class DeleteTrainUseCase {
    private TrainRepository trainRepository;

    public DeleteTrainUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    void deleteTrain(String id){
        trainRepository.deleteTrain(id);
    }
}

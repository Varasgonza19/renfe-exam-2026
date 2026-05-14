package iesam.features.domain;

public class GetTrainByIdUseCase {
    private TrainRepository trainRepository;

    public GetTrainByIdUseCase(TrainRepository trainRepository) {
        this.trainRepository = trainRepository;
    }

    void getTrainById(String id){
        trainRepository.getTrainById(id);
    }
}

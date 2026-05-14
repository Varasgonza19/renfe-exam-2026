package iesam.features;

import iesam.features.data.TrainDataRepository;
import iesam.features.data.TrainMemLocalDataSource;
import iesam.features.domain.*;
import iesam.features.presentation.TrainView;

public class Main {
    public static void main(String[] args) {

        TrainView trainView = new TrainView(GetTrainByIdUseCase,SaveTrainUseCase,DeleteTrainUseCase,GetTrainUseCase);

        trainView.getTrains();
        Train train = new Train("","","","");
        trainView.saveTrain(train);
        trainView.getTrains();

        trainView.getTrains();


        trainView.getTrains();
        trainView.deleteTrain("2");
        trainView.getTrains();
    }
}

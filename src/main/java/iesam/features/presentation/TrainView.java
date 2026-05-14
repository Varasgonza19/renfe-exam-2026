package iesam.features.presentation;

import iesam.features.data.TrainDataRepository;
import iesam.features.data.TrainMemLocalDataSource;
import iesam.features.domain.*;

import java.util.ArrayList;

public class TrainView implements TrainRepository {

   private final TrainRepository source = new TrainDataRepository();

   GetTrainByIdUseCase getTrainByIdUseCase = new GetTrainByIdUseCase(source);
   SaveTrainUseCase saveUseCase = new SaveTrainUseCase(source);
   DeleteTrainUseCase deleteUseCase = new DeleteTrainUseCase(source);
   GetTrainUseCase getTrainUseCase = new GetTrainUseCase(source);

    public TrainView(GetTrainByIdUseCase getTrainByIdUseCase, SaveTrainUseCase saveUseCase, DeleteTrainUseCase deleteUseCase, GetTrainUseCase getTrainUseCase) {
        this.getTrainByIdUseCase = getTrainByIdUseCase;
        this.saveUseCase = saveUseCase;
        this.deleteUseCase = deleteUseCase;
        this.getTrainUseCase = getTrainUseCase;
    }



    @Override
    public ArrayList<Train> getTrains() {
        return source.getTrains();
    }

    @Override
    public void saveTrain(Train train) {
        source.saveTrain(train);
    }

    @Override
    public void deleteTrain(String id) {
        source.deleteTrain(id);
    }

    @Override
    public Train getTrainById(String id) {
        return source.getTrainById(id);
    }
}

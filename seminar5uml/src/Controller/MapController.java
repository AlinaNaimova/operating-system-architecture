package Controller;

import Model.ITripHistory;
import Model.Repositories.ICamerasRepository;
import Model.Repositories.ICityObjectsRepository;
import Model.Repositories.ICurrentTrafficRepository;
import Model.Repositories.IRoadsRepository;

public class MapController extends TripController {
    private final ICityObjectsRepository iCityObjectsRepository;
    public MapController(ITripHistory iTripHistory,
                         IRoadsRepository iRoadsRepository,
                         ICurrentTrafficRepository iCurrentTrafficRepository,
                         ICamerasRepository iCamerasRepository,
                         ICityObjectsRepository iCityObjectsRepository) {
        super(iTripHistory, iRoadsRepository, iCurrentTrafficRepository, iCamerasRepository);
        this.iCityObjectsRepository = iCityObjectsRepository;
    }
}

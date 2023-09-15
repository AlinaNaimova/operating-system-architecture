package Controller;

import Model.ITripHistory;
import Model.Repositories.ICamerasRepository;
import Model.Repositories.ICurrentTrafficRepository;
import Model.Repositories.IRoadsRepository;

public class TripController extends NetController implements IGPS {
    private final ITripHistory iTripHistory;
    public TripController(ITripHistory iTripHistory,
                          IRoadsRepository iRoadsRepository,
                          ICurrentTrafficRepository iCurrentTrafficRepository,
                          ICamerasRepository iCamerasRepository) {
        super(iRoadsRepository, iCurrentTrafficRepository, iCamerasRepository);
        this.iTripHistory = iTripHistory;
    }
}

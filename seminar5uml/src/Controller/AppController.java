package Controller;

import Model.ITripHistory;
import Model.Repositories.ICamerasRepository;
import Model.Repositories.ICityObjectsRepository;
import Model.Repositories.ICurrentTrafficRepository;
import Model.Repositories.IRoadsRepository;
import View.IGUI;
import View.IUX;

public class AppController extends MapController implements IUX, IGUI {
    public static void run() {

    }
    public AppController(ITripHistory iTripHistory,
                         IRoadsRepository iRoadsRepository,
                         ICurrentTrafficRepository iCurrentTrafficRepository,
                         ICamerasRepository iCamerasRepository,
                         ICityObjectsRepository iCityObjectsRepository) {
        super(iTripHistory, iRoadsRepository, iCurrentTrafficRepository, iCamerasRepository, iCityObjectsRepository);
    }
}

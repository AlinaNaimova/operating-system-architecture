package Controller;

import Model.Repositories.ICamerasRepository;
import Model.Repositories.ICurrentTrafficRepository;
import Model.Repositories.IRoadsRepository;

public class NetController {
    private final IRoadsRepository iRoadsRepository;
    private final ICurrentTrafficRepository iCurrentTrafficRepository;
    private final ICamerasRepository iCamerasRepository;
    public NetController(IRoadsRepository iRoadsRepository,
                         ICurrentTrafficRepository iCurrentTrafficRepository,
                         ICamerasRepository iCamerasRepository) {
        this.iRoadsRepository = iRoadsRepository;
        this.iCurrentTrafficRepository = iCurrentTrafficRepository;
        this.iCamerasRepository = iCamerasRepository;
    }
    // Реализация методов из интерфейсов
}

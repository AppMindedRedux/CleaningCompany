package be.intecbrussel.CleaningCompany;

public class DomesticServiceImpl implements DomesticService {
    GardeningService gardeningService;
    CleaningService cleaningService;


    public void setCleaningService(CleaningService cleaningService){
        this.cleaningService = cleaningService;
    }

    public void setGardeningService(GardeningService gardeningService){
        this.gardeningService = gardeningService;
    }

 
    public void runHousehold() {
        cleaningService.clean();
        gardeningService.garden();
    }
}

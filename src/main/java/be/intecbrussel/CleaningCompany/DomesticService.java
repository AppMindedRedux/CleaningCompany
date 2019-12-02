package be.intecbrussel.CleaningCompany;

public interface DomesticService {

    public void setCleaningService(CleaningService cleaningService);
    public void setGardeningService(GardeningService gardeningService);
    public void runHousehold();
}
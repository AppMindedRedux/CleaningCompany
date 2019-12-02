package be.intecbrussel.CleaningCompany;

public class CleaningServiceImpl implements CleaningService {
    CleaningTool cleaningTool;

    public void setCleaningTool(CleaningTool cleaningTool) {

        this.cleaningTool = cleaningTool;
    }


    public void clean() {
        System.out.println("Cleaning is ongoing");
        cleaningTool.doCleanjob();
    }
}
package be.intecbrussel.CleaningCompany;

public interface GardeningService {
    public void setGardeningTool(GardeningTool gardeningTool);
    public void garden();
    public void init();
    public void destroy();
}

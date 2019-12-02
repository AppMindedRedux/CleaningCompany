package be.intecbrussel.CleaningCompany;

public class GardeningServiceImpl implements GardeningService{

    private GardeningTool gardeningTool;


    public void setGardeningTool(GardeningTool gardeningTool) {
        this.gardeningTool = gardeningTool;
    }


    public void garden() {
        System.out.println("Working in the garden");
        gardeningTool.doGardenJob();
    }

 
    public void init(){
        System.out.println("Gardening service is preparing for work. ");
    }

 
    public void destroy() {
        System.out.println("Gardening service cleaning up. ");
    }

}

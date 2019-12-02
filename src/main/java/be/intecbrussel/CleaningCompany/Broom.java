package be.intecbrussel.CleaningCompany;

public class Broom implements CleaningTool {

    public Broom() {
        System.out.println("Broom constructor is called");
    }


    public void doCleanjob() {
        System.out.println("Broom is Cleaning");
    }
}
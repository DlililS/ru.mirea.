package _24;

import java.util.ArrayList;
public class Shop {
    ArrayList<Computer> Comp = new ArrayList<Computer>();

    public void addComputer(Computer a) {
        Comp.add(a);
    }
    public void deleteComputer(String model) {
        for (Computer x : Comp) {
            if(x.model.equals(model)){
                Comp.remove(x);
            }
        }
    }
    public String searchComputer(String model) {
        String n = "Not found";
        for (Computer x : Comp) {
            if (x.model.equals(model)) {
                n =  "Model: " + x.model + "\tProcessor: " + x.processor + "\tMemory: " + x.memory + "\tBattery: " + x.battery;
            }
        }
        return n;
    }
}
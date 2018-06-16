package p04_company_roster;

import java.util.List;
import java.util.Map;

public class Department {
    private Map<Double, Employee> map;

    public Department(Map<Double, Employee> map) {
        this.map = map;
    }

    public Map<Double, Employee> getMap() {
        return this.map;
    }

    public void setMap(Map<Double, Employee> map) {
        this.map = map;
    }

    public double getAverage() {
        double sum = 0;
        for (Double curr : map.keySet()) {
            sum += curr;
        }
        return sum / map.size();
    }
}

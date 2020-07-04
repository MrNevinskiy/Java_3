package HW5;

import java.util.ArrayList;
import java.util.Arrays;

public class race {

    private ArrayList<stage> stages;

    public ArrayList<stage> getStages() {
        return stages;
    }

    public race(stage... stages) {
        this.stages = new ArrayList<>(Arrays.asList(stages));
    }
}

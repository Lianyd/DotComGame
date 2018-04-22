import java.util.*;

public class DotCom {
    private ArrayList<String> locationCells;
    private String name;

    public void setLocationCells(ArrayList<String> loc){
        locationCells = loc;
    }

    public  void setName(String n){
        name = n;
    }

    public String checkYourself(String userInput){
        String result = "miss";
        int index = locationCells.indexOf(userInput);
        if (index >= 0){
            locationCells.remove(index);

            if (locationCells.isEmpty()){          //如果全部目标已删除（为空），则进行括号内
                result = "kill";
                System.out.println("Ouch! You sunk " + name + "  :(");
            } else {result = "hit";}
        }
        return result;
    }
}


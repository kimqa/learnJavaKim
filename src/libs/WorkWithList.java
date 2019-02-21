package libs;

import java.util.ArrayList;
import java.util.List;

public class WorkWithList {

    /**
     *
     * @param ourList
     * @return
     */
    public List<List<String>> addNewList(List<List<String>> ourList){
        ourList.add(new ArrayList<>());
        return ourList;
    }

    /**
     *
     * @param numberOfList
     * @param value
     * @param ourList
     * @return
     */
    public List<List<String>> addValueToListList(List<List<String>> ourList, int numberOfList, String value){
        try {
            ourList.get(numberOfList).add(value);
        } catch (Exception e) {
            System.out.println("[EXAPTION]" + e);
            System.out.println(" ");
        }

        return ourList;
    }
    public void Sysout(List<List<String>> ourList) {
        for (int i = 0; i < ourList.size(); i++) {
            System.out.println("Line N " + (i+1) + ourList.get(i));
        }
        System.out.println("------------------");
    }
}

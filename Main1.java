import java.util.ArrayList;
import java.util.Collections;

/**
 * Created by student on 6/20/2016.
 */
public class Main1 {
    public static void main(String[] args) {

        ArrayList<Integer> nameList = (new ArrayList<>());
        nameList.add(100);
        nameList.add(50);
        nameList.add(3);
        nameList.add(45);
        nameList.add(65);
        nameList.add(28);
        nameList.add(1000);



        for (int x=0; x < nameList.size(); x++) {
            for (int y=0; y < nameList.size() - 1; y++) {
                int result = (nameList.get(y)).compareTo(nameList.get(y + 1));
                if (result < (0)) {

                    int temp = (nameList.get(y + 1));
                    nameList.set(y + 1, nameList.get(y));
                    nameList.set(y, temp);
                }
            }
        }
        System.out.println(nameList);
    }
}
import java.util.Vector;


public class BubbleSort {

    public static void bubbleSort(Vector<String> lst){

        String tmp_buffer = ("");
        int result = (0);

        //the list
        for( int x = (0); x< (lst.size()); ++x) {
            for ( int y = (0); y< (lst.size()-1 ); ++y){
                result = lst.get(y).compareTo(lst.get(y + 1));

                if(result > 0){
                    tmp_buffer = (lst.get(y +1));
                    lst.set(y + 1, lst.get(y));
                    lst.set(y, tmp_buffer );
                }
            }
        }
    }


}

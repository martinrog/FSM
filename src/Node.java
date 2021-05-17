import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Node {

    private String name;
    private Map<String , Node> connected = new HashMap <>();

    public Node(String name) {
        this.name = name;
    }

    public void setConnected(String pathname, Node node) {
        this.connected.put(pathname , node);
    }

    public ArrayList<String > run(String input_t) {
        if (input_t.length()== 0){
            return new ArrayList<>(){{
                add(name);
            }};
        }else {
            String key = input_t.substring(0,1);
            String rest = input_t.substring(1);

            if(connected.containsKey(key)){

                ArrayList <String> result = connected.get(key).run(rest);
                result.add(0,name);
                return result;

            }else {
                throw new IllegalArgumentException(key+ "Is not a path of node "+ name);
            }

        }
    }



}

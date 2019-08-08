import java.util.ArrayList;

public class ReadAndWrite implements Isaving {
    private int valued;
    ArrayList<String> value=new ArrayList<String>();

    public ReadAndWrite() {
        this.valued = 0;
    }

    public int getValued() {
        return valued;
    }

    @java.lang.Override
    public java.lang.String toString() {
        return "ReadAndWrite{" +
                "valued=" + valued +
                '}';
    }

    @Override
    public ArrayList<String>canWriteTo(String values) {
       valued++;
        value.add(values);
        String insert = toString();
        value.add(insert);
        return value;
    }

    @Override
    public void canReadFrom(ArrayList<String> values) {
        for(int i=0; i < values.size(); i++){
            if(i % 2 == 0){
                System.out.println("Name: ".concat(values.get(i)));
            }
            else if(i % 2 == 1){
                System.out.println("Value: ".concat(values.get(i)));
            }
        }
    }
}

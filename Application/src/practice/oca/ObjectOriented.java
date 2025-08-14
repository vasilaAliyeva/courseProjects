package practice.oca;



public class ObjectOriented extends Object {
    public String name;


    @Override
    protected ObjectOriented clone() throws CloneNotSupportedException {
        ObjectOriented obj = new ObjectOriented();

        obj.name = this.name;
        return obj;
    }

    public static void main(String[] args) {


        ObjectOriented obj = new ObjectOriented();
        obj.name = "Base name";

//        ObjectOriented clone = obj.clone();


        System.out.println();


    }

}

package alex.newArrayList;

/**
 * Created by alex on 16.12.15.
 */
public class StratNewArrayList {

    public static void main (String []args){

        NewArrayList newArrayList = new NewArrayList();

        System.out.println(newArrayList.length());

        newArrayList.add("Blablabla");

        System.out.println(newArrayList.toString());
        newArrayList.add("Bobobo");
        System.out.println(newArrayList.toString());
        newArrayList.add("Bobobo0");
        System.out.println(newArrayList.toString());
        newArrayList.add("Bobob1");
        System.out.println(newArrayList.toString());
        newArrayList.add("Bobob2");
        System.out.println(newArrayList.toString());
        newArrayList.add("Bobob4");
        System.out.println(newArrayList.toString());
        newArrayList.add("Bobob5");
        System.out.println(newArrayList.toString());
        newArrayList.add("Bobob6");
        System.out.println(newArrayList.toString());
        newArrayList.add("Bobob7");
        System.out.println(newArrayList.toString());
        newArrayList.add("Bobob8");
        System.out.println(newArrayList.toString());
        newArrayList.add("Bobob9");
        System.out.println(newArrayList.toString());
        newArrayList.add("Bobob10");
        System.out.println(newArrayList.toString());


        System.out.println(newArrayList.length());


        newArrayList.removeByIndex(5);
        System.out.println(newArrayList.toString());

        newArrayList.addByIndex(0, "gogogo");
        System.out.println(newArrayList.toString());


    }


}

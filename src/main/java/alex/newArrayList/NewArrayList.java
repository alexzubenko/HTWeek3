package alex.newArrayList;

import java.util.Arrays;
import java.util.List;

/**
 * Created by alex on 16.12.15.
 */
public class NewArrayList {

    Object array[];
    int elementCount = 0;

    public NewArrayList() {
        array = new Object[10];
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("NewArrayList{");
        sb.append("array=").append(array == null ? "null" : Arrays.asList(array).toString());
        sb.append(", elementCount=").append(elementCount);
        sb.append('}');
        return sb.toString();
    }

    public Object length() {

        return array.length;


    }

    public Object [] add(Object object) {

        if (elementCount < array.length) {

            array[elementCount] = object;
            elementCount++;
            return array;
        } else {
            Object array2[] = new Object[array.length*2];

            System.arraycopy(array, 0, array2, 0, array.length);
            array = array2;

            array[elementCount] = object;
            elementCount++;

            return array;
        }


    }

    public Object [] addByIndex(int index, Object object) {

        if (array[index]==null) {
            array[index] = object;
            elementCount++;
            return array;
        } else {

            System.arraycopy(array, index, array, index + 1, array.length - index - 1);
            array[index] = object;
            elementCount++;
            return array;
        }
    }

    public Object [] removeByIndex(int index) {
        array[index] = null;

        System.arraycopy(array, index + 1, array, index, array.length - index - 1);
        elementCount--;

        return array;
    }


}

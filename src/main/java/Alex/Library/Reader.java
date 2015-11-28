package Alex.Library;

import java.util.List;

/**
 * Created by alex on 25.11.15.
 */
public class Reader {

    private String name;
    private boolean blackList;

    public Reader() {
    }

    public Reader(String name, boolean blackList) {
        this.name = name;
        this.blackList = blackList;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setBlackList(boolean blackList) {
        this.blackList = blackList;
    }

    public String getName() {

        return name;
    }

    public boolean isBlackList() {
        return blackList;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("Reader{");
        sb.append("name='").append(name).append('\'');
        sb.append(", blackList=").append(blackList);
        sb.append('}');
        return sb.toString();
    }
}

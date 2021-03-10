package serializable;

import java.io.Serializable;

/**
 * @author luliangliang9534@100.me
 */
public class InnerPerson implements Serializable {

    private static final long serialVersionUID = -8954701437462039415L;
    private String hobby;

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "InnerPerson{" +
            "hobby='" + hobby + '\'' +
            '}';
    }
}

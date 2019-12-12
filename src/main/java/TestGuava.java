import com.google.common.base.Joiner;

public class TestGuava {

    public static void main(String[] args) {
        Joiner joiner = Joiner.on("; ").skipNulls();
        System.out.println("res = " + joiner.join("Fer", null, "David", "Sophie"));
    }
}

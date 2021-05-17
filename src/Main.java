
public class Main {
    public static void main(String[] args) {

        Node s0 = new Node("s0");
        Node s1 = new Node("s1");
        Node s2 = new Node("s2");
        Node s3 = new Node("s3");

        s0.setConnected("A", s2);
        s0.setConnected("B", s1);

        s1.setConnected("A", s1);
        s1.setConnected("B", s2);

        s2.setConnected("B", s3);

        s3.setConnected("A", s3);
        s3.setConnected("B", s0);

        test(s0, "BAAB");
        test(s0, "BABA");
        test(s2, "BABABBBAB");
    }

    static void test(Node node, String input_text) {
        System.out.print(" De invoertekst gebruikt: " + input_text + ", resulteert in ");
        try {
            System.out.println(node.run(input_text));
        } catch (IllegalArgumentException ex) {
            System.out.println("an error: " + ex.getMessage());
        }
    }

}





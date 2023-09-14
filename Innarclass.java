public class Innarclass {
    public static void main(String[] args) {
        Prince p = new Prince();
        Prince.Sadhu n = p.new Sadhu();
        Prince.Sur s = p.new Sur();
        n.name();
        s.surname();

    }
}

class Prince {
    String na = "Paras ";
    String su = "Parabiya";

    class Sadhu {
        void name() {
            System.out.print(na);
        }
    }

    class Sur {
        void surname() {
            System.out.println(su);
        }
    }
}
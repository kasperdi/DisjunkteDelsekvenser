public class Main {
    public static void main(String args[]){
        char[] X = new char[]{'0', 'g', 'l', 'e', 'd'};
        char[] Y = new char[]{'0', 'u', 'r', 'o'};
        char[] Z = new char[]{'0', 'g', 'u', 'l', 'e', 'r', 'o', 'd'};

        System.out.println(IsFlet.isAFlet(X, Y, Z));
        System.out.println(IsFletExpanded.isAFlet(X, Y, Z));
    }
}

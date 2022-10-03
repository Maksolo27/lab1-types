

public class Main {

    public static void main (String[] args)  {
        int numberOfGradebook = 508;
        double c2 = numberOfGradebook % 2;
        double c3 = numberOfGradebook % 3;
        double c5 = numberOfGradebook % 5;
        double c7 = numberOfGradebook % 7;
        new Calculator ().run (c3);

    }
}

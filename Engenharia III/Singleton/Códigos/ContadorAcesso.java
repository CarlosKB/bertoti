public class ContadorAcesso {
    private static ContadorAcesso instance;
    private int count;

    ContadorAcesso() {
        this.count = 0;
    }

    public static ContadorAcesso getInstance() {
        if (instance == null) {
            instance = new ContadorAcesso();
        }
        return instance;
    }

    public void incrementCount() {
        this.count++;
    }

    public int getCount() {
        return count;
    }
}
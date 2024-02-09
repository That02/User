class Runway {
    private int length;

    public Runway(int length) {
        this.length = length;
    }

    public boolean run(int maxRunLength) {
        if (maxRunLength >= length) {
            System.out.println("Успешно пробежал дистанцию");
            return true;
        } else {
            System.out.println("Не смог пробежать дистанцию");
            return false;
        }
    }
}
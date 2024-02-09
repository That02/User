public class Main {
    public static void main(String[] args) {
        Human human = new Human();
        Cat cat = new Cat();
        Robot robot = new Robot();

        Runway runway = new Runway(10);
        Wall wall = new Wall(1);

        Object[] participants = { human, cat, robot };
        Object[] obstacles = { runway, wall };

        for (Object participant : participants) {
            for (Object obstacle : obstacles) {
                if (obstacle instanceof Runway) {
                    if (!((Runway) obstacle).run(50)) {
                        break;
                    }
                } else if (obstacle instanceof Wall) {
                    if (!((Wall) obstacle).jump(1)) {
                        break;
                    }
                }
            }
        }
    }
}
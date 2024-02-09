class Wall {
    private int height;

    public Wall(int height) {
        this.height = height;
    }

    public boolean jump(int maxJumpHeight) {
        if (maxJumpHeight >= height) {
            System.out.println("Успешно перепрыгнул стену");
            return true;
        } else {
            System.out.println("Не смог перепрыгнуть стену");
            return false;
        }
    }
}
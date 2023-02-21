public enum Color {
    RED(1), BLUE(2), WHITE(3), BLACK(4);
    public int num;
    private Color(int i) {
        this.num = i;
    }
    public void show() {
        for(Color t :Color.values())
            System.out.println(t);
    }
    public void chose(int i) {
        for(Color t :Color.values())
            if(t.num == i) {
                System.out.println(t);
            }
    }
}

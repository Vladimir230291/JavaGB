class Innerapp implements IInterface {
    IInterface v;

    public Innerapp(IInterface v) {
        this.v = v;
    }
    void write() {
        if (v != null) {
            v.print();
        }else {
            System.out.println("null, program worked");
        }
    }
    @Override
    public void print() {
        System.out.println("worked");
    }
}
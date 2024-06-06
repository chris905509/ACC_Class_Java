class full extends employee{
    int sal;

    public full(int id, int age, int sal) {
        super(id, age);
        this.sal = sal;
    }

    @Override
    public String toString() {
        return "1salary " + sal +
                " id " + id +
                " age " + age+"\n";
    }
}
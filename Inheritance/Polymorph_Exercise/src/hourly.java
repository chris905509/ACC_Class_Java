class hourly extends employee{
    int hour_rate;

    public hourly(int id, int age, int hour_rate) {
        super(id, age);
        this.hour_rate = hour_rate;
    }

    @Override
    public String toString() {
        return "3id " + id +
                " age " + age +
                " hour_rate " + hour_rate +
                '\n';
    }

    public int getHour_rate() {
        return hour_rate;
    }
}
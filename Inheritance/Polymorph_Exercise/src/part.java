class part extends employee{
    int hrs_allow;
    int hr_rate;

    public part(int id, int age, int hrs_allow, int hr_rate) {
        super(id, age);
        this.hrs_allow = hrs_allow;
        this.hr_rate = hr_rate;
    }

    @Override
    public String toString() {
        return "2id " + id +" age " + age +" hrs_allow " + hrs_allow +" hr_rate " + hr_rate+
                '\n';
    }
}
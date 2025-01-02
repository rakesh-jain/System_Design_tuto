package creationpattern.Builder;

public class Computer {
    private String RAM;
    private String HDD;
    private boolean isgraphiccardenabled;
    private boolean isBlutoothenabled;

    public boolean isIsgraphiccardenabled() {
        return isgraphiccardenabled;
    }
    public boolean isBlutoothenabled() {
        return isBlutoothenabled;
    }

    private Computer(ComputerBuilder computerBuilder) {
        this.RAM = computerBuilder.RAM;
        this.HDD = computerBuilder.HDD;
        this.isBlutoothenabled=computerBuilder.isBlutoothenabled;
        this.isgraphiccardenabled= computerBuilder.isgraphiccardenabled;
    }

    public static  class ComputerBuilder {
        private String RAM;
        private String HDD;
        private boolean isgraphiccardenabled;
        private boolean isBlutoothenabled;

        public ComputerBuilder(String RAM, String HDD) {
            this.RAM = RAM;
            this.HDD = HDD;
        }

//        public ComputerBuilder(String RAM, String HDD, boolean isgraphiccardenabled, boolean isBlutoothenabled) {
//            this.RAM = RAM;
//            this.HDD = HDD;
//            this.isgraphiccardenabled = isgraphiccardenabled;
//            this.isBlutoothenabled = isBlutoothenabled;
//        }

        public ComputerBuilder setIsgraphiccardenabled(boolean isgraphiccardenabled) {
            this.isgraphiccardenabled = isgraphiccardenabled;
            return this;
        }

        public ComputerBuilder setBlutoothenabled(boolean blutoothenabled) {
            this.isBlutoothenabled = blutoothenabled;
            return this;
        }
        public Computer Build(){
            return new Computer(this);
        }
    }

    @Override
    public String toString() {
        return "Computer{" +
                "RAM='" + RAM + '\'' +
                ", HDD='" + HDD + '\'' +
                ", isgraphiccardenabled=" + isgraphiccardenabled +
                ", isBlutoothenabled=" + isBlutoothenabled +
                '}';
    }
}

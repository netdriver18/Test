package module3.homeTask_4_Anonymous.InnerClasses;

public class CPU {
    private double prise;

    public CPU(double prise) {
        this.prise = prise;
    }

    public void setPrise(double prise) {
        this.prise = prise;
    }

    public double getPrise() {
        return prise;
    }

    @Override
    public String toString() {
        return "CPU{" +
                "prise=" + prise +
                '}';
    }

    class Processor {
        private int cores;
        private String manufacturer;

        public int getCores() {
            return this.cores;
        }

        public String getManufacturer() {
            return this.manufacturer;
        }

        public void setCores(int cores) {
            this.cores = cores;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }

        @Override
        public String toString() {
            return "Processor{" +
                    "cores=" + cores +
                    ", manufacturer='" + manufacturer + '\'' +
                    '}';
        }
    }

    class RAM {
        private double memory;
        private String manufacturer;

        @Override
        public String toString() {
            return "RAM{" +
                    "memory=" + memory +
                    ", manufacturer='" + manufacturer + '\'' +
                    '}';
        }

        public double getMemory() {
            return memory;
        }

        public String getManufacturer() {
            return manufacturer;
        }

        public void setMemory(double memory) {
            this.memory = memory;
        }

        public void setManufacturer(String manufacturer) {
            this.manufacturer = manufacturer;
        }
    }
}

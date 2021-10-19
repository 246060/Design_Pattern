package builder.case3;

public class Computer {

    private int serialNumber;
    private String model;
    private String vender;
    private String cpu;
    private int ram;
    private int disk;
    private String graphicCard;


    private void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    private void setModel(String model) {
        this.model = model;
    }

    private void setVender(String vender) {
        this.vender = vender;
    }

    private void setCpu(String cpu) {
        this.cpu = cpu;
    }

    private void setRam(int ram) {
        this.ram = ram;
    }

    private void setDisk(int disk) {
        this.disk = disk;
    }

    private void setGraphicCard(String graphicCard) {
        this.graphicCard = graphicCard;
    }

    @Override
    public String toString() {
        return "Computer{" +
                "serialNumber=" + serialNumber +
                ", model='" + model + '\'' +
                ", vender='" + vender + '\'' +
                ", cpu='" + cpu + '\'' +
                ", ram=" + ram +
                ", disk=" + disk +
                ", graphicCard='" + graphicCard + '\'' +
                '}';
    }


    public static class ComputerBuilder {
        private int serialNumber;
        private String model;
        private String vender;
        private String cpu;
        private int ram;
        private int disk;
        private String graphicCard;

        public ComputerBuilder serialNumber(int serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }

        public ComputerBuilder model(String model) {
            this.model = model;
            return this;
        }

        public ComputerBuilder vender(String vender) {
            this.vender = vender;
            return this;
        }

        public ComputerBuilder cpu(String cpu) {
            this.cpu = cpu;
            return this;
        }

        public ComputerBuilder ram(int ram) {
            this.ram = ram;
            return this;
        }

        public ComputerBuilder disk(int disk) {
            this.disk = disk;
            return this;
        }

        public ComputerBuilder graphicCard(String graphicCard) {
            this.graphicCard = graphicCard;
            return this;
        }

        public Computer build() {
            Computer computer = new Computer();
            computer.setSerialNumber(this.serialNumber);
            computer.setModel(this.model);
            computer.setVender(this.vender);
            computer.setCpu(this.cpu);
            computer.setRam(this.ram);
            computer.setDisk(this.disk);
            computer.setGraphicCard(this.graphicCard);
            return computer;
        }
    }
}

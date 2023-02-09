import java.util.Objects;

public class noteBook {
    private String OS;
    private String model;
    private Integer memorySize;
    private String typeDisk;
    private Integer diskCapacity;
    private String modelCPU;

    public noteBook(String OS, String model, Integer memorySize, String typeDisk, Integer diskCapacity, String modelCPU) {
        this.OS = OS;
        this.model = model;
        this.memorySize = memorySize;
        this.typeDisk = typeDisk;
        this.diskCapacity = diskCapacity;
        this.modelCPU = modelCPU;
    }

    public String getOS() {
        return OS;
    }

    public void setOS(String OS) {
        this.OS = OS;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getMemorySize() {
        return memorySize;
    }

    public void setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
    }

    public String getTypeDisk() {
        return typeDisk;
    }

    public void setTypeDisk(String typeDisk) {
        this.typeDisk = typeDisk;
    }

    public Integer getDiskCapacity() {
        return diskCapacity;
    }

    public void setDiskCapacity(Integer diskCapacity) {
        this.diskCapacity = diskCapacity;
    }

    public String getModelCPU() {
        return modelCPU;
    }

    public void setModelCPU(String modelCPU) {
        this.modelCPU = modelCPU;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof noteBook noteBook)) return false;
        return Objects.equals(OS, noteBook.OS) && Objects.equals(model, noteBook.model)
                && Objects.equals(memorySize, noteBook.memorySize)
                && Objects.equals(typeDisk, noteBook.typeDisk)
                && Objects.equals(diskCapacity, noteBook.diskCapacity)
                && Objects.equals(modelCPU, noteBook.modelCPU);
    }

    @Override
    public int hashCode() {
        return Math.abs(Objects.hash(OS, model, memorySize, typeDisk, diskCapacity, modelCPU));
    }

    @Override
    public String toString() {
        return "noteBook{" +
                "OS= '" + OS + '\'' +
                ", model= '" + model + '\'' +
                ", memorySize= " + memorySize + "Gb" +
                ", typeDisk= '" + typeDisk + '\'' +
                ", diskCapacity= " + diskCapacity + "Gb" +
                ", modelCPU= '" + modelCPU + '\'' +
                '}';
    }
}

package com.company;

public class PCBuilder {
    private PC pc = new PC();

    public void reset() {
        this.pc = new PC();
    }

    public void setRam(int new_ram) {
        this.pc.ram = new_ram;
    }

    public void setCPU(String new_cpu) {
        this.pc.cpu = new_cpu;
    }

    public void setGPU(String new_gpu) {
        this.pc.gpu = new_gpu;
    }

    public PC getPC() {
        return this.pc;
    }
}

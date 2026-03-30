package adpter;

import computer.TV;
import computer.Vga;

public class HdmiVgaAdapterHeritage extends TV implements Vga {
    @Override
    public void print(String message) {
        System.out.println("********* Adapter **********");
        byte[] data = message.getBytes();
        super.view(data);
        System.out.println("********* Adapter **********");
    }
}

package computer;

public class UniteCentre implements Vga {
    private Vga vga;

    public void setVga(Vga vga) {
        this.vga = vga;
    }

    @Override
    public void print(String message) {
        System.out.println("********* Computer **********");
        vga.print(message);

    }
}

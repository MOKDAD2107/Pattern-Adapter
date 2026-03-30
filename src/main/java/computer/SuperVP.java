package computer;

public class SuperVP implements Vga, Hdmi {
    @Override
    public void view(byte[] data) {
        System.out.println("......... SuperVP Hdmi .........");
     String message = new String(data);
     System.out.println(message);
        System.out.println("......... SuperVP Hdmi .........");
    }

    @Override
    public void print(String message) {
        System.out.println("......... SuperVP Vga .........");
        System.out.println(message);
        System.out.println("......... SuperVP Vga .........");

    }
}

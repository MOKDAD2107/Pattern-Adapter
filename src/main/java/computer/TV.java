package computer;

public class TV implements Hdmi{
    @Override
    public void view(byte[] data) {
        System.out.println("_________ TV ________");
        String msg = new String (data);
        System.out.println(msg);
        System.out.println("_________ TV ________");
    }
}

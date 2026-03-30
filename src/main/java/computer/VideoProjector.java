package computer;

public class VideoProjector implements Vga {
    @Override
    public void print(String message) {
        System.out.println("========= Video Projector =========");
        System.out.println(message);
        System.out.println("========= Video Projector =========");
    }
}

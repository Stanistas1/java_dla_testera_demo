package model.computer;

public interface Video {
    void playVideo();
    void stopVideo();
    void pauseVideo();

    default void sayHello() {
        System.out.println("Hello from default video");
    }
}

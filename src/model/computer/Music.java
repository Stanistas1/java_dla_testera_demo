package model.computer;

public interface Music {

    String NAME = "MUSIC";

    void playMusic();
    void pauseMusic();
    void stopMusic();

    default void sayHello() {
        System.out.println("Hello from default music");
    }

    static String getName() {
        return NAME;
    }

    public static void privateMethod() {
        System.out.println("hello from pirivate method");
    }
}

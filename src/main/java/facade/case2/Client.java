package facade.case2;

import java.io.File;

public class Client {

    // https://refactoring.guru/design-patterns/facade/java/example
    public static void main(String[] args) {

        VideoConversionFacade converter = new VideoConversionFacade();

        File mp4Video = converter.convertVideo("youtubevideo.ogg", "mp4");
        // ...
    }
}

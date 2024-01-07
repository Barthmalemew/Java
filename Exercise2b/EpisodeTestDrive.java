class Episode{

    int seriesNumber;
    int episodeNumber;

    void skipIntro()
    {
        System.out.println("Skipping intro...");
    }

    void skipToNext()
    {
        System.out.println("Loading next episode...");
    }

    void play()
    {
        System.out.println("Playing episode " + episodeNumber);
    }
}
public class EpisodeTestDrive {
    public static void main(String[] args){

        Episode episode = new Episode();
        episode.seriesNumber = 4;
        episode.play();
        episode.skipToNext();
    }
}

package spring;

import org.springframework.beans.factory.annotation.Value;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.Random;

public class MusicPlayer {
    @Value("${musicPlayer.name}")
    private String name;
    @Value("${musicPlayer.volume}")
    private int volume;

    public String getName() {
        return name;
    }

    public int getVolume() {
        return volume;
    }

    //    private Music music1;
//    private Music music2;
    protected List<Music> genreList = new ArrayList<>();

    public MusicPlayer(List<Music> genreList) {
        this.genreList = genreList;
    }

    //    public MusicPlayer(@Qualifier("rockMusic") Music music1,
//                       @Qualifier("classicMusic") Music music2) {
//        this.music1 = music1;
//        this.music2 = music2;
//    }

    public String playMusic() {
        Random random = new Random();
        int index = random.nextInt(genreList.size());
        return genreList.get(index).getSong();

//        switch (musicGenre.name()) {
//            case ("ROCK"):
//                return music1.getSong();
//            case ("CLASSICAL"):
//                return music2.getSong();
//        }
//        return "тишина, песен и жанра нет";

//        return "Playing " + music1.getSong() + " and " + " \n " + music2.getSong();

    }
}

package spring.genre;

import spring.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;
import java.util.Random;


public class ClassicMusic implements Music {
    private final Random random = new Random();

    protected static List<String> classicList = Arrays.asList("Лунная соната", "симфония номер 2", "времена года - весна");

    public ClassicMusic() {
    }

    ;

    public static ClassicMusic getClassicMusic() {
        return new ClassicMusic();
    }

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization classicMusic");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction classicMusic");
    }

    @Override
    public String getSong() {
        int index = random.nextInt(classicList.size());
        return "Playing " + classicList.get(index);
    }
}

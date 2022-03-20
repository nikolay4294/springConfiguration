package spring.genre;

import org.springframework.stereotype.Component;
import spring.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class RockMusic implements Music {
    private final Random random = new Random();

    protected static List<String> rockList = Arrays.asList("рокпесня", "рокпесня2", "рокпесня3");

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization rockMusic");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction rockMusic");
    }

    @Override
    public String getSong() {
        int index = random.nextInt(rockList.size());
        return "Playing " + rockList.get(index);
    }
}

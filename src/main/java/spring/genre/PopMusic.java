package spring.genre;

import spring.Music;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;
import java.util.Arrays;
import java.util.List;
import java.util.Random;

public class PopMusic implements Music {
    private final Random random = new Random();

    protected static List<String> popList = Arrays.asList("ПОПпесня", "ПОПпесня2", "ПОПпесня3");

    @PostConstruct
    public void doMyInit() {
        System.out.println("Doing my initialization popMusic");
    }

    @PreDestroy
    public void doMyDestroy() {
        System.out.println("Doing my destruction popMusic");
    }

    @Override
    public String getSong() {
        int index = random.nextInt(popList.size());
        return "Playing " + popList.get(index);
    }
}

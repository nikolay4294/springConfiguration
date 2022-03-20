package spring;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import spring.genre.ClassicMusic;
import spring.genre.PopMusic;
import spring.genre.RockMusic;

import java.util.ArrayList;
import java.util.List;

@Configuration
@ComponentScan("spring")
@PropertySource("classpath:musicPlayer.properties")
public class SpringConfig {

    @Bean
    public ClassicMusic classicMusic() {
        return new ClassicMusic();
    }

    @Bean
    public RockMusic rockMusic() {
        return new RockMusic();
    }

    @Bean
    public MusicPlayer musicPlayer() {
        return new MusicPlayer(musicGenreList()); //внедряем зависимости вручную
    }

    @Bean
    public Computer computer() {
        return new Computer(musicPlayer());
    }

    @Bean
    public PopMusic popMusic() {
        return new PopMusic();
    }

    @Bean
    public List<Music> musicGenreList() {
        List<Music> genreList = new ArrayList<>();
        genreList.add(rockMusic());
        genreList.add(classicMusic());
        genreList.add(popMusic());
        return genreList;
    }
}

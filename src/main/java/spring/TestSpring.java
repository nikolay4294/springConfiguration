package spring;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class TestSpring {
    public static void main(String[] args) {
//        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
//                "applicationContext.xml"
//        );

        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(
                SpringConfig.class);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());
//
//        ClassicMusic classicMusic1 = context.getBean("classicMusic", ClassicMusic.class);
//        ClassicMusic classicMusic2 = context.getBean("classicMusic", ClassicMusic.class);
//
//        System.out.println(classicMusic1 == classicMusic2); //указывают на один участок в памяти?один и тот же объект?

        Computer computer = context.getBean("computer", Computer.class);
        System.out.println(computer);

//        MusicPlayer musicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//        musicPlayer.playMusic();

//        Music music = context.getBean("rockMusic", RockMusic.class); //1 id бина, 2 класс, бин которого создаем
//
//        MusicPlayer musicPlayer = new MusicPlayer(music);
//
//        musicPlayer.playMusic();
//
//        Music music2 = context.getBean("popMusic", PopMusic.class);
//
//        MusicPlayer popMusicPlayer = new MusicPlayer(music2);
//
//        popMusicPlayer.playMusic();

//        MusicPlayer secondMusicPlayer = context.getBean("musicPlayer", MusicPlayer.class);
//
//        boolean comparison = firstMusicPlayer == secondMusicPlayer;
//        System.out.println(comparison);
//        System.out.println(firstMusicPlayer);
//        System.out.println(secondMusicPlayer);
//
//        firstMusicPlayer.setVolume(10);
//
//        System.out.println(firstMusicPlayer.getVolume());
//        System.out.println(secondMusicPlayer.getVolume());
//
//        musicPlayer.playMusicList();
//        System.out.println(music.getSong());
//        System.out.println(musicPlayer.getName());
//        System.out.println(musicPlayer.getVolume());

        context.close(); // закрываем контекст
    }
}

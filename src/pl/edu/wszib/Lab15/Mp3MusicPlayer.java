package pl.edu.wszib.Lab15;

public class Mp3MusicPlayer extends MusicPlayer {


    public Mp3MusicPlayer(Song[] library, Song[] library1) {
        super(library);
        this.library = library1;
    }

    Song[] library = {new Song("Rihanna","Umbrela","First Album"),
            new Song("Katty Perry", "Roar","Second Album"),
            new Song("Kwiat jabłoni","Buka","Niemożliwe"),
            new Song("David Geuetta","Sexy Bitch","One Love"),
            new Song("Akon", "Lonely","Trouble"),
            new Song("Enej","Skrzydlate ręce","Folkhorod")

    };



    @Override
    public void play() {
        System.out.println("MP3 odtwarza");
    }

    @Override
    public void pauza() {
        System.out.println("MP3 pauza");
    }

    @Override
    public void stop() {
        System.out.println("MP3 stop");

    }



}
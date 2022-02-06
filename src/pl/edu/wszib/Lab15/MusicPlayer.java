package pl.edu.wszib.Lab15;

abstract public class MusicPlayer implements Player {

   private Song[] library;
   private  int current;

    public MusicPlayer(Song[] library) {
        this.library = library;
    }

    public Song getCurrentSong(){
        return library[current];
    }

    @Override
    public void nextSong() {
        if (++current >= library.length){
            current = 0;
        }
        play();
    }

    @Override
    public void previousSong() {
        if (--current < 0){
            current = library.length-1;
        }
        play();
    }
}

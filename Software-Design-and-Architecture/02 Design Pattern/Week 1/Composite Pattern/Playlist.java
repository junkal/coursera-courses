package Structural.CompositePattern.Assignment;

import java.util.ArrayList;

public class Playlist implements IComponent {
    private String playlistName;
    private ArrayList<IComponent> playlist = new ArrayList<>();

    public Playlist(String playlistName) {
        this.playlistName = playlistName;
    }

    public void add(IComponent component) {
        this.playlist.add(component);
    }

    @Override
    public void play() {

    }

    @Override
    public void setPlaybackSpeed(float speed) {

    }

    @Override
    public String getName() {
        return null;
    }
}

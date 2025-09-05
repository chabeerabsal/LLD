package Model;

public class Player {
    private String playername;
    private PlayingPiece playingPiece;
    public Player(String playername, PlayingPiece playingPiece) {
        this.playername = playername;
        this.playingPiece = playingPiece;
    }
    public String getPlayername() {
        return playername;
    }
    public void setPlayername(String playername) {
        this.playername = playername;
    }
    public PlayingPiece getPlayingPiece() {
        return playingPiece;
    }
    public void setPlayingPiece(PlayingPiece playingPiece) {
        this.playingPiece = playingPiece;
    }
}

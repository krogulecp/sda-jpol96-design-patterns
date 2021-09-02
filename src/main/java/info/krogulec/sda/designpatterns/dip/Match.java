package info.krogulec.sda.designpatterns.dip;

import java.util.List;

public class Match {
    private final List<SoccerPlayer> players;

    public Match(List<SoccerPlayer> players) {
        this.players = players;
    }

    public void match(){
        players.forEach(SoccerPlayer::play);
    }
}

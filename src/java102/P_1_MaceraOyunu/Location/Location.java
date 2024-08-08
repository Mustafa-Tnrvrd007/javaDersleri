package java102.P_1_MaceraOyunu.Location;

import java102.P_1_MaceraOyunu.Player;

public abstract class Location {
    private Player player;
    private String locationName;

    Location(Player player, String locationName) {
        setPlayer(player);
        setLocationName(locationName);
    }
    public abstract boolean onLocation();

    public void setPlayer(Player player) {
        this.player = player;
    }

    public Player getPlayer() {
        return player;
    }

    public void setLocationName(String locationName) {
        this.locationName = locationName;
    }

    public String getLocationName() {
        return locationName;
    }
}

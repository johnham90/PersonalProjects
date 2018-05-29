package ca.bcit.comp1510.lab11;

/**
 * Player represents a player.
 *
 * @author John Ham
 * @version 2018
 */
public class Player implements Comparable<Player> {
    
    /** Name of player. */
    private final String name;
    
    /** String for team name. */
    private final String teamName;
    
    /** Integer for jersey number. */
    private final int jerseyNumber;
    
    /**
     * Constructs an object of type Player by taking in inputs for the name,
     * team name, and jersey number.
     *
     * @param name
     *          string containing name
     * @param teamName
     *          string containing team name
     * @param jerseyNumber
     *          integer for jersey number
     */
    public Player(String name, String teamName, int jerseyNumber) {
        if (name.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Please enter a name for the player.");
        }
        if (teamName.trim().isEmpty()) {
            throw new IllegalArgumentException(
                    "Please enter a name for the player.");
        }
        if (jerseyNumber < 1) {
            throw new IllegalArgumentException(
                    "Please enter a positive integer for the jersey number.");
        }
        this.name = name;
        this.teamName = teamName;
        this.jerseyNumber = jerseyNumber;
    }
    
    /**
     * Returns the name.
     * 
     * @return name
     */
    public String getName() {
        return name;
    }
    
    /**
     * Returns the team name.
     * 
     * @return teamName
     */
    public String getTeamName() {
        return teamName;
    }
    
    /**
     * Returns the jersey number.
     * 
     * @return jerseyNumber
     */
    public int getJerseyNumber() {
        return jerseyNumber;
    }
    
    /**
     * Checks if an object is the same object as the player.
     * 
     * @see java.lang.Object#equals(java.lang.Object)
     * @param other
     *          Object
     * @return boolean value
     */
    public boolean equals(Object other) {
        if (other == null) {
            return false;
        }
        if (other == this) {
            return true;
        }
        if (!getClass().equals(other.getClass())) {
            return false;
        }
        return this.getName().equals(((Player) other).getName())
                && this.getTeamName().equals(((Player) other).getTeamName())
                && this.getJerseyNumber() == ((Player) other).getJerseyNumber();
    }

    @Override
    public int compareTo(Player player) {
        return jerseyNumber - player.getJerseyNumber();
    }
    
    /**
     * Returns a string representation of player.
     * 
     * @see java.lang.Object#toString()
     * @return string
     */
    public String toString() {
        return "Player [Name : " + name + " Team Name : " + teamName 
                + " Jersey Number : " + jerseyNumber + "]";
    }
}

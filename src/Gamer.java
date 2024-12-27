public class Gamer {
    private final String nickname;
    private final boolean isActive;


    @Override
    public String toString() {
        return "Имя: " + nickname + '\n' +
                "Online: " + isActive;
    }

    public Gamer (String nickname, boolean isActive) {
        this.nickname = nickname;
        this.isActive = isActive;
    }

    public boolean isActive() {
        return isActive;
    }
}

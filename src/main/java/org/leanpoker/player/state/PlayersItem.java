package org.leanpoker.player.state;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class PlayersItem {

    @SerializedName("bet")
    private int bet;

    @SerializedName("stack")
    private int stack;

    @SerializedName("name")
    private String name;

    @SerializedName("id")
    private int id;

    @SerializedName("version")
    private String version;

    @SerializedName("status")
    private String status;

    @SerializedName("hole_cards")
    private List<CardsItem> holeCards;

    public int getBet() {
        return bet;
    }

    public void setBet(int bet) {
        this.bet = bet;
    }

    public int getStack() {
        return stack;
    }

    public void setStack(int stack) {
        this.stack = stack;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public List<CardsItem> getHoleCards() {
        return holeCards;
    }

    public void setHoleCards(List<CardsItem> holeCards) {
        this.holeCards = holeCards;
    }

    @Override
    public String toString() {
        return
                "PlayersItem{" +
                        "bet = '" + bet + '\'' +
                        ",stack = '" + stack + '\'' +
                        ",name = '" + name + '\'' +
                        ",id = '" + id + '\'' +
                        ",version = '" + version + '\'' +
                        ",status = '" + status + '\'' +
                        ",hole_cards = '" + holeCards + '\'' +
                        "}";
    }
}
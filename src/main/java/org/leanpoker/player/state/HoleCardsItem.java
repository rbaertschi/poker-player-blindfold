package org.leanpoker.player.state;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;

@Generated("com.robohorse.robopojogenerator")
public class HoleCardsItem {

    @SerializedName("rank")
    private String rank;

    @SerializedName("suit")
    private String suit;

    public String getRank() {
        return rank;
    }

    public void setRank(String rank) {
        this.rank = rank;
    }

    public String getSuit() {
        return suit;
    }

    public void setSuit(String suit) {
        this.suit = suit;
    }

    @Override
    public String toString() {
        return
                "HoleCardsItem{" +
                        "rank = '" + rank + '\'' +
                        ",suit = '" + suit + '\'' +
                        "}";
    }
}
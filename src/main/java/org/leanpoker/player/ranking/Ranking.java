package org.leanpoker.player.ranking;

import com.google.gson.annotations.SerializedName;
import org.leanpoker.player.state.CardsItem;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class Ranking {

    @SerializedName("cards_used")
    private List<CardsItem> cardsUsed;

    @SerializedName("second_value")
    private int secondValue;

    @SerializedName("cards")
    private List<CardsItem> cards;

    @SerializedName("rank")
    private int rank;

    @SerializedName("kickers")
    private List<Integer> kickers;

    @SerializedName("value")
    private int value;

    public List<CardsItem> getCardsUsed() {
        return cardsUsed;
    }

    public void setCardsUsed(List<CardsItem> cardsUsed) {
        this.cardsUsed = cardsUsed;
    }

    public int getSecondValue() {
        return secondValue;
    }

    public void setSecondValue(int secondValue) {
        this.secondValue = secondValue;
    }

    public List<CardsItem> getCards() {
        return cards;
    }

    public void setCards(List<CardsItem> cards) {
        this.cards = cards;
    }

    public int getRank() {
        return rank;
    }

    public void setRank(int rank) {
        this.rank = rank;
    }

    public List<Integer> getKickers() {
        return kickers;
    }

    public void setKickers(List<Integer> kickers) {
        this.kickers = kickers;
    }

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    @Override
    public String toString() {
        return
                "Request{" +
                        "cards_used = '" + cardsUsed + '\'' +
                        ",second_value = '" + secondValue + '\'' +
                        ",cards = '" + cards + '\'' +
                        ",rank = '" + rank + '\'' +
                        ",kickers = '" + kickers + '\'' +
                        ",value = '" + value + '\'' +
                        "}";
    }
}
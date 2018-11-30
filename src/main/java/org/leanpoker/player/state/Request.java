package org.leanpoker.player.state;

import com.google.gson.annotations.SerializedName;

import javax.annotation.Generated;
import java.util.List;

@Generated("com.robohorse.robopojogenerator")
public class Request {

    @SerializedName("in_action")
    private int inAction;

    @SerializedName("community_cards")
    private List<CardsItem> communityCards;

    @SerializedName("players")
    private List<PlayersItem> players;

    @SerializedName("tournament_id")
    private String tournamentId;

    @SerializedName("current_buy_in")
    private int currentBuyIn;

    @SerializedName("round")
    private int round;

    @SerializedName("pot")
    private int pot;

    @SerializedName("minimum_raise")
    private int minimumRaise;

    @SerializedName("bet_index")
    private int betIndex;

    @SerializedName("orbits")
    private int orbits;

    @SerializedName("dealer")
    private int dealer;

    @SerializedName("small_blind")
    private int smallBlind;

    @SerializedName("game_id")
    private String gameId;

    public int getInAction() {
        return inAction;
    }

    public void setInAction(int inAction) {
        this.inAction = inAction;
    }

    public List<CardsItem> getCommunityCards() {
        return communityCards;
    }

    public void setCommunityCards(List<CardsItem> communityCards) {
        this.communityCards = communityCards;
    }

    public List<PlayersItem> getPlayers() {
        return players;
    }

    public void setPlayers(List<PlayersItem> players) {
        this.players = players;
    }

    public String getTournamentId() {
        return tournamentId;
    }

    public void setTournamentId(String tournamentId) {
        this.tournamentId = tournamentId;
    }

    public int getCurrentBuyIn() {
        return currentBuyIn;
    }

    public void setCurrentBuyIn(int currentBuyIn) {
        this.currentBuyIn = currentBuyIn;
    }

    public int getRound() {
        return round;
    }

    public void setRound(int round) {
        this.round = round;
    }

    public int getPot() {
        return pot;
    }

    public void setPot(int pot) {
        this.pot = pot;
    }

    public int getMinimumRaise() {
        return minimumRaise;
    }

    public void setMinimumRaise(int minimumRaise) {
        this.minimumRaise = minimumRaise;
    }

    public int getBetIndex() {
        return betIndex;
    }

    public void setBetIndex(int betIndex) {
        this.betIndex = betIndex;
    }

    public int getOrbits() {
        return orbits;
    }

    public void setOrbits(int orbits) {
        this.orbits = orbits;
    }

    public int getDealer() {
        return dealer;
    }

    public void setDealer(int dealer) {
        this.dealer = dealer;
    }

    public int getSmallBlind() {
        return smallBlind;
    }

    public void setSmallBlind(int smallBlind) {
        this.smallBlind = smallBlind;
    }

    public String getGameId() {
        return gameId;
    }

    public void setGameId(String gameId) {
        this.gameId = gameId;
    }

    @Override
    public String toString() {
        return
                "Request{" +
                        "in_action = '" + inAction + '\'' +
                        ",community_cards = '" + communityCards + '\'' +
                        ",players = '" + players + '\'' +
                        ",tournament_id = '" + tournamentId + '\'' +
                        ",current_buy_in = '" + currentBuyIn + '\'' +
                        ",round = '" + round + '\'' +
                        ",pot = '" + pot + '\'' +
                        ",minimum_raise = '" + minimumRaise + '\'' +
                        ",bet_index = '" + betIndex + '\'' +
                        ",orbits = '" + orbits + '\'' +
                        ",dealer = '" + dealer + '\'' +
                        ",small_blind = '" + smallBlind + '\'' +
                        ",game_id = '" + gameId + '\'' +
                        "}";
    }
}
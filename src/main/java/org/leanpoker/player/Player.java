package org.leanpoker.player;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import org.leanpoker.player.state.PlayersItem;
import org.leanpoker.player.state.Request;

public class Player {
    // test comment

    static final String VERSION = "Default Java folding player";

    public static int betRequest(JsonElement request) {
        Request     input     = new Gson().fromJson(request, Request.class);
        PlayersItem ourPlayer = input.getPlayers().get(input.getInAction());

        int newBet = input.getCurrentBuyIn() - ourPlayer.getBet();

        newBet = input.getCurrentBuyIn() < (ourPlayer.getStack() / 4) ? newBet : 0;

        if ("A".equals(ourPlayer.getHoleCards().get(0).getRank()) && "A".equals(ourPlayer.getHoleCards().get(1).getRank())) {
            newBet = ourPlayer.getStack();
        }

        return newBet;
    }

    public static void showdown(JsonElement game) {
    }
}

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

        int newBet = input.getCurrentBuyIn() - ourPlayer.getBet() + input.getMinimumRaise();
        return newBet < (ourPlayer.getStack() / 4) ? newBet : 0;
    }

    public static void showdown(JsonElement game) {
    }
}

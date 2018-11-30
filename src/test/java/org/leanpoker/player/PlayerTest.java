package org.leanpoker.player;

import com.google.gson.JsonParser;
import org.junit.Test;

import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

public class PlayerTest {
    @Test
    public void betRequestCanParseRequest() {
        String input = "{\n" +
                "    \"tournament_id\": \"550d1d68cd7bd10003000003\",\n" +
                "    \"game_id\": \"550da1cb2d909006e90004b1\",\n" +
                "    \"round\": 0,\n" +
                "    \"bet_index\": 0,\n" +
                "    \"small_blind\": 10,\n" +
                "    \"current_buy_in\": 320,\n" +
                "    \"pot\": 400,\n" +
                "    \"minimum_raise\": 240,\n" +
                "    \"dealer\": 1,\n" +
                "    \"orbits\": 7,\n" +
                "    \"in_action\": 1,\n" +
                "    \"players\": [\n" +
                "        {\n" +
                "            \"id\": 0,\n" +
                "            \"name\": \"Albert\",\n" +
                "            \"status\": \"active\",\n" +
                "            \"version\": \"Default random player\",\n" +
                "            \"stack\": 1010,\n" +
                "            \"bet\": 320\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 1,\n" +
                "            \"name\": \"Bob\",\n" +
                "            \"status\": \"active\",\n" +
                "            \"version\": \"Default random player\",\n" +
                "            \"stack\": 1590,\n" +
                "            \"bet\": 80,\n" +
                "            \"hole_cards\": [\n" +
                "                {\n" +
                "                    \"rank\": \"6\",\n" +
                "                    \"suit\": \"hearts\"\n" +
                "                },\n" +
                "                {\n" +
                "                    \"rank\": \"K\",\n" +
                "                    \"suit\": \"spades\"\n" +
                "                }\n" +
                "            ]\n" +
                "        },\n" +
                "        {\n" +
                "            \"id\": 2,\n" +
                "            \"name\": \"Chuck\",\n" +
                "            \"status\": \"out\",\n" +
                "            \"version\": \"Default random player\",\n" +
                "            \"stack\": 0,\n" +
                "            \"bet\": 0\n" +
                "        }\n" +
                "    ],\n" +
                "    \"community_cards\": [\n" +
                "        {\n" +
                "            \"rank\": \"4\",\n" +
                "            \"suit\": \"spades\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"rank\": \"A\",\n" +
                "            \"suit\": \"hearts\"\n" +
                "        },\n" +
                "        {\n" +
                "            \"rank\": \"6\",\n" +
                "            \"suit\": \"clubs\"\n" +
                "        }\n" +
                "    ]\n" +
                "}";


        int actual = Player.betRequest(new JsonParser().parse(input));

        assertThat(actual, is(0));
    }
}
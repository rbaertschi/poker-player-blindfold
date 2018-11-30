package org.leanpoker.player.state;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;

@Generated("com.robohorse.robopojogenerator")
public class CardsItem{

	@SerializedName("rank")
	private String rank;

	@SerializedName("suit")
	private String suit;

	public void setRank(String rank){
		this.rank = rank;
	}

	public String getRank(){
		return rank;
	}

	public void setSuit(String suit){
		this.suit = suit;
	}

	public String getSuit(){
		return suit;
	}

	@Override
 	public String toString(){
		return 
			"CardsItem{" + 
			"rank = '" + rank + '\'' + 
			",suit = '" + suit + '\'' + 
			"}";
		}
}
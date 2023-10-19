package com.daniilk.cryptoapp.pojo

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.daniilk.cryptoapp.api.ApiFactory.BASE_IMAGE_URL
import com.daniilk.cryptoapp.utils.convertTimestampToTime
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

@Entity(tableName = "full_price_list")
data class CoinPriceInfo(
    @PrimaryKey
    @SerializedName("FROMSYMBOL")
    @Expose
    var fromSymbol: String,

    @SerializedName("TOSYMBOL")
    @Expose
    var toSymbol: String,

    @SerializedName("PRICE")
    @Expose
    var price: String,

    @SerializedName("LOWDAY")
    @Expose
    var lowDay: String,

    @SerializedName("HIGHDAY")
    @Expose
    var highDay: String,

    @SerializedName("LASTMARKET")
    @Expose
    var lastMarket: String,

    @SerializedName("IMAGEURL")
    @Expose
    var imageurl: String,

    @SerializedName("TYPE")
    @Expose
    var type: String,

    @SerializedName("MARKET")
    @Expose
    var market: String,

    @SerializedName("FLAGS")
    @Expose
    var flags: String,

    @SerializedName("LASTUPDATE")
    @Expose
    var lastUpdate: Long?

    ) {
    fun getFormattedTime(): String {
        return convertTimestampToTime(lastUpdate)
    }

    fun getFullImageUrl(): String {
        return BASE_IMAGE_URL + imageurl
    }
}

package com.chachaup.ibook.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class RanksHistory implements Parcelable
{

    @SerializedName("primary_isbn10")
    @Expose
    private String primaryIsbn10;
    @SerializedName("primary_isbn13")
    @Expose
    private String primaryIsbn13;
    @SerializedName("rank")
    @Expose
    private Integer rank;
    @SerializedName("list_name")
    @Expose
    private String listName;
    @SerializedName("display_name")
    @Expose
    private String displayName;
    @SerializedName("published_date")
    @Expose
    private String publishedDate;
    @SerializedName("bestsellers_date")
    @Expose
    private String bestsellersDate;
    @SerializedName("weeks_on_list")
    @Expose
    private Integer weeksOnList;
    @SerializedName("rank_last_week")
    @Expose
    private Integer rankLastWeek;
    @SerializedName("asterisk")
    @Expose
    private Integer asterisk;
    @SerializedName("dagger")
    @Expose
    private Integer dagger;
    public final static Creator<RanksHistory> CREATOR = new Creator<RanksHistory>() {


        @SuppressWarnings({
            "unchecked"
        })
        public RanksHistory createFromParcel(android.os.Parcel in) {
            return new RanksHistory(in);
        }

        public RanksHistory[] newArray(int size) {
            return (new RanksHistory[size]);
        }

    }
    ;

    protected RanksHistory(android.os.Parcel in) {
        this.primaryIsbn10 = ((String) in.readValue((String.class.getClassLoader())));
        this.primaryIsbn13 = ((String) in.readValue((String.class.getClassLoader())));
        this.rank = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.listName = ((String) in.readValue((String.class.getClassLoader())));
        this.displayName = ((String) in.readValue((String.class.getClassLoader())));
        this.publishedDate = ((String) in.readValue((String.class.getClassLoader())));
        this.bestsellersDate = ((String) in.readValue((String.class.getClassLoader())));
        this.weeksOnList = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.rankLastWeek = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.asterisk = ((Integer) in.readValue((Integer.class.getClassLoader())));
        this.dagger = ((Integer) in.readValue((Integer.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public RanksHistory() {
    }

    /**
     * 
     * @param primaryIsbn13
     * @param dagger
     * @param displayName
     * @param asterisk
     * @param rank
     * @param listName
     * @param publishedDate
     * @param primaryIsbn10
     * @param rankLastWeek
     * @param bestsellersDate
     * @param weeksOnList
     */
    public RanksHistory(String primaryIsbn10, String primaryIsbn13, Integer rank, String listName, String displayName, String publishedDate, String bestsellersDate, Integer weeksOnList, Integer rankLastWeek, Integer asterisk, Integer dagger) {
        super();
        this.primaryIsbn10 = primaryIsbn10;
        this.primaryIsbn13 = primaryIsbn13;
        this.rank = rank;
        this.listName = listName;
        this.displayName = displayName;
        this.publishedDate = publishedDate;
        this.bestsellersDate = bestsellersDate;
        this.weeksOnList = weeksOnList;
        this.rankLastWeek = rankLastWeek;
        this.asterisk = asterisk;
        this.dagger = dagger;
    }

    public String getPrimaryIsbn10() {
        return primaryIsbn10;
    }

    public void setPrimaryIsbn10(String primaryIsbn10) {
        this.primaryIsbn10 = primaryIsbn10;
    }

    public String getPrimaryIsbn13() {
        return primaryIsbn13;
    }

    public void setPrimaryIsbn13(String primaryIsbn13) {
        this.primaryIsbn13 = primaryIsbn13;
    }

    public Integer getRank() {
        return rank;
    }

    public void setRank(Integer rank) {
        this.rank = rank;
    }

    public String getListName() {
        return listName;
    }

    public void setListName(String listName) {
        this.listName = listName;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getPublishedDate() {
        return publishedDate;
    }

    public void setPublishedDate(String publishedDate) {
        this.publishedDate = publishedDate;
    }

    public String getBestsellersDate() {
        return bestsellersDate;
    }

    public void setBestsellersDate(String bestsellersDate) {
        this.bestsellersDate = bestsellersDate;
    }

    public Integer getWeeksOnList() {
        return weeksOnList;
    }

    public void setWeeksOnList(Integer weeksOnList) {
        this.weeksOnList = weeksOnList;
    }

    public Integer getRankLastWeek() {
        return rankLastWeek;
    }

    public void setRankLastWeek(Integer rankLastWeek) {
        this.rankLastWeek = rankLastWeek;
    }

    public Integer getAsterisk() {
        return asterisk;
    }

    public void setAsterisk(Integer asterisk) {
        this.asterisk = asterisk;
    }

    public Integer getDagger() {
        return dagger;
    }

    public void setDagger(Integer dagger) {
        this.dagger = dagger;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(primaryIsbn10);
        dest.writeValue(primaryIsbn13);
        dest.writeValue(rank);
        dest.writeValue(listName);
        dest.writeValue(displayName);
        dest.writeValue(publishedDate);
        dest.writeValue(bestsellersDate);
        dest.writeValue(weeksOnList);
        dest.writeValue(rankLastWeek);
        dest.writeValue(asterisk);
        dest.writeValue(dagger);
    }

    public int describeContents() {
        return  0;
    }

}

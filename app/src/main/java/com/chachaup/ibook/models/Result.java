
package com.chachaup.ibook.models;

import java.util.List;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Result implements Parcelable
{

    @SerializedName("title")
    @Expose
    private String title;
    @SerializedName("description")
    @Expose
    private String description;
    @SerializedName("contributor")
    @Expose
    private String contributor;
    @SerializedName("author")
    @Expose
    private String author;
    @SerializedName("contributor_note")
    @Expose
    private String contributorNote;
    @SerializedName("price")
    @Expose
    private String price;
    @SerializedName("age_group")
    @Expose
    private String ageGroup;
    @SerializedName("publisher")
    @Expose
    private String publisher;
    @SerializedName("isbns")
    @Expose
    private List<Isbn> isbns = null;
    @SerializedName("ranks_history")
    @Expose
    private List<RanksHistory> ranksHistory = null;
    @SerializedName("reviews")
    @Expose
    private List<Review> reviews = null;
    public final static Creator<Result> CREATOR = new Creator<Result>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Result createFromParcel(android.os.Parcel in) {
            return new Result(in);
        }

        public Result[] newArray(int size) {
            return (new Result[size]);
        }

    }
    ;

    protected Result(android.os.Parcel in) {
        this.title = ((String) in.readValue((String.class.getClassLoader())));
        this.description = ((String) in.readValue((String.class.getClassLoader())));
        this.contributor = ((String) in.readValue((String.class.getClassLoader())));
        this.author = ((String) in.readValue((String.class.getClassLoader())));
        this.contributorNote = ((String) in.readValue((String.class.getClassLoader())));
        this.price = ((String) in.readValue((String.class.getClassLoader())));
        this.ageGroup = ((String) in.readValue((String.class.getClassLoader())));
        this.publisher = ((String) in.readValue((String.class.getClassLoader())));
        in.readList(this.isbns, (com.chachaup.ibook.models.Isbn.class.getClassLoader()));
        in.readList(this.ranksHistory, (com.chachaup.ibook.models.RanksHistory.class.getClassLoader()));
        in.readList(this.reviews, (Review.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Result() {
    }

    /**
     * 
     * @param isbns
     * @param ranksHistory
     * @param contributor
     * @param reviews
     * @param author
     * @param contributorNote
     * @param price
     * @param description
     * @param publisher
     * @param ageGroup
     * @param title
     */
    public Result(String title, String description, String contributor, String author, String contributorNote, String price, String ageGroup, String publisher, List<Isbn> isbns, List<RanksHistory> ranksHistory, List<Review> reviews) {
        super();
        this.title = title;
        this.description = description;
        this.contributor = contributor;
        this.author = author;
        this.contributorNote = contributorNote;
        this.price = price;
        this.ageGroup = ageGroup;
        this.publisher = publisher;
        this.isbns = isbns;
        this.ranksHistory = ranksHistory;
        this.reviews = reviews;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getContributor() {
        return contributor;
    }

    public void setContributor(String contributor) {
        this.contributor = contributor;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getContributorNote() {
        return contributorNote;
    }

    public void setContributorNote(String contributorNote) {
        this.contributorNote = contributorNote;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getAgeGroup() {
        return ageGroup;
    }

    public void setAgeGroup(String ageGroup) {
        this.ageGroup = ageGroup;
    }

    public String getPublisher() {
        return publisher;
    }

    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }

    public List<Isbn> getIsbns() {
        return isbns;
    }

    public void setIsbns(List<Isbn> isbns) {
        this.isbns = isbns;
    }

    public List<RanksHistory> getRanksHistory() {
        return ranksHistory;
    }

    public void setRanksHistory(List<RanksHistory> ranksHistory) {
        this.ranksHistory = ranksHistory;
    }

    public List<Review> getReviews() {
        return reviews;
    }

    public void setReviews(List<Review> reviews) {
        this.reviews = reviews;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(title);
        dest.writeValue(description);
        dest.writeValue(contributor);
        dest.writeValue(author);
        dest.writeValue(contributorNote);
        dest.writeValue(price);
        dest.writeValue(ageGroup);
        dest.writeValue(publisher);
        dest.writeList(isbns);
        dest.writeList(ranksHistory);
        dest.writeList(reviews);
    }

    public int describeContents() {
        return  0;
    }

}

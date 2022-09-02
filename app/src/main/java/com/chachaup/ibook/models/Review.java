
package com.chachaup.ibook.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Review implements Parcelable
{

    @SerializedName("book_review_link")
    @Expose
    private String bookReviewLink;
    @SerializedName("first_chapter_link")
    @Expose
    private String firstChapterLink;
    @SerializedName("sunday_review_link")
    @Expose
    private String sundayReviewLink;
    @SerializedName("article_chapter_link")
    @Expose
    private String articleChapterLink;
    public final static Creator<Review> CREATOR = new Creator<Review>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Review createFromParcel(android.os.Parcel in) {
            return new Review(in);
        }

        public Review[] newArray(int size) {
            return (new Review[size]);
        }

    }
    ;

    protected Review(android.os.Parcel in) {
        this.bookReviewLink = ((String) in.readValue((String.class.getClassLoader())));
        this.firstChapterLink = ((String) in.readValue((String.class.getClassLoader())));
        this.sundayReviewLink = ((String) in.readValue((String.class.getClassLoader())));
        this.articleChapterLink = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Review() {
    }

    /**
     * 
     * @param firstChapterLink
     * @param bookReviewLink
     * @param sundayReviewLink
     * @param articleChapterLink
     */
    public Review(String bookReviewLink, String firstChapterLink, String sundayReviewLink, String articleChapterLink) {
        super();
        this.bookReviewLink = bookReviewLink;
        this.firstChapterLink = firstChapterLink;
        this.sundayReviewLink = sundayReviewLink;
        this.articleChapterLink = articleChapterLink;
    }

    public String getBookReviewLink() {
        return bookReviewLink;
    }

    public void setBookReviewLink(String bookReviewLink) {
        this.bookReviewLink = bookReviewLink;
    }

    public String getFirstChapterLink() {
        return firstChapterLink;
    }

    public void setFirstChapterLink(String firstChapterLink) {
        this.firstChapterLink = firstChapterLink;
    }

    public String getSundayReviewLink() {
        return sundayReviewLink;
    }

    public void setSundayReviewLink(String sundayReviewLink) {
        this.sundayReviewLink = sundayReviewLink;
    }

    public String getArticleChapterLink() {
        return articleChapterLink;
    }

    public void setArticleChapterLink(String articleChapterLink) {
        this.articleChapterLink = articleChapterLink;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(bookReviewLink);
        dest.writeValue(firstChapterLink);
        dest.writeValue(sundayReviewLink);
        dest.writeValue(articleChapterLink);
    }

    public int describeContents() {
        return  0;
    }

}

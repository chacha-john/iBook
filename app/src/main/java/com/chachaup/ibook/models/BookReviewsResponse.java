
package com.chachaup.ibook.models;

import java.util.List;
import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class BookReviewsResponse implements Parcelable
{

    @SerializedName("status")
    @Expose
    private String status;
    @SerializedName("copyright")
    @Expose
    private String copyright;
    @SerializedName("num_results")
    @Expose
    private Integer numResults;
    @SerializedName("results")
    @Expose
    private List<Result> results = null;
    public final static Creator<BookReviewsResponse> CREATOR = new Creator<BookReviewsResponse>() {


        @SuppressWarnings({
            "unchecked"
        })
        public BookReviewsResponse createFromParcel(android.os.Parcel in) {
            return new BookReviewsResponse(in);
        }

        public BookReviewsResponse[] newArray(int size) {
            return (new BookReviewsResponse[size]);
        }

    }
    ;

    protected BookReviewsResponse(android.os.Parcel in) {
        this.status = ((String) in.readValue((String.class.getClassLoader())));
        this.copyright = ((String) in.readValue((String.class.getClassLoader())));
        this.numResults = ((Integer) in.readValue((Integer.class.getClassLoader())));
        in.readList(this.results, (Result.class.getClassLoader()));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public BookReviewsResponse() {
    }

    /**
     * 
     * @param copyright
     * @param numResults
     * @param results
     * @param status
     */
    public BookReviewsResponse(String status, String copyright, Integer numResults, List<Result> results) {
        super();
        this.status = status;
        this.copyright = copyright;
        this.numResults = numResults;
        this.results = results;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getCopyright() {
        return copyright;
    }

    public void setCopyright(String copyright) {
        this.copyright = copyright;
    }

    public Integer getNumResults() {
        return numResults;
    }

    public void setNumResults(Integer numResults) {
        this.numResults = numResults;
    }

    public List<Result> getResults() {
        return results;
    }

    public void setResults(List<Result> results) {
        this.results = results;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(status);
        dest.writeValue(copyright);
        dest.writeValue(numResults);
        dest.writeList(results);
    }

    public int describeContents() {
        return  0;
    }

}

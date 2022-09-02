
package com.chachaup.ibook.models;

import javax.annotation.Generated;
import android.os.Parcelable;
import android.os.Parcelable.Creator;
import android.os.Parcelable.Creator;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

@Generated("jsonschema2pojo")
public class Isbn implements Parcelable
{

    @SerializedName("isbn10")
    @Expose
    private String isbn10;
    @SerializedName("isbn13")
    @Expose
    private String isbn13;
    public final static Creator<Isbn> CREATOR = new Creator<Isbn>() {


        @SuppressWarnings({
            "unchecked"
        })
        public Isbn createFromParcel(android.os.Parcel in) {
            return new Isbn(in);
        }

        public Isbn[] newArray(int size) {
            return (new Isbn[size]);
        }

    }
    ;

    protected Isbn(android.os.Parcel in) {
        this.isbn10 = ((String) in.readValue((String.class.getClassLoader())));
        this.isbn13 = ((String) in.readValue((String.class.getClassLoader())));
    }

    /**
     * No args constructor for use in serialization
     * 
     */
    public Isbn() {
    }

    /**
     * 
     * @param isbn13
     * @param isbn10
     */
    public Isbn(String isbn10, String isbn13) {
        super();
        this.isbn10 = isbn10;
        this.isbn13 = isbn13;
    }

    public String getIsbn10() {
        return isbn10;
    }

    public void setIsbn10(String isbn10) {
        this.isbn10 = isbn10;
    }

    public String getIsbn13() {
        return isbn13;
    }

    public void setIsbn13(String isbn13) {
        this.isbn13 = isbn13;
    }

    public void writeToParcel(android.os.Parcel dest, int flags) {
        dest.writeValue(isbn10);
        dest.writeValue(isbn13);
    }

    public int describeContents() {
        return  0;
    }

}

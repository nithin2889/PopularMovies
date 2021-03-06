package com.learnwithme.buildapps.popularmovies.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Review implements Parcelable {
    public static final Creator<Review> CREATOR = new Creator<Review>() {
        @Override
        public Review createFromParcel(Parcel source) {
            Review movieReview = new Review(source);
            return movieReview;
        }

        @Override
        public Review[] newArray(int size) {
            return new Review[size];
        }
    };
    private String id;
    private String author;
    private String content;
    private String url;

    public Review(Parcel source) {
        this.id = source.readString();
        this.author = source.readString();
        this.content = source.readString();
        this.url = source.readString();
    }

    public String getId() {
        return id;
    }

    public String getAuthor() {
        return author;
    }

    public String getContent() {
        return content;
    }

    public String getUrl() {
        return url;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(id);
        dest.writeString(author);
        dest.writeString(content);
        dest.writeString(url);
    }

    @Override
    public int describeContents() {
        return 0;
    }
}
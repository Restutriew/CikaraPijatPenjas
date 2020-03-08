package com.cikarastudio.cikarapijatpenjas.model;

import android.os.Parcel;
import android.os.Parcelable;

public class Massage implements Parcelable {
    private String title;
    private String description;
    private Integer image, video;

    public Massage(Parcel in) {
        title = in.readString();
        description = in.readString();
        if (in.readByte() == 0) {
            image = null;
        } else {
            image = in.readInt();
        }
        if (in.readByte() == 0) {
            video = null;
        } else {
            video = in.readInt();
        }
    }

    public static final Creator<Massage> CREATOR = new Creator<Massage>() {
        @Override
        public Massage createFromParcel(Parcel in) {
            return new Massage(in);
        }

        @Override
        public Massage[] newArray(int size) {
            return new Massage[size];
        }
    };

    public Massage() {

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

    public Integer getImage() {
        return image;
    }

    public void setImage(Integer image) {
        this.image = image;
    }

    public Integer getVideo() {
        return video;
    }

    public void setVideo(Integer video) {
        this.video = video;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel parcel, int i) {
        parcel.writeString(title);
        parcel.writeString(description);
        if (image == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(image);
        }
        if (video == null) {
            parcel.writeByte((byte) 0);
        } else {
            parcel.writeByte((byte) 1);
            parcel.writeInt(video);
        }
    }
}

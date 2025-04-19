package com.example.tugas2

import android.os.Parcel
import android.os.Parcelable

data class item_negara(val gambar : Int, val nama : String, val tahun : String,  val imageSource:Int, val imageTitle:String, val imageDesc:String) : Parcelable {
    constructor(parcel: Parcel) : this(
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!,
        parcel.readInt(),
        parcel.readString()!!,
        parcel.readString()!!
    ) {
    }

    override fun writeToParcel(parcel: Parcel, flags: Int) {
        parcel.writeInt(gambar)
        parcel.writeString(nama)
        parcel.writeString(tahun)
        parcel.writeInt(imageSource)
        parcel.writeString(imageTitle)
        parcel.writeString(imageDesc)
    }

    override fun describeContents(): Int {
        return 0
    }

    companion object CREATOR : Parcelable.Creator<item_negara> {
        override fun createFromParcel(parcel: Parcel): item_negara {
            return item_negara(parcel)
        }

        override fun newArray(size: Int): Array<item_negara?> {
            return arrayOfNulls(size)
        }
    }
}

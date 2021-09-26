package com.lunathemes.imagesproject.model

import android.os.Parcel
import android.os.Parcelable
import kotlinx.parcelize.Parceler
import kotlinx.parcelize.Parcelize

@Parcelize
data class ImagesDb(val url: String?) : Parcelable {

    constructor(parcel: Parcel) : this(parcel.readString())

    companion object : Parceler<ImagesDb> {
        fun getImagesDb(): Array<ImagesDb> {
            return arrayOf(ImagesDb("https://goo.gl/32YN2B"),
                           ImagesDb("https://goo.gl/Wqz4Ev"),
                           ImagesDb("https://goo.gl/U7XXdF"),
                           ImagesDb("https://goo.gl/ghVPFq"),
                           ImagesDb("https://goo.gl/qEaCWe"),
                           ImagesDb("https://goo.gl/vutGmM"))
        }

        override fun ImagesDb.write(parcel: Parcel, flags: Int) {
            parcel.writeString(url)
        }

        override fun create(parcel: Parcel): ImagesDb {
            return ImagesDb(parcel)
        }
    }
}




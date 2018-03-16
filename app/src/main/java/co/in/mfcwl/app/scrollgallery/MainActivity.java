package co.in.mfcwl.app.scrollgallery;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import co.in.mfcwl.app.scrollablegallery.utils.MediaInfo;
import co.in.mfcwl.app.scrollablegallery.utils.PicassoImageLoader;
import co.in.mfcwl.app.scrollablegallery.views.ScrollGalleryView;

public class MainActivity extends AppCompatActivity {

    protected ScrollGalleryView scrollGalleryView;

    private String[] imageUrls = new String[4];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        scrollGalleryView = (ScrollGalleryView) findViewById(R.id.scroll_gallery_view);
        scrollGalleryView
                .setThumbnailSize(200)
                .setZoom(true)
                .setFragmentManager(getSupportFragmentManager());

        imageUrls[0] = "http:\\/\\/res.cloudinary.com\\/ebiztest\\/image\\/upload\\/v1520427684\\/ASSETS\\/REGISTER\\/t1002\\/2018\\/1\\/asset1-20180307_183121.jpg";
        imageUrls[1] = "http:\\/\\/res.cloudinary.com\\/ebiztest\\/image\\/upload\\/v1520427685\\/ASSETS\\/REGISTER\\/t1002\\/2018\\/1\\/asset2-20180307_183125.jpg";
        imageUrls[2] = "http:\\/\\/res.cloudinary.com\\/ebiztest\\/image\\/upload\\/v1520427686\\/ASSETS\\/REGISTER\\/t1002\\/2018\\/1\\/asset3-20180307_183125.jpg";
        imageUrls[3] = "http:\\/\\/res.cloudinary.com\\/ebiztest\\/image\\/upload\\/v1520427687\\/ASSETS\\/REGISTER\\/t1002\\/2018\\/1\\/asset4-20180307_183126.jpg";
        for (String imageUrl : imageUrls) {
            scrollGalleryView.addMedia(
                    MediaInfo.mediaLoader(new PicassoImageLoader(imageUrl))
            );
        }
    }


}

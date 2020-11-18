package com.example.test;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import org.jboss.netty.buffer.ChannelBuffer;
public class BitmapFromCompressedImage  implements
        MessageCallable<Bitmap, sensor_msgs.CompressedImage> {
    @Override
    public Bitmap call(sensor_msgs.CompressedImage message) {
        ChannelBuffer buffer = message.getData();
        byte[] data = buffer.array();
        return BitmapFactory.decodeByteArray(data, buffer.arrayOffset(), buffer.readableBytes());
    }
}

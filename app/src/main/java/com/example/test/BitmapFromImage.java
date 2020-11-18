package com.example.test;
import com.google.common.base.Preconditions;

import android.graphics.Bitmap;
import android.graphics.Color;
import org.jboss.netty.buffer.ChannelBuffer;

public class BitmapFromImage  implements MessageCallable<Bitmap, sensor_msgs.Image>{
    @Override
    public Bitmap call(sensor_msgs.Image message) {
        Preconditions.checkArgument(message.getEncoding().equals("rgb8"));
        Bitmap bitmap =
                Bitmap.createBitmap(message.getWidth(), message.getHeight(),
                        Bitmap.Config.ARGB_8888);
        for (int x = 0; x < message.getWidth(); x++) {
            for (int y = 0; y < message.getHeight(); y++) {
                ChannelBuffer data = message.getData();
                byte red = data.getByte(y * message.getStep() + 3 * x);
                byte green = data.getByte(y * message.getStep() + 3 * x + 1);
                byte blue = data.getByte(y * message.getStep() + 3 * x + 2);
                bitmap.setPixel(x, y, Color.argb(255, red & 0xFF, green & 0xFF, blue & 0xFF));
            }
        }
        return bitmap;
    }

}

package util;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

import java.awt.image.BufferedImage;
import java.io.IOException;
import java.io.InputStream;

import javax.imageio.ImageIO;

import org.junit.Test;

import com.gtnewhorizons.modularui.api.drawable.UITexture;

public class GTNotHardUITexturesTest {

    @Test
    public void wirelessOnTextureExistsInTargetGTNH() throws IOException {
        assertTexture(GTNotHardUITextures.OVERLAY_BUTTON_WIRELESS_ON, "wireless_on");
    }

    @Test
    public void wirelessOffTextureExistsInTargetGTNH() throws IOException {
        assertTexture(GTNotHardUITextures.OVERLAY_BUTTON_WIRELESS_OFF, "wireless_off");
    }

    private void assertTexture(UITexture texture, String name) throws IOException {
        assertEquals("kekztech", texture.location.getResourceDomain());
        assertEquals("textures/gui/overlay_button/" + name + ".png", texture.location.getResourcePath());
        String resource = "/assets/" + texture.location.getResourceDomain() + "/" + texture.location.getResourcePath();
        try (InputStream stream = getClass().getResourceAsStream(resource)) {
            assertNotNull("Missing GTNH texture: " + resource, stream);
            BufferedImage image = ImageIO.read(stream);
            assertNotNull("Invalid GTNH texture: " + resource, image);
            assertTrue(image.getWidth() > 0 && image.getHeight() > 0);
        }
    }
}

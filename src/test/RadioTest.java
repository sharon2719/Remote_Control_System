package test;

import org.junit.jupiter.api.Test;
import org.testng.Assert;
import tv_and_radio.Radio;

import static org.junit.jupiter.api.Assertions.*;

class RadioTest {

    Radio radio = new Radio(100,11,"Radio is turned on",true);
    @Test
    void enableRadioTest() {
        radio.enable();
        Assert.assertTrue(radio.enable());
    }

    @Test
    void disableRadioTest() {
        radio.disable();
        Assert.assertFalse(radio.disable());
    }

    @Test
    void getVolumeRadioTest() {
        radio.getVolume();
        Assert.assertEquals(11,radio.getVolume(),11);
    }

    @Test
    void setVolumeRadioTest() {
        radio.setVolume(10);
        Assert.assertEquals(11,radio.getVolume(),11);
    }

    @Test
    void getChannelRadioTest() {
        radio.getChannel();
        Assert.assertEquals(100,radio.getChannel(),100);
    }

    @Test
    void setChannelRadioTest() {
        radio.setChannel(100);
        Assert.assertEquals(100,radio.getChannel(),100);
    }

    @Test
    void getStatusRadioTest() {
        radio.getStatus();
        Assert.assertEquals("Radio is turned on",radio.getStatus());
    }

    @Test
    void setStatusRadioTest() {
        radio.setStatus("Radio is turned on ");
        Assert.assertEquals("Radio is turned on", radio.getStatus());
    }
}
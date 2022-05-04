package test;

import org.junit.jupiter.api.Test;
import org.testng.Assert;
import tv_and_radio.TV;


class TVTest {
    TV tv = new TV(1, 22, "TV is turned on", true) {
    };

    @Test
    void enableTvTest() {
        tv.enable();
        Assert.assertTrue(tv.enable());
    }

    @Test
    void disableTvTest() {
        tv.disable();
        Assert.assertFalse(tv.disable());
    }

    @Test
    void getVolumeTvTest() {
        tv.getVolume();
        Assert.assertEquals(11,tv.getVolume(),11);
    }

    @Test
    void setVolumeTvTest() {
        tv.setVolume(10);
        Assert.assertEquals(11,tv.getVolume(),11);
    }

    @Test
    void getChannelTvTest() {
        tv.getChannel();
        Assert.assertEquals(1,tv.getChannel(),1);
    }

    @Test
    void setChannelTvTest() {
       tv.setChannel(13);
       Assert.assertEquals(13,tv.getChannel(),13);
    }

    @Test
    void getStatusTvTest() {
        tv.getStatus();
        Assert.assertEquals("TV is turned on",tv.getStatus());
    }

    @Test
    void setStatusTvTest() {
        tv.setStatus("TV is turned on ");
        Assert.assertEquals("TV is turned on",tv.getStatus());
    }
}
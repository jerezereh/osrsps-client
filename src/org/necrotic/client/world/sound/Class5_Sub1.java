package org.necrotic.client.world.sound;

import org.apache.commons.io.FileUtils;

//import sun.audio.AudioPlayer;
import javafx.scene.media.MediaPlayer;
import javafx.scene.media.Media;

import java.io.File;
import java.io.IOException;

public final class Class5_Sub1 extends Class5 {

	private final InputStream_Sub1 anInputStream_Sub1_1310 = new InputStream_Sub1();
	private MediaPlayer player;

	public Class5_Sub1() {
		super(8000);
//		AudioPlayer.player.start(anInputStream_Sub1_1310);
		File audio = new File(anInputStream_Sub1_1310.toString());
		try {
			FileUtils.copyInputStreamToFile(anInputStream_Sub1_1310, audio);
			player = new MediaPlayer(new Media(audio.getAbsolutePath()));
			player.play();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

	@Override
	final void stop() {
//		AudioPlayer.player.stop(anInputStream_Sub1_1310);
		player.stop();
		synchronized (anInputStream_Sub1_1310) {
			anInputStream_Sub1_1310.aBoolean31 = true;
		}
	}

}
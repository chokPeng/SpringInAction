package soundsystem;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
@Component
public class CDPlayer implements MediaPlayer{
	private CompactDisc cDisc;
	//@Autowired
	public CDPlayer(CompactDisc cDisc) {
		this.cDisc=cDisc;
	}
	public void play() {
		cDisc.play();
	}
	public void setCompactDisc(CompactDisc cDisc) {
		this.cDisc=cDisc;
	}
}

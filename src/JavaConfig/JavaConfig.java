package JavaConfig;

import org.springframework.context.annotation.Bean;

import soundsystem.CompactDisc;
import soundsystem.SgtPeppers;

public class JavaConfig {
	@Bean
	public CompactDisc sgtPeppers() {
		return new SgtPeppers();
	}
//	@Bean
//	public CompactDisc randomBeantlesCD() {
//		int choice=(int)Math.floor(Math.random()*4);
//		if(choice==0) {
//			return new SgtPeppers();
//		}else if(choice==1){
//			return new WhiteAlbum();
//		}else if(choice==2) {
//			return HardDaysNight();
//		}else {
//			return new Revolver();
//		}
//	}
}

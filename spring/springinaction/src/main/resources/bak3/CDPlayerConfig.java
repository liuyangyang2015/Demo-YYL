package soundsystem;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class CDPlayerConfig {
  
  @Bean
  public CompactDisc compactDisc() {
    return new SgtPeppers();
  }
  
  @Bean
  public CDPlayer cdPlayer(CompactDisc compactDisc) {
	  CDPlayer cdPlayer = new CDPlayer();
	  cdPlayer.setCompactDisc(compactDisc);
	  return cdPlayer;
  }

}

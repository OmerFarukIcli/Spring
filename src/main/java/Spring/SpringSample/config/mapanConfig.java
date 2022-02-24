package Spring.SpringSample.config;

import org.modelmapper.ModelMapper;
import org.modelmapper.convention.MatchingStrategies;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class mapanConfig {
	
	@Bean
	 public ModelMapper getMapper() {
		 ModelMapper mm=new ModelMapper();
		 mm.getConfiguration().setMatchingStrategy(MatchingStrategies.STRICT);
		 return mm;
	 }
	

}

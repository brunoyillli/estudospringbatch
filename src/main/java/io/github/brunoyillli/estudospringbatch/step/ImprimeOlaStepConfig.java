package io.github.brunoyillli.estudospringbatch.step;

import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import io.github.brunoyillli.estudospringbatch.tasklet.ImprimeOlaTasklet;

@Configuration
public class ImprimeOlaStepConfig {

	@Autowired
	private StepBuilderFactory stepBuilderFactory;
	
	@Bean
	public Step imprimeOlaStep(ImprimeOlaTasklet imprimeOlaTasklet){
		return stepBuilderFactory
				.get("imprimeOlaStep")
				.tasklet(imprimeOlaTasklet.imprimeOlaMethodTasklet(null))
				.build();
	}
	
	
}

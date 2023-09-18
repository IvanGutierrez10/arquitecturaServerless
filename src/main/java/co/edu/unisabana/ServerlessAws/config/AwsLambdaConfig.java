package co.edu.unisabana.ServerlessAws.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;

@Configuration
public class AwsLambdaConfig {

    @Bean(name = "SaludaMundo")
    public Supplier<String> saludar(){
        return () -> "Hola mundo";
    }

    @Bean
    public Consumer<String> mostrarParametro(){
        return (param) -> {
           System.out.println(param);
        };
    }

    @Bean
    public Function<String, String> saludarPersona(){
        return (param) -> {
            String name = param.toUpperCase();
            return "Hola "+name;
        };
    }
}

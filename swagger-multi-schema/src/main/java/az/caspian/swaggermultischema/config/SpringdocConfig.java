package az.caspian.swaggermultischema.config;

import io.swagger.v3.core.jackson.ModelResolver;
import io.swagger.v3.oas.annotations.OpenAPIDefinition;
import io.swagger.v3.oas.annotations.servers.Server;
import io.swagger.v3.oas.models.OpenAPI;
import io.swagger.v3.oas.models.info.Info;
import org.springdoc.core.models.GroupedOpenApi;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
@OpenAPIDefinition(servers = {
        @Server(url = "/")
})
public class SpringdocConfig {

    static {
        ModelResolver.enumsAsRef = true;
    }

    @Bean
    public OpenAPI openApiDocumentation() {
        return new OpenAPI()
                .info(new Info()
                        .title("CRM REST API documentation")
                        .description("REST API documentation")
                        .version("1.0.0"));
    }

    @Bean
    public GroupedOpenApi groupedOpenApi() {
        String[] packagesToScan = {"az.caspian.swaggermultischema.controller"};
        return GroupedOpenApi.builder()
                .group("crm")
                .packagesToScan(packagesToScan)
                .packagesToExclude(
                        "az.caspian.swaggermultischema.controller.telegram",
                        "az.caspian.swaggermultischema.controller.whatsapp",
                        "az.caspian.swaggermultischema.controller.slack",
                        "az.caspian.swaggermultischema.controller.facebook",
                        "az.caspian.swaggermultischema.controller.instagram"
                )
                .build();
    }

    @Bean
    public GroupedOpenApi telegramOpenApiDocumentation() {
        String[] packagesToScan = {"az.caspian.swaggermultischema.controller.telegram"};
        return GroupedOpenApi.builder()
                .group("telegram")
                .packagesToScan(packagesToScan)
                .addOpenApiCustomizer(openApi ->
                        openApi.setInfo(new Info()
                                .title("CRM Telegram Integration")
                                .description("CRM Telegram Integration REST API DOCUMENTATION")
                                .version("1.3.0")))
                .build();
    }

    @Bean
    public GroupedOpenApi facebookOpenApiDocumentation() {
        String[] packagesToScan = {"az.caspian.swaggermultischema.controller.facebook"};
        return GroupedOpenApi.builder()
                .group("facebook")
                .packagesToScan(packagesToScan)
                .addOpenApiCustomizer(openApi ->
                        openApi.setInfo(new Info()
                                .title("CRM Facebook Integration")
                                .description("CRM Facebook Integration REST API DOCUMENTATION")
                                .version("1.3.0")))
                .build();
    }

    @Bean
    public GroupedOpenApi instagramOpenApiDocumentation() {
        String[] packagesToScan = {"az.caspian.swaggermultischema.controller.instagram"};
        return GroupedOpenApi.builder()
                .group("instagram")
                .packagesToScan(packagesToScan)
                .addOpenApiCustomizer(openApi ->
                        openApi.setInfo(new Info()
                                .title("CRM Instagram Integration")
                                .description("CRM Instagram Integration REST API DOCUMENTATION")
                                .version("1.7.0")))
                .build();
    }

    @Bean
    public GroupedOpenApi whatsappOpenApiDocumentation() {
        String[] packagesToScan = {"az.caspian.swaggermultischema.controller.whatsapp"};
        return GroupedOpenApi.builder()
                .group("whatsapp")
                .packagesToScan(packagesToScan)
                .addOpenApiCustomizer(openApi ->
                        openApi.setInfo(new Info()
                                .title("CRM WhatsApp Integration")
                                .description("CRM WhatsApp Integration REST API DOCUMENTATION")
                                .version("1.2.1")))
                .build();
    }

    @Bean
    public GroupedOpenApi slackOpenApiDocumentation() {
        String[] packagesToScan = {"az.caspian.swaggermultischema.controller.slack"};
        return GroupedOpenApi.builder()
                .group("slack")
                .packagesToScan(packagesToScan)
                .addOpenApiCustomizer(openApi ->
                        openApi.setInfo(new Info()
                                .title("CRM Slack Integration")
                                .description("CRM Slack Integration REST API DOCUMENTATION")
                                .version("3.3.2")))
                .build();
    }

}

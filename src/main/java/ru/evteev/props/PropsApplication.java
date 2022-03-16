package ru.evteev.props;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import ru.evteev.props.service.MyService;

@SpringBootApplication
@Slf4j
public class PropsApplication {

    public static void main(String[] args) {

        final SpringApplicationBuilder application = new SpringApplicationBuilder(PropsApplication.class)
                .profiles("INTERNAL", "LOCAL", "EXTERNAL_LOCAL")
                .logStartupInfo(false);
        application.run(args);

        application.context().getBean(MyService.class).lodProps();
    }
}

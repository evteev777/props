package ru.evteev.props.service.impl;

import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Service;
import ru.evteev.props.service.MyService;

@Slf4j
@Service
@RequiredArgsConstructor
public class MyServiceImpl implements MyService {

    private final ApplicationContext context;

    @Value("${total.property}")
    private String totalProperty;

    @Value("${my-service.property1}")
    private String myServiceProperty1;

    @Value("${my-service.property2}")
    private String myServiceProperty2;

    @Value("${internal.property}")
    private String internalProperty;

    @Value("${external.property}")
    private String externalProperty;

    @Override
    public void lodProps() {
        log.warn("(!!!) PROPERTIES");
        log.warn("(!!!) totalProperty      = {}", totalProperty);
        log.warn("(!!!) internalProperty   = {}", internalProperty);
        log.warn("(!!!) myServiceProperty1 = {}", myServiceProperty1);
        log.warn("(!!!) myServiceProperty2 = {}", myServiceProperty2);
        log.warn("(!!!) externalProperty   = {}", externalProperty);
    }
}

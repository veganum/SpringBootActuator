package tech.getarrays.employeemanager.monitoring;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class LoggerService implements HealthIndicator {
    
    private final String LOGGER_SERVICE = "Database Service";

    @Override
    public Health health() {
        if(isLoggerServiceGood()){
            return Health.up().withDetail(LOGGER_SERVICE,"Logger is running").build();
        }

        return Health.up().withDetail(LOGGER_SERVICE,"Logger is not running").build();
    }

    private boolean isLoggerServiceGood(){
        //logic
        return false;
    }
}

package com.company;

import com.company.resources.Resource;
import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;

public class thirdapiApplication extends Application<thirdapiConfiguration> {

    public static void main(final String[] args) throws Exception {
        new thirdapiApplication().run(args);
    }

    @Override
    public String getName() {
        return "thirdapi";
    }

    @Override
    public void initialize(final Bootstrap<thirdapiConfiguration> bootstrap) {
        // TODO: application initialization
    }

    @Override
    public void run(final thirdapiConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application

        environment.jersey().register(new Resource());
    }

}

package io.federecio.dropwizard.swagger.sample;

import io.dropwizard.Application;
import io.dropwizard.setup.Bootstrap;
import io.dropwizard.setup.Environment;
import io.federecio.dropwizard.swagger.SwaggerBundle;
import io.federecio.dropwizard.swagger.SwaggerBundleConfiguration;

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
        bootstrap.addBundle(new SwaggerBundle<thirdapiConfiguration>() {
            @Override
            protected SwaggerBundleConfiguration getSwaggerBundleConfiguration(thirdapiConfiguration sampleConfiguration) {
                // this would be the preferred way to set up swagger, you can also construct the object here programtically if you want
                return sampleConfiguration.swaggerBundleConfiguration;
            }

        });

    }

    @Override
    public void run(final thirdapiConfiguration configuration,
                    final Environment environment) {
        // TODO: implement application

        environment.jersey().register(new Resource());
    }

}

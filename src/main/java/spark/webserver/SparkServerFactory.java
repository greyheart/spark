package spark.webserver;

import spark.route.RouteMatcherFactory;

public class SparkServerFactory {

    public static SparkServer create() {
        MatcherFilter matcherFilter = new MatcherFilter(RouteMatcherFactory.create());
        matcherFilter.init(null);
        JettyHandler handler = new JettyHandler(matcherFilter);
        return new SparkServerImpl(handler);
    }
    
}

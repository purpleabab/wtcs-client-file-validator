package edu.wtcsystem.ws;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;
import java.util.HashSet;
import java.util.Set;

/**
 * The jersey application configuration that tells the application what to do
 *
 *
 * Created by karen.rahmeier on 10/18/2016.
 */
//Defines the base URI for all resource URIs.
@ApplicationPath("/files")
public class ValidatorApplication extends Application{

        //The method returns a non-empty collection with classes, that must be included in the published JAX-RS application
        @Override
        public Set<Class<?>> getClasses() {
            HashSet h = new HashSet<Class<?>>();
            h.add(ClientFileValidator.class);
            return h;
        }
}

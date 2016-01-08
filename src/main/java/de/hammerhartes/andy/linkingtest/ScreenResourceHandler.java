package de.hammerhartes.andy.linkingtest;

import de.hammerhartes.andy.linkingtest.annotations.Path;
import de.hammerhartes.andy.linkingtest.exceptions.NotFoundException;

import java.util.Collections;
import java.util.List;

// Note: Handler methods are just stubs for demonstration purposes
@Path("/prefix")
public class ScreenResourceHandler {

    /* Obviously this would come from a database or something */
    private static final String SCREEN_NAME = "some-screen";

    @Path("/screens")
    public List<String> listAll() {
        return Collections.singletonList(SCREEN_NAME);
    }

    @Path("/screens/{id}")
    public String getScreen(final String id) {
        if (SCREEN_NAME.equals(id)) {
            return SCREEN_NAME;
        }
        throw new NotFoundException();
    }
}
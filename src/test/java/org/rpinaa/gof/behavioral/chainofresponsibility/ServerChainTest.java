package org.rpinaa.gof.behavioral.chainofresponsibility;

import org.junit.Assert;
import org.junit.Test;
import org.rpinaa.gof.behavioral.chainofreponsibility.*;

public class ServerChainTest {

    @Test
    public void logIn_whenAllMiddlewareWereAddedAndLogInWithAnAuthorizeAdminUserAndPass_shouldReturnATrueValueAsSuccess() {

        final Server server = new Server();

        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");


        final Middleware middleware = new ThrottlingMiddleware(2);

        middleware
                .linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        server.setMiddleware(middleware);

        final boolean success = server.logIn("admin@example.com", "admin_pass");

        Assert.assertTrue(success);
    }

    @Test
    public void logIn_whenAllMiddlewareWereAddedAndLogInWithAWrongAuthorizeAdminUserAndPass_shouldReturnAFalseValueAsSuccess() {

        final Server server = new Server();

        server.register("admin@example.com", "admin_pass");
        server.register("user@example.com", "user_pass");


        final Middleware middleware = new ThrottlingMiddleware(2);

        middleware
                .linkWith(new UserExistsMiddleware(server))
                .linkWith(new RoleCheckMiddleware());

        server.setMiddleware(middleware);

        final boolean success = server.logIn("admin@example.com", "user_pass");

        Assert.assertFalse(success);
    }
}

package controller;

import controller.action.session.LoginAction;
import controller.action.session.SessionAction;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/api/login")
public class LoginController extends SessionController<LoginAction> {

    @Override
    public void init() throws ServletException {
        super.init();
        actionClass = LoginAction.class;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        SessionAction login = getAction();
        login.process(req, resp);
    }

}
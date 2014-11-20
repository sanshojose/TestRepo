package controllers;

import com.fasterxml.jackson.databind.node.ObjectNode;
import play.*;
import play.mvc.*;
import play.libs.Json;

import views.html.*;

public class Application extends Controller {

    public static Result index() {
        return ok(index.render("Your new application is ready."));
    }


    public static Result getJsonResult()
    {
        ObjectNode resultNode =  Json.newObject();
        resultNode.put("message", "This is your Json message");

       return ok(resultNode);
    }
}

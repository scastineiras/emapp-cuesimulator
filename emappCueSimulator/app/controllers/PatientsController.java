package controllers;

import java.util.List;

import play.mvc.Controller;
import play.mvc.Result;
import utils.PatientCreator;
import views.html.index;
import domain.Patient;
import static play.libs.Json.toJson;

public class PatientsController extends Controller{

	public static Result index() {
        return ok(index.render("sappi"));
    }
	
	public static Result getPatients() {
	    List<Patient> tasks = PatientCreator.getInstance().createPatients(30);
	    return ok(toJson(tasks));
	}
}

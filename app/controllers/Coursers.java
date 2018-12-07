package controllers;

import play.mvc.With;

@Check("adminer")
@With(Secure.class)
public class Coursers extends  CRUD {
}

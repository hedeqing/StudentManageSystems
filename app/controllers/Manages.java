package controllers;


import play.mvc.With;


@With(Secure.class)
@Check("adminer")
public class Manages extends  CRUD{
}

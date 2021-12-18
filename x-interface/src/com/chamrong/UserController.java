package com.chamrong;

public class UserController implements Crud{
  @Override
  public String create() {
    return "Create";
  }

  @Override
  public String get() {
    return "Get";
  }

  @Override
  public String update() {
    return "Update";
  }

  @Override
  public String delete() {
    return "Delete";
  }
}

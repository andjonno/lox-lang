package org.lox.lox;

public class ReturnJump extends RuntimeException {
  final Object value;

  public ReturnJump(Object value) {
    super(null, null, false, false);
    this.value = value;
  }
}

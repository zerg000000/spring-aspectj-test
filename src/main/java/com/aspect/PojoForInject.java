package com.aspect;

import org.springframework.stereotype.Component;

@Component
public class PojoForInject {
  public void pojo() {
    System.out.println("I am a pojo");
  }
}
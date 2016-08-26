package com.adamx.springmvc.data;


import com.adamx.springmvc.Spitter;

public interface SpitterRepository {

  Spitter save(Spitter spitter);
  
  Spitter findByUsername(String username);

}

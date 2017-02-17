package com.katruk.property;

import java.io.IOException;

public interface Property {

  long cost() throws IOException;

  String name() throws IOException;

}

package org.jooby.gradleDemo;

import org.jooby.Jooby;
import org.jooby.assets.Assets;

public class Main extends Jooby {
  {
    use(new Assets());
    get("/", req ->
      "<html>" +
      "<head>" +
      req.get("base_scripts") +
      "</head>" +
      "<body>Hello World!</body>" +
      "</html>");
  }

  public static void main(final String[] args) {
    run(Main::new, args);
  }
}

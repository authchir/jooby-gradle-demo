/*
 * Copyright 2017 Martin Desharnais
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
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

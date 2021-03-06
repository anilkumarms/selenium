/*
Copyright 2012 Selenium committers
Copyright 2012 Software Freedom Conservancy

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at

     http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.
*/

package org.openqa.selenium.safari;

import static org.junit.Assume.assumeTrue;

import org.openqa.selenium.Platform;
import org.openqa.selenium.StandardSeleniumTests;

import org.junit.BeforeClass;
import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
    AlertTests.class,
    CleanSessionTest.class,
    CrossDomainTest.class,
    SafariExtensionsTest.class,
    StandardSeleniumTests.class,
    WebSocketConnectionTest.class
})
public class SafariDriverTests {

  @BeforeClass
  public static void isSupportedPlatform() {
    Platform current = Platform.getCurrent();
    assumeTrue(Platform.MAC.is(current) || Platform.WINDOWS.is(current));
  }
}

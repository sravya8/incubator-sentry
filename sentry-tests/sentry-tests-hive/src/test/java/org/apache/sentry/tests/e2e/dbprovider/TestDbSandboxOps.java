/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package org.apache.sentry.tests.e2e.dbprovider;

import static org.junit.Assert.assertTrue;

import org.apache.sentry.tests.e2e.hive.AbstractTestWithStaticConfiguration;
import org.apache.sentry.tests.e2e.hive.TestSandboxOps;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

public class TestDbSandboxOps extends TestSandboxOps {
  @Override
  @Before
  public void setup() throws Exception {
    super.setupAdmin();
    super.setup();
  }

  @BeforeClass
  public static void setupTestStaticConfiguration() throws Exception {
    useSentryService = true;
    AbstractTestWithStaticConfiguration.setupTestStaticConfiguration();

  }

  @Ignore
  @Test
  public void testPerDbPolicyOnDFS() throws Exception {
    // TODO : Looks like the test in the base class is specifically meant for
    // File based providers... Since it is assuming that multiple policy files
    // in DFS would be handled by the provider..
  }

}

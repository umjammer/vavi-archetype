/*
 * Copyright (c) ${YEAR} by Naohide Sano, All rights reserved.
 *
 * Programmed by Naohide Sano
 */

package ${package};

import org.junit.jupiter.api.Test;


@EnabledIf("localPropertiesExists")
@PropsEntity(url = "file:local.properties")
class Test1 {

    static boolean localPropertiesExists() {
        return Files.exists(Paths.get("local.properties"));
    }

    @Property(name = "foo.bar")
    String dir = "src/test/resources";

    @BeforeEach
    void setup() throws Exception {
        if (localPropertiesExists()) {
            PropsEntity.Util.bind(this);
        }
    }

    @Test
    //@EnabledIfSystemProperty(named = "vavi.test", matches = "ide")
    void test1() throws Exception {
        System.err.println("Hello World!");
    }
}

/* */

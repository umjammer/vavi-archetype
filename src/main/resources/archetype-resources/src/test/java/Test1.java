/*
 * Copyright (c) 2022 by Naohide Sano, All rights reserved.
 *
 * Programmed by Naohide Sano
 */

package ${package};

import org.junit.jupiter.api.Test;


class Test1 {

    @Test
    //@EnabledIfSystemProperty(named = "vavi.test", matches = "ide")
    void test1() throws Exception {
        System.err.println("Hello World!");
    }
}

/* */

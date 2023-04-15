package com.googlecode.dex2jar.ir.test;

import static org.junit.jupiter.api.Assertions.*;

import com.googlecode.dex2jar.ir.expr.Exprs;
import org.junit.jupiter.api.Test;

public class ConstantStringTest {

    @Test
    public void test() {
        String s = Exprs.nString("a\nb").toString();
        assertEquals("\"a\\nb\"", s);
    }

}

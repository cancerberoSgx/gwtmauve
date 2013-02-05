// Test for method java.lang.Byte.getClass().isSynthetic(Object)

// Copyright (C) 2012 Pavel Tisnovsky <ptisnovs@redhat.com>

// This file is part of Mauve.

// Mauve is free software; you can redistribute it and/or modify
// it under the terms of the GNU General Public License as published by
// the Free Software Foundation; either version 2, or (at your option)
// any later version.

// Mauve is distributed in the hope that it will be useful,
// but WITHOUT ANY WARRANTY; without even the implied warranty of
// MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
// GNU General Public License for more details.

// You should have received a copy of the GNU General Public License
// along with Mauve; see the file COPYING.  If not, write to
// the Free Software Foundation, Inc., 51 Franklin Street,
// Fifth Floor, Boston, MA 02110-1301 USA.

package gnu.testlet.java.lang.Byte.classInfo;

import gnu.testlet.TestHarness;
import gnu.testlet.Testlet;

import java.lang.Byte;



/**
 * Test for method java.lang.Byte.getClass().isSynthetic()
 */
public class isSynthetic implements Testlet
{

    /**
     * Runs the test using the specified harness.
     *
     * @param harness  the test harness (<code>null</code> not permitted).
     */
    public void test(TestHarness harness)
    {
        // create instance of a class Double
        Object o = new Byte((byte)42);

        // get a runtime class of an object "o"
        Class c = o.getClass();

        harness.check(!c.isSynthetic());
    }
}


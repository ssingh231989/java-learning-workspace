package com.interview.hackrank.solution;

public class GarbaseTest {

    public static void main(String args[]) {

    }

    /**
     * A method given to me and asked, when it will be eligible for Garbage Collection, i mean at which line.
     * I believe both o and oa are eligible for garbage collection. Since, they are set to null.
     * Please correct me, if i'm wrong. But, the question was, when it will be eligible for gc,
     * i mean at which line. ?
     * <p>
     * 1)  o = new Float();
     * 2)  oa = new Object[];
     * at this point we have 2 objects.
     * 3) oa[0] = o;
     * at this point oa[0] holds the reference of o.
     * 4)  o = null;
     * o is still being referenced by oa[0]
     * 5)  oa[0] = null
     * o now has zero references.
     * 6)  return o;
     * o is null.
     * o/p = just after line 7
     * @return
     */
    public Object m() {
        Object o = new Float(3.4F);
        Object[] oa = new Object[1];
        oa[0] = o;
        o = null;
        oa[0] = null;
        return o;
    }
}

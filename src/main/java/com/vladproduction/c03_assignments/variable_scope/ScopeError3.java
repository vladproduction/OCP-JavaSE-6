package com.vladproduction.c03_assignments.variable_scope;

public class ScopeError3 {
    public static void main(String[] args) {

        ScopeError3 scopeError3 = new ScopeError3();
        scopeError3.inScope();
        scopeError3.outScope();
    }

    private void inScope() {
        boolean test = false;
        for (int i = 0; i < 5; i++) {
             if(i == 3){
                 test = true;
                 break;
             }
        }
        System.out.println("test (in scope) = " + test); // 'test' is an ex-variable,
                                            // it has ceased to be...
    }

    void outScope() {
        for(int z = 0; z < 5; z++) {
            boolean test = false;
            if(z == 3) {
                test = true;
                break;
            }
        }
//        System.out.print(test); // 'test' is an ex-variable,
        // it has ceased to be...
        System.out.println("'test' has to be in scope of the method");
    }
}

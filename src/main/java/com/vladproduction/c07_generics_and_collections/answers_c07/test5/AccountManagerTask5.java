package com.vladproduction.c07_generics_and_collections.answers_c07.test5;

import java.util.HashMap;
import java.util.Map;

public class AccountManagerTask5 {

//    private Map accountTotals = new HashMap(); //was
    private Map<String, Integer> accountTotals = new HashMap<String, Integer>();// choose B
    private int retirementFund;
    public int getBalance(String accountName) {
        /*Integer total = (Integer) accountTotals.get(accountName);
        if (total == null)
            total = Integer.valueOf(0);
        return total.intValue();*/ //was
        Integer total = accountTotals.get(accountName);
        if (total == null)
            total = 0;
        return total; //E
    }
    public void setBalance(String accountName, int amount) {
//        accountTotals.put(accountName, Integer.valueOf(amount)); //was
        accountTotals.put(accountName, amount);// choose G
    }
}

/*5. Given:
        12. public class AccountManager {
13. private Map accountTotals = new HashMap();
14. private int retirementFund;
15.
        16. public int getBalance(String accountName) {
        17. Integer total = (Integer) accountTotals.get(accountName);
        18. if (total == null)
            19. total = Integer.valueOf(0);
        20. return total.intValue();
        21. }
23. public void setBalance(String accountName, int amount) {
        24. accountTotals.put(accountName, Integer.valueOf(amount));
        25. }
26. }
This class is to be updated to make use of appropriate generic types, with no changes in behavior
        (for better or worse). Which of these steps could be performed? (Choose three.)
A. Replace line 13 with
private Map<String, int> accountTotals = new HashMap<String, int>();
+B. Replace line 13 with
private Map<String, Integer> accountTotals = new HashMap<String, Integer>();
C. Replace line 13 with
private Map<String<Integer>> accountTotals = new HashMap<String<Integer>>();
D. Replace lines 17–20 with
int total = accountTotals.get(accountName);
 if (total == null)
total = 0;
        return total;
+E. Replace lines 17–20 with
Integer total = accountTotals.get(accountName);
 if (total == null)
total = 0;
        return total;
F. Replace lines 17–20 with
 return accountTotals.get(accountName);
+G. Replace line 24 with
 accountTotals.put(accountName, amount);
H. Replace line 24 with
 accountTotals.put(accountName, amount.intValue());*/

/*Answer:
        ✓ B, E, and G are correct.
         A is wrong because you can't use a primitive type as a type parameter. C is wrong because
a Map takes two type parameters separated by a comma. D is wrong because an int can't
autobox to a null, and F is wrong because a null can't unbox to 0. H is wrong because you
can't autobox a primitive just by trying to invoke a method with it. (Objective 6.4)*/

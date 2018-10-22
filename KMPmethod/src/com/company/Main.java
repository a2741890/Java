package com.company;

public class Main {

    public static void main(String[] args) {
        /////////////////////////找出prefixtable/////////////////////////////
        String text[] = {"a", "b", "a", "a", "c", "a", "b", "a", "b", "c"};
        String pattern[] = {"a", "b", "a", "b", "c"};
        int[] prefixTable = new int[pattern.length];
        prefixTable[0] = 0;
        int i = 1;
        int j = 0;

            boolean judge = pattern[j].equals(pattern[i]);

            while (!judge && i < pattern.length) {
                if (j == 0 ) {
                    prefixTable[i] = 0;
                    if (i < pattern.length-1) {
                        i++;
                        judge = pattern[j].equals(pattern[i]);
                    }
                    else{
                        System.out.println(i);
                        break;
                    }
                }
                else {
                    j = prefixTable[j];
                    judge = pattern[j].equals(pattern[i]);
                }
            }
            while (judge && i < pattern.length) {
                if(i < pattern.length - 1) {
                    prefixTable[i] = j + 1;
                    i++;
                    j++;
                    judge = pattern[j].equals(pattern[i]);
                }
                else{
                    break;
                }
            }
        System.out.println(i);
        System.out.println(j);
            for (int k = 0; k < prefixTable.length; k++) {
                System.out.print(prefixTable[k] + " ");

            }

        //////////////////////進行字串的匹配比較//////////////////////////////
        boolean compare = true;
            int k = 0;
            int z = 0;
        int match[] = new int[pattern.length] ;
        while(compare) {

            if (k < pattern.length && z < text.length) {
                if (pattern[k].equals(text[z])) {
                    match[k] = z;
                    System.out.println(z);
                    if(k == pattern.length - 1){
                        System.out.println("The match position in text is :");
                        for(int t=0; t < match.length; t++) {
                            System.out.print( match[t] + " ");
                        }
                        }
                    k++;
                    z++;
                }
                else{
                    if(k == 0) {
                        z++;
                    }
                    else {
                        k = prefixTable[k];
                    }
                    }
            }
            else if(k > pattern.length - 1){
                k = 0;
            }
            else if(z > text.length - 1){
             compare = false;
            }
        }
        }



    }



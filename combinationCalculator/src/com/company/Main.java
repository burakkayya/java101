package com.company;

public class Main {

    public static void main(String[] args) {
        int combination,nfaktorial=0,rfaktorial=0,nrfaktorial=0;
        int n=10,r=2,total1=1,total2=1,total3=1;

        for (int i = 1; i <=n ; i++) {
            total1=total1*i;
            nfaktorial=total1;

        }   System.out.println(nfaktorial);

        for (int i = 1; i <=r ; i++) {
            total2=total2*i;
            rfaktorial=total2;

        } System.out.println(rfaktorial);


        for (int i = 1; i <=(n-r) ; i++) {
            total3=total3*i;
            nrfaktorial=total3;

        }  System.out.println(nrfaktorial);

        combination=nfaktorial/(rfaktorial*nrfaktorial);
        System.out.println(n +" element-numbered cumene "+ r +" combination of subsets with number of elements = " + combination);
    }
}
